package tr.istiklal.edu.yazilim.fan;

public class Fan {
    
public static final int SLOW = 1;
public static final int MEDIUM = 2;
public static final int FAST = 3;
    
private int speed;
private double radius;
private boolean on;
private String color;

public Fan(){//construvter
 this.speed= SLOW;
 this.radius=5.0;
 this.on=false;
 this.color="mavi";
 
}

public int getSpeed(){
    return speed;
}

public void setSpeed(int speed){
    this.speed = speed;
}

public boolean isOn(){
    return on;
}

public void setOn(boolean on){
    this.on = on;
}

public double getRadius(){
    return radius;
}

public void setRadius(double radius){
    this.radius = radius;
}

public String getColor(){
    return color;
}

public void setColor(String color){
    this.color = color;
}

public String toString(){
    if(on){
        return "Fan acik -> Hizi: " + speed + ", Renk: " + color + ", Yaricap: " +radius;   
    }else{
        return "Fan kapali -> Renk: " + color + ", Yaricap: " +radius;   
    }
}
}
