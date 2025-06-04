package game.models;

import game.items.Item;
import javafx.scene.paint.Color;

public abstract class Interactable {

    private Position position;
    private Color color;    
    public abstract void interact(Item item);

    public Interactable(Position p, Color c){
        this.position = p;
        this.color = c;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

}
