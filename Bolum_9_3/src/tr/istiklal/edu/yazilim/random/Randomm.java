
package tr.istiklal.edu.yazilim.random;

import java.util.Random; 

public class Randomm {
    
    
    public static void main(String[] args){
        Random random = new Random(1000);
        
        for (int i = 0; i < 50; i++) {
            int rastgeleSayi = random.nextInt(100);
            System.out.println(rastgeleSayi);
        }
        
    }
}
