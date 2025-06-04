package game.items;

import game.models.Interactable;

public class Weapon extends Item{

    public int dmg;

    public Weapon(String name, int dmg) {
        super(name);
        this.dmg = dmg;
    }

    @Override
    public void use(Interactable target) {
        //Nothing happens
    }
    
}
