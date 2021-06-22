package Lesson5;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

public class MinAvgTwoSlice
{
    public int solution(int[] A)
    {
        int ave=Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        int start=0;
        for(int i=0;i<A.length-1;i++)
        {
            ave=(A[i]+A[i+1])*3;
            if(ave<min)
            {
                min=ave;
                start=i;
            }
        }
        for(int j=0;j<A.length-2;j++)
        {
            ave=(A[j]+A[j+1]+A[j+2])*2;
            if(ave==min&&j<start)
            {
                min=ave;
                start=j;
            }
            if(ave<min)
            {
                min=ave;
                start=j;
            }
        } 
        return start;     
    }
    
    public static void main(String[] args) 
    {
        int [] A={4,2,2,5,1,5,8};
        System.out.println(new MinAvgTwoSlice().solution(A));
    }
}
