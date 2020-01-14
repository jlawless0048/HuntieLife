
/**
 * NPC Characters
 *
 * Hunter Stewart
 * 1.0
 */
public class npcChar
{
    private int looks;
    private int smarts;
    private int craziness;
    private int health;
    
    public npcChar(int l, int s, int c, int h){
        looks = l;
        smarts = s;
        craziness = c;
        health = h;
    }
    public void setLooks(int l){
        looks = l;
    }
    public void setSmarts(int s){
        smarts = s;
    }
    public void setCraziness(int c){
        craziness = c;
    }
    public void setHealth(int h){
        health = h;
    }
    public int getLooks(){
        return looks;
    }
    public int getSmarts(){
        return smarts;
    }
    public int getCraziness(){
        return craziness;
    }
    public int getHealth(){
        return health;
    }
}
