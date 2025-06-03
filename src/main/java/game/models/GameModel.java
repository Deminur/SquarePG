package game.models;

import javafx.util.Pair;

public class GameModel {

    private PlayerModel player = new PlayerModel();

    private int[] forbiddenBlocks = {1,3};

    private final int mapSize = 19;

    private int[][] firstMap ={
        {3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,2,2,2,2,2,2,2,2,2,2,2,2,2,3},
        {3,3,3,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0},
        {3,3,3,0,3,3,3,0,0,0,2,2,2,2,0,0,0,0,0,3},
        {3,3,0,0,3,3,3,3,0,0,2,2,2,2,0,2,2,2,2,3},
        {3,3,0,0,2,2,2,2,3,0,2,2,2,0,0,3,3,3,3,3},
        {3,1,0,1,1,1,2,2,3,0,2,2,2,0,3,3,3,3,3,3},
        {3,1,0,0,0,1,2,2,0,0,2,2,0,0,3,3,3,3,3,3},
        {3,1,0,0,0,1,2,0,0,0,0,0,0,0,3,3,3,3,3,3},
        {3,1,1,1,1,1,2,0,0,2,2,2,2,2,3,3,3,3,3,3},
        {3,3,3,3,3,3,2,2,0,2,2,2,2,2,2,3,3,3,3,3},
        {3,3,3,3,3,3,2,2,0,0,2,2,2,2,2,3,3,3,3,3},
        {3,3,3,3,3,3,2,2,2,0,2,2,2,2,2,2,2,2,3,3},
        {3,3,3,3,3,3,3,3,2,0,0,0,0,0,2,2,2,2,2,3},
        {3,3,3,3,3,3,3,2,2,2,2,2,0,0,2,2,2,2,2,3},
        {3,3,3,3,3,3,3,2,2,2,2,0,0,0,2,2,2,2,2,3},
        {3,3,3,3,3,3,3,2,2,2,2,0,0,0,0,2,2,2,2,3},
        {3,3,3,3,3,3,3,2,2,2,2,0,0,0,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,2,0,0,3,3,3,3,3,3,3},
        {3,3,3,3,3,3,3,3,3,3,3,0,3,3,3,3,3,3,3,3},
    };

    //test if the player can go on the  block described by the Position p
    public boolean testPosition(Position p){
        for(int i = 0; i<this.forbiddenBlocks.length; i++){
            if(p.getX()<0 || p.getX()>this.mapSize || p.getY()<0 || p.getY()>this.mapSize || this.firstMap[p.getY()][p.getX()] == this.forbiddenBlocks[i] ){
                return false;
            }
        }
        return true;
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

    public int[][] getMap(){
        return this.firstMap;
    }

    public Position getPlayerPos(){
        return new Position(this.player.getPosX(), this.player.getPosY());
    }
}
