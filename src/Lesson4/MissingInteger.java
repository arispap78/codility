package Lesson4;

/**
 *@author arispap78
 *task score 100%
 *correctness 100%
 *performance 100%
 */
//<editor-fold>
/**
Write a function:class Solution { public int solution(int[] A); }
that, given an array A of N integers, returns the smallest positive integer (greater than 0) 
that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
//</editor-fold>
import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger
{
    public int solution(int[] A)
    {
        HashSet <Integer> set=new HashSet<Integer>();
        int result=0;
        Arrays.sort(A);
        int last=A[A.length-1];
        if(last<0)
            return 1;
        for(int a:A)
            set.add(a);
        for(int i=1;i<=set.size();i++)
        {
            if(!set.contains(new Integer(i)))
                return i;
        }
        return last+1;
        
    }
    public static void main(String[] args) 
    {
        int [] A={1,3,6,4,1,2};
        System.out.println(new MissingInteger().solution(A));
    }
}
