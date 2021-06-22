package Lesson3;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

public class FrogJmp 
{
    public int solution(int X, int Y, int D)
    {
        double result= Math.ceil(((Y-X)/(double)D));
        return (int)result;
    }
    public static void main(String[] args) 
    {
        System.out.println(new FrogJmp().solution(10,225,30));
    }  
}
