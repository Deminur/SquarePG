package game.models;

import javafx.scene.paint.Color;

public class Player extends LivingEntity {
    
    public Player(Position p, int maxHP) {
        super(p, Color.RED, maxHP);
    }
    private int posX =11 ;
    private int posY = 19;

    public int getPosX() {
        return posX;
    }
    public void setPosX(int posX) {
        this.posX = posX;
    }
    public int getPosY() {
        return posY;
    }
    public void setPosY(int posY) {
        this.posY = posY;
    }
}
