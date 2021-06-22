package Lesson2;


//task score 100%
//correctness 100%
/**
 *
 * @author papan
 */
public class CyclicRotation 
{
    public int[] solution(int[] A, int K) 
    {
        int temp=0;
        if(K==A.length||K==0||A.length==0)
            return A;
        int index=A.length-1;
        for(int i=0;i<K;i++)
        {
            temp=A[index];
            for(int j=index;j>0;j--)
            {
                A[j]=A[j-1];
            } 
            A[0]=temp;
        }
        return A;
    }
    public static void main(String[] args) 
    {
        int [] A={3, 4, 5, 6, 7};
        for(int a:new CyclicRotation().solution(A,4))
            System.out.println(a);
    }
}
