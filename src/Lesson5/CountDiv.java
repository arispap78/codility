package Lesson5;

//task score 100%
//correctness 100%
//performance 100%
/**
 *
 * @author papan
 */
public class CountDiv 
{
    public int solution(int A, int B, int K)
    {
        int cnt=0;
        for(int i=A;i<=B;i++)
        {
           if(i%K==0)
           {
               cnt=(B-i)/K+1;
               return cnt;
           }
           
        }
        return cnt;   
    }
    
    public static void main(String[] args) 
    {
        System.out.println(new CountDiv().solution(11,345,17));
    }  
}
