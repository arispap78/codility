package Lesson3;

/**
 *
 * @author arispap78
 */

import java.util.HashMap;

public class test2
{
    public int solution(String S)
    {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        int totaltime=0;
        int totalcost=0;
        String duration="";
        String []time=new String[3];
        String []phonenumber=new String[3];
        String number="";
        int phone=0;
        String []call=new String[2];
        String[] bill = S.split("\\n");
        int maxDuration=0;
        System.out.println(bill[0]);
        int cost=0;
        for(String a:bill)
            call=a.split(",");
            duration=call[0];
            number=call[1];
            phonenumber=number.split("-");
            number=phonenumber[0]+phonenumber[1]+phonenumber[2];
            phone=Integer.parseInt(number);
            time=duration.split("duration");
            totaltime=Integer.parseInt(time[0])*3600+Integer.parseInt(time[1])*60+Integer.parseInt(time[2]);
//            map.put(phone, totaltime);
            if(totaltime<300)
                cost=totaltime*3;
            else
                cost=totaltime*150/60;
            totalcost+=cost;
            
        return totalcost;
    }
    
    public static void main(String[] args) 
    {
        String A="00:01:07,400-234-090\n00:05:01,701-080-080\n00:05:00,400-234-090";
        System.out.println(new test2().solution(A));
    } 
}
