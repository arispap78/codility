package Lesson5;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

public class PassingCars 
{
    public int solution(int[] A)
    {
        int cnt=0;
        int sum=0;
        int east=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==1)
                continue;
            else
            {
                east=i;
                for(int j=i;j<A.length;j++)
                {
                    if(A[j]==1)
                        cnt++;
                }
            }
            sum+=cnt;
            break;
        }
        for(int j=east+1;j<A.length;j++)
        {
            if(A[j]==1)
                cnt--;
            else
            {
                sum+=cnt;  
            }
        }
 
        if(sum>1000000000||sum<0)
            return -1;
        return sum;
    }
    
    public static void main(String[] args) 
    {
        int [] A={1,0,1,0,1,1};
        System.out.println(new PassingCars().solution(A));
    } 
}
