
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
    private String deathMessage;
    private String job;
    private double looks;
    private double smarts;
    private double craziness;
    private double health;
    private double atheleticism;
    private int wealth;
    private int age;
    private int iq;
    private boolean college;
    private boolean educated;
    private boolean alive;

    public Character(String n, String n2, double l, double s, double c, double h, double a, String g){
        Random lotto = new Random();
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
        iq = lotto.nextInt(5) + 1;
        deathMessage = "Not Dead Yet!";
        job = "None";
        college = false;
        educated = false;
    }
    public Character(String n, String n2, double l, double s, double c, double h, double a, String g, int ag){
        Random lotto = new Random();
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
        iq = lotto.nextInt(5) + 1;
        deathMessage = "Not Dead Yet!";
        job = "None";
        college = false;
        educated = false;
    }
    public Character(String n, String n2, double l, double s, double c, double h, double a, String g, int ag, int w){
        Random lotto = new Random();
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
        iq = lotto.nextInt(5) + 1;
        deathMessage = "Not Dead Yet!";
        job = "None";
        college = false;
        educated = false;
    }
    public void setJob(String j){
        job = j;
    }
    public void enroll(){
        college = true;
    }
    public boolean isinCollege(){
        return college;
    }
    public boolean isEducated(){
        return educated;
    }
    public void setDeath(String m){
        deathMessage = m;
    }
    public void setWealth(int w){
        wealth = w;
    }
    public void setAge(int a){
        age = a;
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
    
    public String getDeath(){
        return deathMessage;
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
        return (String.format("%n%nName: %s%nAge: %d%nWealth: %d%nLooks: %f%nSmarts: %f%nAtheleticism %f%nHealth: %f%nAlive: %b%n%n",name,age,wealth,looks,smarts,atheleticism,health,alive));
    } 
    
    public static String newFirstMaleName()throws IOException{
    Scanner reader = new Scanner(new File("texts/firstmale.txt"));
    Scanner readerTwo = new Scanner(new File("texts/firstmale.txt")); 
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
    Scanner reader = new Scanner(new File("texts/firstfemale.txt"));
    Scanner readerTwo = new Scanner(new File("texts/firstfemale.txt")); 
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
    Scanner reader = new Scanner(new File("texts/last.txt"));
    Scanner readerTwo = new Scanner(new File("texts/last.txt")); 
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

public void Age(){
    Random lotto = new Random();
    age += 1;
    double oldlooks = looks;
    looks -= ((lotto.nextInt(15) + 1) - ((atheleticism / 10) + (300/(age + 1))));
    if (looks > oldlooks){
        looks = oldlooks;
    }
    if (looks > 100){
        looks = 100;
    }
    if (looks < 0){
        looks = 0;
    }
    smarts -= ((lotto.nextInt(10) + 1) - ((lotto.nextInt(1) + 1) * iq));
    if (smarts > 100){
        smarts = 100;
    }
    if (smarts < 0){
        smarts = 0;
    }
    double oldAtheleticism = atheleticism;
    atheleticism -= ((lotto.nextInt(15) + 1) - ((atheleticism / 10) + (100/(age + 1))));
    if (atheleticism > oldAtheleticism){
        atheleticism = oldAtheleticism;
    }
    if (atheleticism > 100){
        atheleticism = 100;
    }
    if (atheleticism < 0){
        atheleticism = 0;
    }
    health -= ((lotto.nextInt(8) + 1) -  (200/(age + 1)));
    if (health > 100){
        health = 100;
    }
    if (health < 0){
        health = 0;
    }
}

public void yearlyPay(){
    if (job.equals("Complicated Chores")){
        wealth += 100;
    }
    else if(job.equals("Normal Chores")){
        wealth += 50;
    }
    else if(job.equals("Good Part-Time-Job")){
        wealth += 30000;
    }
    else if(job.equals("Decent Part-Time-Job")){
        wealth += 20000;
    }
    else if(job.equals("Poor Part-Time-Job")){
        wealth += 15000;
    }
    else if(job.equals("Great Job")){
        wealth += 100000;
    }
    else if(job.equals("Good Job")){
        wealth += 75000;
    }
    else if(job.equals("Decent Job")){
        wealth += 60000;
    }
    else if(job.equals("Poor Job")){
        wealth += 45000;
    }
}
public void yearlyDeduction(){
    Random lotto = new Random();
    if(college){
        wealth -= (20000 * (lotto.nextInt(3) +  1));
    }
    else{
        wealth -= (10000 * (lotto.nextInt(6) + 1));
    }
}


public boolean isAlive(){
    return alive;
}
public void kill(){
    alive = false;
}
}