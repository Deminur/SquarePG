package game.models;

import game.items.Item;
import javafx.scene.paint.Color;

public class Rock extends Interactable{

    public Rock(Position p) {
        super(p, Color.GREY);
    }

    @Override
    public void interact(Item item) {
        //TODO
    }
    
}
