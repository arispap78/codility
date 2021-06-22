package Lesson1;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 */

public class BinaryGap 
{
    public int solution(int N) {
        int a=N;
        boolean one=false;
        int cnt=0;
        int max=0;
        while(a!=0)
        {
            if(cnt>max)
                max=cnt;
            if(a%2==1)
            {
                one=true;
                cnt=0;
            }
            else if(one&&(a%2==0))
            {
                cnt++;
            }
            a=a/2;
        }return max;
    }
    public static void main(String[] args) 
    {
        System.out.println(new BinaryGap().solution(15));
    }  
}
