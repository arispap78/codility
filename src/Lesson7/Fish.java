package Lesson7;


/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */

import java.util.Stack;

public class Fish 
{
    public int solution(int[] A, int[] B)
    {
        Stack<Integer> stack = new Stack<>(); 
        int cnt=0;       
        for(int j=0;j<A.length;j++)
        {
            if(B[j]==1)
                stack.push(A[j]);
            else
                while(!stack.isEmpty())
                {
                    if(A[j]>stack.peek())
                        stack.pop();
                    else
                        break;
                }
            if(stack.isEmpty())
                cnt++;
        }
        return cnt+stack.size();    
    }
    
    public static void main(String[] args) 
    {
        int [] A={4,3,2,1,5};
        int [] B={0,1,0,0,0};
        System.out.println(new Fish().solution(A,B));
    }
}
//Detected time complexity:O(N)
