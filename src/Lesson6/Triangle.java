package Lesson6;
/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.Arrays;

public class Triangle 
{
    public int solution(int[] A)
    {
        Arrays.sort(A);
        for(int i=A.length-1;i>1;i--)
        {
            if(A[i-2]>0)
            {
                if(A[i-2]>A[i]-A[i-1])
                    return 1;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) 
    {
        int [] A={10,2,5,1};
        System.out.println(new Triangle().solution(A));
    } 
    
}
//Detected time complexity:O(N*log(N))
