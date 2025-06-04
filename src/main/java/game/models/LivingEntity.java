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

    protected Helmet equippedHelmet;
    protected Torso equippedTorso;
    protected Pant equippedPant;
    protected Glove equippedGlove;
    protected Shoe equippedShoe;

    protected List<Item> inventory;

    protected Weapon equippedWeapon;

    public LivingEntity(Position p, Color c, int maxHp) {
        super(p, c);
        this.hp = maxHp;
        this.maxHp = maxHp;
        this.inventory = new ArrayList<>();
    }

    @Override
    public void interact(Player player) {
        if(player.getWeapon()!=null){
            System.out.println("AIE ! - "+this.hp+"/"+this.maxHp+" HP");
            this.takeDmg(player.getWeapon().dmg);
        }
    }

    public void takeDmg(int dmg){
        this.hp = this.hp - dmg;
        this.destroyed = this.hp<=0;
    }

    public void heal(int amount){
        if(this.hp+amount > this.maxHp){
            this.hp = this.maxHp;
        }else{
            this.hp = this.hp + amount;
        }
    }

    @Override
    public boolean isDestroyed() {
        return this.hp<=0;
    }
    
}
