
package tr.istiklal.edu.yazilim.date;

import java.util.Date;

public class Date_Time {
   
    public static void main(String[] args) {
        Date date = new Date();
        
        
        long[] sayac ={10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L};
        
        
        for(long time : sayac){
            date.setTime(time);
            System.out.println("Gecen sure "+ time + "ms "+ date.toString());
        }
 }
    }
    

