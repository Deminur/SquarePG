package game.models;

import javafx.scene.paint.Color;

public abstract class Interactable {

    private Position position;
    private Color color;    
    public abstract void interact(Player item);
    public boolean destroyed;

    public Interactable(Position p, Color c){
        this.position = p;
        this.color = c;
        this.destroyed = false;
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

    public abstract boolean isDestroyed();

}
