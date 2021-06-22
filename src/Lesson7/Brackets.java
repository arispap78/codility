package Lesson7;
/**
 *
 * @author arispap78
 */

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
