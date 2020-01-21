
/**
 * Write a description of class death here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class death
{   
    public static void lessThanZeroDeath(Character character) throws IOException{
    Scanner reader = new Scanner(new File("texts/death.txt"));
    Scanner readerTwo = new Scanner(new File("texts/death.txt")); 
    int arrayCount = 0;
    while(reader.hasNext()){
        reader.nextLine();
        arrayCount++;
    }   
    String[] key = new String[arrayCount];
    int count = 0;
    while (readerTwo.hasNext()){
        String stringuno = readerTwo.nextLine();
        key[count] = stringuno;
        count++;
    }
    
    Random lotto = new Random();
    character.setDeath(key[lotto.nextInt(count)]);
}
}

