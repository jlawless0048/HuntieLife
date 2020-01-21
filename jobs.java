
/**
 * Write a description of class jobs here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class jobs
{
    public static void getJob(Character character){
        if (character.getAge() < 13){
            if (character.getSmarts() > 50){
                character.setJob("Complicated Chores");
            }
            else{
                character.setJob("Normal Chores");
            }
        }
        else if (character.getAge() < 18){
            if (character.getSmarts() >  90){
                character.setJob("Good Part-Time-Job");
            }
            else if(character.getSmarts() > 40){
                character.setJob("Decent Part-Time-Job");
            }
            else{
                character.setJob("Poor Part-Time-Job");
            }
        }
        else if (character.getAge() <23 && character.isinCollege()){
            if (character.getSmarts() >  90){
                character.setJob("Good Part-Time-Job");
            }
            else if(character.getSmarts() > 40){
                character.setJob("Decent Part-Time-Job");
            }
            else{
                character.setJob("Poor Part-Time-Job");
            }
        }
        else if (character.isEducated()){
            if (character.getSmarts() > 80){
                character.setJob("Great Job");
            }
            else if(character.getSmarts() > 50){
                character.setJob("Good Job");
            }
            else{
                character.setJob("Decent Job");
            }
        }
        else{
            if (character.getSmarts() > 90){
                character.setJob("Good Job");
            }
            else if (character.getSmarts() > 50){
                character.setJob("Decent Job");
            }
            else {
                character.setJob("Poor Job");
            }
        }
    }
}
