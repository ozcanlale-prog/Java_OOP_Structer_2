package tr.istiklal.edu.yazilim.regular;


public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;
    
    //Parametresiz kurucu metodum constructer
   public RegularPolygon(){
     this.n = 3;
     this.side= 1.0;
     this.x = 0.0;
     this.y = 0.0;
    }
    public RegularPolygon(int n, double side){
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }
    //Parametreli kurucu metodum constructer    
    public RegularPolygon(int n, double side, double x, double y){
     this.n = n;
     this.side= side;
     this.x = x;
     this.y = y;
    }
    
    //Metotlarim
    
    public int setN(int n){
      return  this.n =n;
    }
    public int getN(int n){
      return  n = this.n ;
    }
    
    public double setSide(double side){
      return  this.side = side;
    }
    public double getSide(double side){
      return  side = this.side ;
    }
    
    public double getX(double side){
      return  x = this.x ;
    }
    
    public double getY(double side){
      return  y = this.y ;
    }
    
    public double getPerimeter(){
        double cevre;
        return  cevre = n*side;
    }
    
    public double getArea(){
        double alan;
        return alan = (n*Math.pow(side,2))/(4.0*Math.tan(Math.PI/n));
    }
    
}

