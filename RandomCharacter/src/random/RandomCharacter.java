
package random;

public class RandomCharacter extends Random
{
    char character;
    long value;
    public char RandomCharacter()
    {
        value = Random();
        if (value < 0) { 
            value = value*(-1);
        }
        
        if (value % 3 == 0) { 
            value = ((value%26)+65);
        }
        else{
         
            value = ((value%26)+97);
        }
        character = (char)value;
        return character;
    }
    
    public String LongRandomCharacter(int piece) 
    {
        //char karakterler;
        String value= "";
        System.out.print("Random " + piece + " Character: ");
        for (int i = 0; i < piece; i++) {
            value += RandomCharacter();
        }
        return value;
    }
    
    public String FindIntermediateValue(int piece, char temp, char temp1)
    {       
        char character = RandomCharacter();
        String value = "";                           //a            k                
        System.out.print("Given 2 characters " + "("+temp + "," + temp1+"): ");
        
        int i = 0;
        while(i < piece )
        {
            if (character > temp && character < temp1) 
            {
                value += character;   
                i++;
            }
            character = RandomCharacter();           
        }  
        return value;
    }
    
    public String CharactersBetweenChars(int piece, char... temp) throws InterruptedException
    {   
        System.out.print("Stated Character: (");
        for (int i = 0; i < temp.length; i++) 
        {   
            System.out.print(temp[i]);
            if(i+1 != temp.length)
	    {
		System.out.print(",");
	    }
        }
        System.out.print("):");
              
        String value = "";
        for (int i = 0; i < piece; i++) 
        {
            long miliSecond= System.currentTimeMillis() % 99;
            long nanoSecond = System.nanoTime() % 99;
            Thread.sleep(miliSecond);
            
           //NanoTime might be - value.
	    if(nanoSecond < 0)	
	    {
		nanoSecond = nanoSecond * (-1);
	    }
															//temp char dizimizin adi.
	    nanoSecond = nanoSecond % 10;
            if (nanoSecond > temp.length-1) 
            {
                i--;
            }
            else
            {
                value += temp[(int)nanoSecond];
            }      
        }
        return value;
    }
    
    public String RandomSentence(int piece)
    {
        int counter=0;
        String sentence = "";
              
        while(counter < piece) 
        {
            int length =  (int)System.nanoTime();
            if (length < 0)  
            {
                length = length * (-1);
            }
            length = length % 9;
            
            for (int i = 0; i < length; i++) 
            {
                char k = RandomCharacter();
                sentence += k;
            }
            
            if (counter != piece)  
            {
                sentence += " ";
            }
            counter++;
        }
        return sentence;
    }
}
