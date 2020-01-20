
/**
 * Characters
 *
 * Hunter Stewart
 * 1.0
 */
import java.util.Scanner;
import java.util.Random;
import java.io.*;


public class Character
{
    private String name;
    private String gender;
    private double looks;
    private double smarts;
    private double craziness;
    private double health;
    private double atheleticism;
    private boolean alive;
    private int wealth;
    
    public Character(String n, double l, double s, double c, double h, double a, String g){
        name = n;
        looks = l;
        smarts = s;
        craziness = c;
        health = h;
        atheleticism = a;
        gender = g;
        alive = true;
        wealth = 0;
    }
    public void setWealth(int w){
        wealth = w;
    }
    public void setLooks(double l){
        looks = l;
    }
    public void setSmarts(double s){
        smarts = s;
    }
    public void setCraziness(double c){
        craziness = c;
    }
    public void setHealth(double h){
        health = h;
    }
    public void setName(String n){
        name = n;
    }
    public void setAtheleticism(double a){
        atheleticism = a;
    }
    public String getGender(){
        return gender;
    }
    public int getWealth(){
        return wealth;
    }
    public double getLooks(){
        return looks;
    }
    public double getSmarts(){
        return smarts;
    }
    public double getCraziness(){
        return craziness;
    }
    public double getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public double getAtheleticism(){
        return atheleticism;
    }
    public String toString(){
        return (String.format("Name: %s%nLooks: %f%nSmarts: %f%nCraziness: %f%nAtheleticism %f%nHealth: %f%n",name,looks,smarts,craziness,atheleticism,health));
    } 
    
    public static String createMaleName()throws IOException{
        return(newFirstMaleName() + " " + newLastName());
    }
    public static String createFemaleName()throws IOException{
        return(newFirstFemaleName() + " " + newLastName());
    }
    
    public static String newFirstMaleName()throws IOException{
    Scanner reader = new Scanner(new File("texts/keys/firstmale.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/firstmale.txt")); 
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
    return(key[lotto.nextInt(count)]);
}
public static String newFirstFemaleName()throws IOException{
    Scanner reader = new Scanner(new File("texts/keys/firstfemale.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/firstfemale.txt")); 
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
    return(key[lotto.nextInt(count)]);
}
    public static String newLastName()throws IOException{
    Scanner reader = new Scanner(new File("texts/keys/last.txt"));
    Scanner readerTwo = new Scanner(new File("texts/keys/last.txt")); 
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
    return(key[lotto.nextInt(count)]);
}

    public static int createSmarts(){
        Random lotto = new Random();
        return(lotto.nextInt(100)+1);
    }
    public static int createLooks(){
        Random lotto = new Random();
        return(lotto.nextInt(100)+1);
    }
    public static int createAtheleticism(){
        Random lotto = new Random();
        return(lotto.nextInt(100)+1);
    }
    public static int createCraziness(){
        Random lotto = new Random();
        return(lotto.nextInt(100)+1);
    }
    public static int createHealth(){
        Random lotto = new Random();
        return(lotto.nextInt(100)+1);
    }
    public static String createGender(){
        Random lotto = new Random();
        if(lotto.nextInt(2) == 0){
            return "Male";
        } else {
            return "Female";
    }
}
        
public Character createChar()throws IOException{
    String g = createGender();
    if (g.equals("Male")){
        Character character = new Character(createMaleName(), createLooks(), createSmarts(), createCraziness(), createHealth(), createAtheleticism(), g); 
        return character;
    }
    else {
        Character character = new Character(createFemaleName(), createLooks(), createSmarts(), createCraziness(), createHealth(), createAtheleticism(), g);
        return character;
    }
}

public void kill(){
    alive = false;
}
}