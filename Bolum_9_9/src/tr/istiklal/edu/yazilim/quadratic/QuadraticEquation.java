package tr.istiklal.edu.yazilim.quadratic;


public class QuadraticEquation {

    private double a;
    private double b;
    private double c;
    
public QuadraticEquation(){
    this.a = 1.0;
    this.b = 2.0;
    this.c = 3.0;
}

public QuadraticEquation(double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;
}    

public  double getRoot1(){
    double dsc  = Math.pow(b,2) - 4*a*c;
    if(dsc<0){
        System.out.println("Kok yoktur.");
        return 0;
    }
    double r1  = (-b + Math.sqrt(dsc))/(2*a);
    System.out.println(r1);
    return r1;
}

public  double getRoot2(){
    double dsc = Math.pow(b, 2) - 4*a*c;
    if(dsc<0){
        System.out.println("Kok yoktur.");
        return 0;
    }
    double r2 = (-b - Math.sqrt(dsc))/(2*a);
    System.out.println(r2);
    return r2 ;
}

public  double getDiscriminant(){
    double dsc = Math.pow(b, 2) - 4*a*c;
    System.out.println(dsc);
    return dsc ;
}


}
