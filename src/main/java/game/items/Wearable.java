package game.items;
import game.models.Interactable;

public class Wearable extends Item {

    public int armorValue;
    public int durability;

    public Wearable(String name,int armorValue, int durability){
        super(name);
        this.armorValue = armorValue;
        this.durability = durability;
    }

    @Override
    public void use(Interactable target) {
        //Nothing happens
    }

    public void getDmg(int nbDmg){
        if(this.durability - nbDmg <= 0){
            this.durability = 0;
            this.armorValue = 0;
        }else{
            this.durability = this.durability - nbDmg;
        }
    }

    
}
