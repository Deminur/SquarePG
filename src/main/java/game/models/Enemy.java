package game.models;

import javafx.scene.paint.Color;

public class Enemy extends LivingEntity {

    public Enemy(Position p, int maxHP) {
        super(p, Color.PURPLE, maxHP);
    }
    
}
