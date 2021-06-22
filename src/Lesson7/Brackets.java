package Lesson7;
/**
 *
 * @author arispap78
 */
//<editor-fold>
/**
A string S consisting of N characters is considered to be properly nested if any 
of the following conditions is true:
S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:class Solution { public int solution(String S); }
that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", 
the function should return 0, as explained above.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
 */
//</editor-fold>
import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets
        
{
    public int solution(String S)
    {
        Deque<Character> deque = new ArrayDeque<>();
        if(S.length()==0)
            return 1;
        for(int i = 0; i < S.length(); i++) 
        {
            char c = S.charAt(i);
            if(c=='}')
            {
                if(deque.getFirst().equals('{'))
                    deque.removeFirst();
                else
                    return 0;
            }
            else if(c==']')
            {
                if(deque.getFirst().equals('['))
                    deque.removeFirst();
                else
                    return 0;
            }
            else if(c==')')
            {
                if(deque.getFirst().equals('('))
                    deque.removeFirst();
                else
                    return 0;
            }
            else
                deque.push(c);
            if(deque.isEmpty())
            {
                if(i==S.length()-1)
                    return 1;
                else
                    return 0;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) 
    {
        String bra="{([()[]])}";
        System.out.println(new Brackets().solution(bra));
    }
}
