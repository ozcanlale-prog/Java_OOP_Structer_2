package tr.istiklal.edu.yazilim.fan;



public class TestFan {

    public static void main(String[] args){
    
        Fan fan1 = new Fan();
        
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10.0);
        fan1.setColor("kirmizi");
        fan1.setOn(true);
        
        
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        
        
        System.out.println("Fan Durumu");
        System.out.println(fan2.toString());
    }


    
}
