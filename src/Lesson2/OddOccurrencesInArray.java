package Lesson2;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.HashSet;

public class OddOccurrencesInArray
{
    public int solution(int[] A) 
    {
        HashSet <Integer> set=new HashSet<Integer>();
        for(int a:A)
        {
            if(!set.add(a))
                set.remove(new Integer(a));
        }
        return set.iterator().next();
    }
    public static void main(String[] args) 
    {
        int [] A={3, 4, 4, 6, 4, 6, 4, 3, 7, 7, 9};
        System.out.println(new OddOccurrencesInArray().solution(A));
    }
}
