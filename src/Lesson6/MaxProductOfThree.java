package Lesson6;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.Arrays;

public class MaxProductOfThree
{
    public int solution(int[] A)
    {
        Arrays.sort(A);
        int right=A[A.length-3]*A[A.length-2]*A[A.length-1];
        int left=A[0]*A[1]*A[A.length-1];
        if(left>=right)
            return left;
        return right;
    }
    
    public static void main(String[] args) 
    {
        int [] A={4,-4,-2,1,4,2,3,-4,-5,4};
        System.out.println(new MaxProductOfThree().solution(A));
    }
}
//Detected time complexity:O(N * log(N))
