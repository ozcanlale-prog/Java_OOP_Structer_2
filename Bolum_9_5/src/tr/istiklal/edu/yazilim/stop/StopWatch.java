
package tr.istiklal.edu.yazilim.stop;


public class StopWatch {
    private long startTime;
    private long  endTime;
    
    public StopWatch(){
    startTime = System.currentTimeMillis();
    }
    
    
    public void start(){
        startTime = System.currentTimeMillis();
    }
        
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    
    public long getElapsedTime(){
        return endTime - startTime;
    }
    
    public long getEndTime(){
        return endTime;
    }
        private String getStartTime() {
        return null;
    }
    public static void main(String[] args){
        
        StopWatch watch = new StopWatch();
        
        System.out.println("Baslangic: " + watch.getStartTime() + " Son (Bitis): " + watch.getEndTime() + " Gecen Sure: " + watch.getElapsedTime() + " ms");
    }


}
