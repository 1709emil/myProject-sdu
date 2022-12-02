package GUI;

import domain.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private AnchorPane mainPane ;


    private Game game;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    @FXML
    public void start(Game game){
        this.game = game;
    }

}
