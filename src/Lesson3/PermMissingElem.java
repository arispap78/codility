package Lesson3;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.HashSet;

public class PermMissingElem 
{
    public int solution(int[] A)
    {
        HashSet <Integer> set=new HashSet<Integer>();
        int result=0;
        for(int i=1;i<=A.length+1;i++)
        {
            set.add(i);
        }
        for(int a:A)
        {
                set.remove(new Integer(a));
        }
        return set.iterator().next();
    }
    public static void main(String[] args) 
    {
        int [] A={1, 2, 3, 4, 5, 6, 8};
        System.out.println(new PermMissingElem().solution(A));
    } 
}