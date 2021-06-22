package Lesson3;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */
//<editor-fold>
/**
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */
//</editor-fold>
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