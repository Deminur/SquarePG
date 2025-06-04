package game.items;

import game.models.Interactable;

public abstract class Item {

    public String name;

    public Item(String name){
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.name.equals((String)obj);
    }

    public abstract void use(Interactable target);

}
