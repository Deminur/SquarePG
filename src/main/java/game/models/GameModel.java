package game.models;

import java.util.ArrayList;

public class GameModel {

    private Player player = new Player(new Position(11, 19), 10);

    private ArrayList<Map> listMaps;

    private Map currentMap;

    public GameModel(){
        this.listMaps=new ArrayList<>();
        this.listMaps.add(new Map());

        this.currentMap = this.listMaps.get(0);
    }

    public void nextMap(){
        //TODO
    }

    //test if the player can go on the  block described by the Position p
    public boolean testPosition(Position p){
        return currentMap.testPosition(p, player);
    }

    public void characterPressed(String c){
        switch (c) {
            case "z":
                up();
                break;
            case "q":
                left();
                break;
            case "s":
                down();
                break;
            case "d":
                right();
                break;
            default:
                break;
        }
    }

    private void right() {
        if(testPosition(new Position(this.player.getPosX()+1, this.player.getPosY()))){
            this.player.setPosX(this.player.getPosX()+1);
        }
    }

    private void down() {
        if(testPosition(new Position(this.player.getPosX(), this.player.getPosY()+1))){
            this.player.setPosY(this.player.getPosY()+1);
        }
    }

    private void left() {
        if(testPosition(new Position(this.player.getPosX()-1, this.player.getPosY()))){
            this.player.setPosX(this.player.getPosX()-1);
        }
    }

    private void up() {
        if(testPosition(new Position(this.player.getPosX(), this.player.getPosY()-1))){
            this.player.setPosY(this.player.getPosY()-1);
        }
    }

    public Map getMap(){
        return this.currentMap;
    }

    public Position getPlayerPos(){
        return new Position(this.player.getPosX(), this.player.getPosY());
    }
}
