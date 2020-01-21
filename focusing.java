
/**
 * Write a description of class focus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class focusing
{
    public static void focusTime(int focus, Character character){
        if (focus == 1){
            character.setAtheleticism(character.getAtheleticism() + 5);
            character.setHealth(character.getHealth() + 1);
        }
        if (focus == 2){
            character.setSmarts(character.getSmarts() + 5);
        }
        if (focus == 3){
            character.setLooks(character.getLooks() + 5);
        }
        if (focus == 4){
            jobs.getJob(character);
        }
    }
}
