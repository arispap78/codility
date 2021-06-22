package Lesson6;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */
//<editor-fold>
/**
Write a function:class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
//</editor-fold>
import java.util.HashSet;

public class Distinct
{
   public int solution(int[] A)
   {
       HashSet <Integer> set=new HashSet<Integer>();
       for(int a:A)
       {
           set.add(a);
       }
       return set.size();
   }
   
   public static void main(String[] args) 
    {
        int [] A={4,4,4,1,4,2,3,4,5,4};
        System.out.println(new Distinct().solution(A));
    }
}
