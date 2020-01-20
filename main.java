
/**
 * Runs the game!
 *
 * Hunter Stewart
 * 1.0
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class main
{
    public static Scanner reader = new Scanner(System.in);
    public static Random lotto = new Random();
    
    public static void main(String [] args) throws IOException{
        int year = 0;
        int choice;

        Character main = Character.createCharacter();
        Character dad = new Character(Character.newFirstMaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Male", lotto.nextInt(27) + 18, lotto.nextInt(100000));
        Character mom = new Character(Character.newFirstFemaleName(), dad.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Female", lotto.nextInt(17) + 18, lotto.nextInt(100000));
        
        int siblingNum = lotto.nextInt(4);
        Character[] siblings = new Character[siblingNum];    
        
        for (int i = siblingNum; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                siblings[i] = new Character(Character.newFirstMaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1); 
            }
            else {
                siblings[i] = new Character(Character.newFirstFemaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1);
            }
        }
        
        Character[] everyoneElse = new Character[100];
        
        for (int i = 100; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                everyoneElse[i] = new Character(Character.newFirstMaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(50) + 1, lotto.nextInt(100000)); 
            }
            else {
                everyoneElse[i] = new Character(Character.newFirstFemaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(50) + 1, lotto.nextInt(100000));
            }
        }
        
        while (main.isAlive()){
            if(main.getHealth() <= 0){
                main.kill();
            }
            if(lotto.nextInt(25) == 0 && main.isAlive()){
                randomEvents.getEvent(main);
            }
            if (main.isAlive()){
                year++;
                main.Age();
                dad.Age();
                mom.Age();
                for (int i = siblingNum; i > 0; i--){
                    siblings[i].Age();
                }
                for (int i = 100; i > 0; i--){
                    everyoneElse[i].Age();
                }
            }
        }
        
        System.out.println("You are dead!"); 
        System.out.println(main);
    }
}
