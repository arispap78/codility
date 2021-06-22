package Lesson6;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.HashSet;

public class Distinct
{
   public int solution(int[] A)
   {
       HashSet <Integer> set=new HashSet<Integer>();
       for(int a:A)
       {
           set.add(a);
       }
       return set.size();
   }
   
   public static void main(String[] args) 
    {
        int [] A={4,4,4,1,4,2,3,4,5,4};
        System.out.println(new Distinct().solution(A));
    }
}
