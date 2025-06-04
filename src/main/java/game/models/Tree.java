package game.models;

import game.items.Item;
import javafx.scene.paint.Color;

public class Tree extends Interactable {

    public Tree(Position p){
        super(p, Color.GREENYELLOW);
    }

    @Override
    public void interact(Item item) {
        //TODO
    }
    
}
