package Lesson4;
//task score 100%
//correctness 100%
//performance 100%
import java.util.HashSet;

/**
 *
 * @author papan
 */
public class PermCheck 
{
    public int solution(int[] A)
    {
        HashSet <Integer> set=new HashSet<>();
        for(int i=1;i<=A.length;i++)
            set.add(i);
        for(int a:A)
        {
            if(!set.remove(new Integer(a)))
                return 0;
        }    
        return 1;
    }


    public static void main(String[] args) 
    {
        int [] A={7, 2, 1, 4, 5, 6};
        System.out.println(new PermCheck().solution(A));
    }
}