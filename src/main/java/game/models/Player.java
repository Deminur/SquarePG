package game.models;

import game.items.Weapon;
import javafx.scene.paint.Color;

public class Player extends LivingEntity {
    
    public Player(Position p, int maxHP) {
        super(p, Color.RED, maxHP);
        Weapon sword = new Weapon("Sword",7);
        Weapon axe = new Weapon("Axe", 2);
        Weapon pickaxe = new Weapon("Pickaxe",1);
        this.inventory.add(pickaxe);
        this.inventory.add(sword);
        this.inventory.add(axe);
        this.equippedWeapon=pickaxe;
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

    public Weapon getWeapon(){
        return this.equippedWeapon;
    }
}
