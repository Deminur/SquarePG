package game.items;

import game.models.Interactable;

public class Consumable extends Item{

    private int nbItems;
    
    public Consumable(String name, int nbItems) {
        super(name);
        this.nbItems=nbItems;
    }

    @Override
    public void use(Interactable target) {
        if(nbItems>0){
            nbItems-=1;
        }
    }
    
    public void addSome(int nb){
        this.nbItems = this.nbItems + nb;
    }

}
