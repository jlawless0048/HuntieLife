
/**
 * Generates a random event!
 *
 * Hunter Stewart
 * 1.0
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class randomEvents
{
    static Scanner reader2 = new Scanner(System.in);
    static Random lotto = new Random();
    
    public void getEvent(Character m){
        
    }
    public static void animalAttack(Character m)throws IOException{
        int choice;
        
        Character main = m;
        Scanner reader = new Scanner(new File("animalAttack.txt"));

        while (reader.hasNextLine())
        {
            System.out.println(reader.nextLine());
        }
        
        choice = reader2.nextInt();
        if(choice == 1){
            System.out.println("Why in god's name did you think you could outrun a wolf?");
            main.kill();
        }
        else if (choice == 2){
            if(main.getAtheleticism() > 80){
                System.out.println("You killed an innocent wolf in the most brutal way possible! Congrats!");
            }
            else if (main.getAtheleticism() > 50){
                System.out.println("You managed to injure the wolf and escape! But not without a few scratches!");
                main.setHealth(main.getHealth() - (lotto.nextInt(30) + 20));
            }
            else {
                System.out.println("You gave it a valiant effort! But you were mauled by the wolf!");
                main.kill();
            }
        }
        else if (choice == 3){
            int pray;
            pray = lotto.nextInt(10000);
            if(pray == 0){
                System.out.println("Suddenly, a bolt of lighting strikes the wolf! Perhaps god was saddened by your tears.");
            }
            else{
                System.out.println("The wolf is not dissuaded by your tears. Though, it eats you guiltily.");
                main.kill();
            }
        }
    }
    public static void alleyAttack(Character m) throws IOException{
        int choice;
        
        Character main = m;
        Scanner reader = new Scanner(new File("alleyAttack.txt"));

        while (reader.hasNextLine())
        {
            System.out.println(reader.nextLine());
        }
        
        choice = reader2.nextInt();
        if(choice == 1){
            System.out.println("You give him all of your held belongings, Congrats on keeping calm! Though you lost a few hundred. Perhaps look into a bank?");
            main.setWealth(main.getWealth() - 300);
        }
        else if(choice == 4){
            if(main.getGender().equals("Female") && main.getLooks() > 75){
                System.out.println("After you burst into tears, the man looks somber. He apologizes and walks away.");
            }
            else{
                System.out.println("The man walks up and knocks you out with the butt of his gun. You wake up the next day in a hospital. Curse corporate America! The bill is $5000, and your wallet is gone!");
                main.setWealth(main.getWealth() - 5300);
            }
        }
        else{
            System.out.println("They say don't bring a knife to a gunfight. Well... you brought your fists.");
            main.kill();
        }
    }
}