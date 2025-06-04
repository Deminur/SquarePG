package game.models;

import java.util.ArrayList;
import java.util.List;

import game.items.Glove;
import game.items.Helmet;
import game.items.Item;
import game.items.Pant;
import game.items.Shoe;
import game.items.Torso;
import game.items.Weapon;
import javafx.scene.paint.Color;

public class LivingEntity extends Interactable {

    public int hp;
    public int maxHp;

    private Helmet equippedHelmet;
    private Torso equippedTorso;
    private Pant equippedPant;
    private Glove equippedGlove;
    private Shoe equippedShoe;

    private List<Item> inventory;

    private Weapon equippedWeapon;

    public LivingEntity(Position p, Color c, int maxHp) {
        super(p, c);
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.inventory = new ArrayList<>();
    }

    @Override
    public void interact(Item item) {
        //TODO
    }

    public void takeDmg(int dmg){
        //TODO
    }

    public void heal(int amount){
        if(this.hp+amount > this.maxHp){
            this.hp = this.maxHp;
        }else{
            this.hp = this.hp + amount;
        }
    }
    
}
