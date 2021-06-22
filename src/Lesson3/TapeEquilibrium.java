package Lesson3;
//task score 100%
//correctness 100%
//performance 100%
/**
 *
 * @author papan
 */
public class TapeEquilibrium 
{
    public int solution(int[] A)
    {
        int index=0;
        int sum=0;
        int left=0;
        int right=0;
        int result=0;
        int min=Integer.MAX_VALUE;
        for(int a:A)
            sum+=a;
        right=sum;
        for(int a=0;a<A.length-1;a++)
        {
            left+=A[a];
            right-=A[a];
            result=Math.abs(right-left);
            System.out.println(result);
            if(result<min){
                min=result;
            }
        }
        return min;
    }

    public static void main(String[] args) 
    {
        int [] A={3,1,2,4,3};
        System.out.println(new TapeEquilibrium().solution(A));
    } 
}