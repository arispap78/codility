package Lesson3;

/**
 *
 * @author arispap78
 */

import java.util.Arrays;

public class test1 
{
    public String solution(int A, int B, int C, int D, int E, int F)
    {
        int[] time={A,B,C,D,E,F};
        Arrays.sort(time);
        int limit=10 * time[0] + time[1];
        if(time[0]>2)
            return "NOT POSIBLE";
        if (limit < 24)
        {
            if (time[4] < 6)
                return ""+ time[0] + time[1] + ":" + time[2] + time[3] + ":" + time[4] + time[5];
            else if (time[3] < 6) 
                return ""+ time[0] + time[1] + ":" + time[2] + time[4] + ":" + time[3] + time[5];
            else if (time[2] < 6) 
            { 
                if (10 * time[0] + time[3] < 24)
                    return ""+ time[0] + time[3] + ":" + time[1] + time[4] + ":" + time[2] + time[5];
            } 
        } 
        return "NOT POSSIBLE";
    }
    
    public static void main(String[] args) 
    {
        System.out.println(new test1().solution(0,0,0,7,8,9));
    }
}
