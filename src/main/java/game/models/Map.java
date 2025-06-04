package game.models;

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<Interactable> listInteractables;

    private int[] forbiddenBlocks = {1,3};

    private final int mapSize = 19;

    private int[][] map ={
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

    public Map(){
        this.listInteractables = new ArrayList<>();
        listInteractables.add(new Enemy(new Position(11, 17), 10));
        listInteractables.add(new Rock(new Position(13, 17)));
        listInteractables.add(new Tree(new Position(6, 3)));
    }

    public List<Interactable> getInteractables(){
        return this.listInteractables;
    }

    public int getMapSize(){
        return this.mapSize;
    }

    public boolean testPosition(Position p){
        for(int i = 0; i<this.forbiddenBlocks.length; i++){
            if(p.getX()<0 || p.getX()>this.mapSize || p.getY()<0 || p.getY()>this.mapSize || this.map[p.getY()][p.getX()] == this.forbiddenBlocks[i] ){
                return false;
            }
        }
        return true;
    }

    public int[][] getBitMap(){
        return this.map;
    }
    
}
