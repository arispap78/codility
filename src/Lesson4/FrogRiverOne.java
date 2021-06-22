package Lesson4;


import java.util.HashSet;

/**
 *
 * @author papan
 */
public class FrogRiverOne
{
    public int solution(int X, int[] A)
    {
        HashSet <Integer> set=new HashSet<>();
        int result=-1;
        for(int j=0;j<A.length;j++)
        {
            if(A[j]==X)
            {
                for(int k=0;k<=j;k++)
                { 
                    set.add(A[k]);
                }
                System.out.println(set.size());
                if(set.size()==X)
                    return j;
            }
        }return result;
    } 
              
    public static void main(String[] args) 
    {
        int [] A={4,4,4,1,4,2,3,4,5,4};
        System.out.println(new FrogRiverOne().solution(4,A));
    }
//    int steps = X;
//        boolean[] bitmap = new boolean[steps+1];
//        for(int i = 0; i < A.length; i++){
//            if(!bitmap[A[i]]){
//                bitmap[A[i]] = true;
//                steps--;
//                if(steps == 0) return i;
//            }
//
//        }
//        return -1;
}
