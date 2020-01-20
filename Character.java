
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
    private String name, fname, lname;
    private String gender;
    private double looks;
    private double smarts;
    private double craziness;
    private double health;
    private double atheleticism;
    private boolean alive;
    private int wealth;
    private int age;
    
    public Character(String n, String n2, double l, double s, double c, double h, double a, String g){
        fname = n;
        lname = n2;
        name = fname + " " + lname;
        looks = l;
        smarts = s;
        craziness = c;
        health = h;
        atheleticism = a;
        gender = g;
        alive = true;
        age = 0;
        wealth = 0;
    }
    public Character(String n, String n2, double l, double s, double c, double h, double a, String g, int ag){
        fname = n;
        lname = n2;
        name = fname + " " + lname;
        looks = l;
        smarts = s;
        craziness = c;
        health = h;
        atheleticism = a;
        gender = g;
        alive = true;
        age = ag;
        wealth = 0;
    }
    public Character(String n, String n2, double l, double s, double c, double h, double a, String g, int ag, int w){
        fname = n;
        lname = n2;
        name = fname + " " + lname;
        looks = l;
        smarts = s;
        craziness = c;
        health = h;
        atheleticism = a;
        gender = g;
        alive = true;
        age = ag;
        wealth = w;
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
    public void setfName(String n){
        fname = n;
        name = fname + " " + lname;
    }
    public void setlName(String n){
        lname = n;
        name = fname + " " + lname;
    }
    public void setAtheleticism(double a){
        atheleticism = a;
    }
    public void Age(){
        age += 1;
    }
    public String getGender(){
        return gender;
    }
    public String getlName(){
        return lname;
    }
    public String getfName(){
        return fname;
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
    public int getAge(){
        return age;
    }
    public String toString(){
        return (String.format("Name: %s%nAge: %f%nWealth: %f%nLooks: %f%nSmarts: %f%nAtheleticism %f%nHealth: %f%n",name,age,looks,smarts,atheleticism,health));
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
        
public static Character createCharacter()throws IOException{
    String g = createGender();
    if (g.equals("Male")){
        Character character = new Character(newFirstMaleName(), newLastName(), createLooks(), createSmarts(), createCraziness(), createHealth(), createAtheleticism(), g); 
        return character;
    }
    else {
        Character character = new Character(newFirstFemaleName(), newLastName(), createLooks(), createSmarts(), createCraziness(), createHealth(), createAtheleticism(), g);
        return character;
    }
}

public boolean isAlive(){
    return alive;
}
public void kill(){
    alive = false;
}
}