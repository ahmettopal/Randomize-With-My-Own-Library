
package testprogram;

import random.RandomCharacter;

public class TestProgram {

    public static void main(String[] args) throws InterruptedException {
        RandomCharacter k = new RandomCharacter();
             
        System.out.print("Random Character: ");
        System.out.println(k.RandomCharacter());
        
        System.out.print("Random Character: ");
        System.out.println(k.RandomCharacter());
              
        System.out.println(k.LongRandomCharacter(2));
        System.out.println(k.LongRandomCharacter(2));
        
        System.out.println(k.FindIntermediateValue(3 ,'a', 'k'));
        System.out.println(k.FindIntermediateValue( 3 ,'a', 'k'));
             
        System.out.println(k.CharactersBetweenChars(2, 'a', 'f' , 't' , 'h'));
        System.out.println(k.CharactersBetweenChars(2, 'a', 'f' , 't' , 'h'));
        System.out.println(k.CharactersBetweenChars(2, 'a', 'f' , 't' , 'h'));
        
        System.out.print("Sentence: ");
        System.out.println(k.RandomSentence(5));
    }
    
}
