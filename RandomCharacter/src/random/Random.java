
package random;

public class Random {
    long temp;
    
    public long Random()
    {    
        
        temp = System.nanoTime() % 99;
        
        return temp;
    }
        
    
}
