package game;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.util.Duration;
import javafx.animation.ScaleTransition;

public class MainPageController {

    @FXML
    private Button btnStart;

    private ScaleTransition transition;

    public MainPageController(){
        this.transition = new ScaleTransition(Duration.millis(500));
        this.transition.setNode(btnStart);
        this.transition.setToY(2);
        this.transition.setToX(2);
        this.transition.setAutoReverse(true);
        this.transition.setCycleCount(Integer.MAX_VALUE);
    }

    @FXML
    private void startGame() throws IOException {
        App.setRoot("game");
    }

    @FXML
    private void startAnimation() throws IOException {
        this.transition.setNode(btnStart);
        this.transition.play();
    }
    
    @FXML
    private void stopAnimation() throws IOException {
        this.transition.jumpTo(Duration.millis(0));
        this.transition.stop();
    }

}
