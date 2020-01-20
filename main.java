
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
        int focus;

        Character main = Character.createCharacter();
        Character dad = new Character(Character.newFirstMaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Male", lotto.nextInt(27) + 18, lotto.nextInt(100000));
        Character mom = new Character(Character.newFirstFemaleName(), dad.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), "Female", lotto.nextInt(17) + 18, lotto.nextInt(100000));
        
        int siblingNum = lotto.nextInt(4);
        Character[] siblings = new Character[siblingNum];    
        
        for (int i = siblingNum - 1; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                siblings[i] = new Character(Character.newFirstMaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1); 
            }
            else {
                siblings[i] = new Character(Character.newFirstFemaleName(), main.getlName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(10) + 1);
            }
        }
        
        Character[] yourAge = new Character[50];
        
        for (int i = 49; i > 0; i--){
            String g = Character.createGender();
            if (g.equals("Male")){
                yourAge[i] = new Character(Character.newFirstMaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(2)-1 , lotto.nextInt(100000)); 
            }
            else {
                yourAge[i] = new Character(Character.newFirstFemaleName(), Character.newLastName(), Character.createLooks(), Character.createSmarts(), Character.createCraziness(), Character.createHealth(), Character.createAtheleticism(), g, lotto.nextInt(2)-1, lotto.nextInt(100000));
            }
        }
        
        Character[] everyoneElse = new Character[100];
        
        for (int i = 99; i > 0; i--){
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
                focus = 0;
                main.Age();
                dad.Age();
                mom.Age();
                for (int i = siblingNum - 1; i > 0; i--){
                    siblings[i].Age();
                }
                for (int i = 49; i > 0; i--){
                    yourAge[i].Age();
                }
                for (int i = 99; i > 0; i--){
                    everyoneElse[i].Age();
                }
                if (main.getHealth() <= 0){
                    death.lessThanZeroDeath(main);
                    main.kill();
                }
                if (dad.getHealth() <= 0){
                    death.lessThanZeroDeath(dad);
                    dad.kill();
                }
                if (mom.getHealth() <= 0){
                    death.lessThanZeroDeath(mom);
                    mom.kill();
                }
                for (int i = siblingNum - 1; i > 0; i--){
                    if (siblings[i].getHealth() <= 0){
                        death.lessThanZeroDeath(siblings[i]);
                        siblings[i].kill();
                    }
                }
                for (int i = 49; i > 0; i--){
                    if (yourAge[i].getHealth() <= 0){
                        death.lessThanZeroDeath(yourAge[i]);
                        yourAge[i].kill();
                    }
                }
                for (int i = 99; i > 0; i--){
                    if (everyoneElse[i].getHealth() <= 0){
                        death.lessThanZeroDeath(everyoneElse[i]);
                        everyoneElse[i].kill();
                    }
                }
                while(true){
                    System.out.printf("1.) Next Year%n2.) Set Year Focus%n3.) See Family%n4.) See Everyone Else You Know");
                    System.out.println(main);
                    choice = reader.nextInt();
                    if (choice == 1){
                        break;
                    }
                    if (choice == 2){
                        if(main.getAge() < 13){
                            System.out.printf("1.) Play Outside%n2.) Read%n3.) Play Dress-Up%n4.) Do Chores");
                        }
                        else if(main.getAge() < 18){
                            System.out.printf("1.) Practice Sports%n2.) Study%n3.) Put More Effort Into Clothing%n4.) Get A Part-Time Job");
                        }
                        else if(main.getAge() < 23 && main.isinCollege()){
                            System.out.printf("1.) Go to the Gym%n2.) Study%n3.) Put More Effort Into Clothing%n4.) Get A Part-Time Job");
                        }
                        else{
                            System.out.printf("1.) Go to the Gym%n2.) Read a Book%n3.) Try a new Look%n4.) Get A Job");
                        }
                        choice = reader.nextInt();
                        if(choice == 1){
                            focus = 1;
                        }
                        if(choice == 2){
                            focus = 2;
                        }
                        if(choice == 3){
                            focus = 3;
                        }
                        if(choice == 4){
                            focus = 4;
                        }
                        choice = 0;
                    }
                    if (choice == 3){
                        System.out.println("Parents:");
                        System.out.print(dad);
                        System.out.print(mom);
                        System.out.println("Siblings:");
                        for (int i = siblingNum - 1; i > 0; i--){
                            System.out.print(siblings[i]);
                        }
                        
                    }
                    if (choice == 4){
                        
                    }
                }
            }
        }
        
        System.out.println("You are dead!"); 
        System.out.println(main.getDeath());
        System.out.println(main);
    }
}
