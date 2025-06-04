package game.models;

import javafx.scene.paint.Color;

public class Rock extends Interactable{

    public Rock(Position p) {
        super(p, Color.GREY);
        this.destroyed=false;
    }

    @Override
    public void interact(Player player) {
        this.destroyed = player.getWeapon().name == "Pickaxe";
    }

    @Override
    public boolean isDestroyed() {
        return this.destroyed;
    }
    
}
