package game.models;

import javafx.scene.paint.Color;

public class Tree extends Interactable {

    public Tree(Position p){
        super(p, Color.GREENYELLOW);
        this.destroyed = false;
    }

    @Override
    public void interact(Player player) {
        this.destroyed = player.getWeapon().name == "Axe";
    }

    @Override
    public boolean isDestroyed() {
        return this.destroyed;
    }
    
}
