package Lesson5;

/**
 *
 * @author arispap78
 * task score 100%
 * correctness 100%
 * performance 100%
 */
/**
A non-empty array A consisting of N integers is given. The consecutive elements of array A represent
consecutive cars on a road.

Array A contains only 0s and/or 1s:
0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.

For example, consider array A such that:
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

Write a function:class Solution { public int solution(int[] A); }
that, given a non-empty array A of N integers, returns the number of pairs of passing cars.
The function should return −1 if the number of pairs of passing cars exceeds 1,000,000,000.

For example, given:
  A[0] = 0
  A[1] = 1
  A[2] = 0
  A[3] = 1
  A[4] = 1
the function should return 5, as explained above.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.
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
