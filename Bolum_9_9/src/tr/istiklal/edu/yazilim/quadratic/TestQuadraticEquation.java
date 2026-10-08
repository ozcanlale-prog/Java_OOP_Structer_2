

package tr.istiklal.edu.yazilim.quadratic;


public class TestQuadraticEquation {
 
    public static void main(String[] args){
        
      
    QuadraticEquation qua1 = new QuadraticEquation();
    QuadraticEquation qua2 = new QuadraticEquation(3.0,4.0,5.0);
    QuadraticEquation qua3 = new QuadraticEquation(5.0,12.0,13.0);
  
        qua1.getRoot1();
        qua1.getRoot2();
        qua1.getDiscriminant();
        
        qua2.getRoot1();
        qua2.getRoot2();
        qua2.getDiscriminant();
    
        qua3.getRoot1();
        qua3.getRoot2();
        qua3.getDiscriminant();
    
    }
    

}
