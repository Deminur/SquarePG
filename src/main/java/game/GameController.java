package game;


import game.models.GameModel;
import game.models.Interactable;
import game.models.Position;
import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class GameController {

    @FXML
    private Canvas canvas;

    private int blockSize = 20;

    GameModel model;

    private boolean initiated = false;

    public GameController(){
        model = new GameModel();
        AnimationTimer timer = new AnimationTimer() {
            long lastUpdate = 0;
            @Override
            public void handle(long now) {
                double elapsedTime = (now-lastUpdate)/1_000_000_000.0;
                if(elapsedTime > 0){
                    update();
                    render(canvas.getGraphicsContext2D());
                }
                lastUpdate=now;
            }
        };
        timer.start();
    }

    private void update(){
        if(!this.initiated){
            this.canvas.getScene().setOnKeyTyped(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent e) {
                    model.characterPressed(e.getCharacter());
                }
            });
            this.initiated=true;
        }
    }

    private void render(GraphicsContext gc){
        int[][] map = this.model.getMap().getBitMap();
        for (int line = 0; line < map.length; line++) {
            for (int col = 0; col < map[line].length; col++) {
                if(map[line][col]==1){//Wall
                    gc.setFill(Color.BLACK);
                }
                if(map[line][col]==0){//Floor
                    gc.setFill(Color.WHITE);
                }
                if(map[line][col]==2){//Plain
                    gc.setFill(Color.LIGHTGREEN);
                }
                if(map[line][col]==3){//Tree
                    gc.setFill(Color.GREEN);
                }
                gc.fillRect(col*blockSize, line*blockSize, blockSize, blockSize);
            }
        }
        //Draw Interactable of map
        for (Interactable i : model.getMap().getInteractables()) {
            gc.setFill(i.getColor());
            gc.fillRect(i.getPosition().getX()*blockSize, i.getPosition().getY()*blockSize, blockSize, blockSize);
        }

        //Drawplayer
        Position playerPos = this.model.getPlayerPos();
        gc.setFill(Color.RED);
        gc.fillRect(playerPos.getX()*blockSize, playerPos.getY()*blockSize, blockSize, blockSize);
    }
}