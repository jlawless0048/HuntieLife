
/**
 * Write a description of class characters here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class mainChar
{
    private int happiness;
    private int health;
    private int atheleticism;
    private int smarts;
    
    public mainChar(){
        happiness = 0;
        health = 0;
        atheleticism = 0;
        smarts = 0;
    }
    public void setJosh(){
        happiness = 100;
        health = 100;
        atheleticism = 50;
        smarts = 65;
    }
    public void setDrew(){
        happiness = 100;
        health = 100;
        atheleticism = 10;
        smarts = 79;
    }
    public void setHunter(){
        happiness = 99;
        health = 100;
        atheleticism = 10;
        smarts = 94;
    }
    public void setHappiness(int h){
        happiness = h;
    }
    public void setHealth(int h){
        health = h;
    }
    public void setAtheleticism(int a){
        atheleticism = a;
    }
    public void setSmarts(int s){
        smarts = s;
    }
    public int getHappiness(){
        return happiness;
    }
    public int getHealth(){
        return health;
    }
    public int getAtheleticism(){
        return atheleticism;
    }
    public int getSmarts(){
        return smarts;
    }
}
