
/**
 * Write a description of class Healing_Potion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Healing_Potion extends Item
{
    protected int healthRegen;
    public Healing_Potion(){
        super("Healing Potion");
        healthRegen = 25;
    }
    public String getName(){
        return type;
    }
}
