package GUI;

import domain.Game;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class GameApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Between the Lands");
        try {
            FXMLLoader mainLoader = new FXMLLoader(GameApplication.class.getResource("mainStage.fxml"));
            Parent mainPane = mainLoader.load();
            Scene mainScene = new Scene(mainPane);

            MainController mainController =(MainController) mainLoader.getController();



            primaryStage.setScene(mainScene);
            primaryStage.show();
            primaryStage.setResizable(false);



            Game game = new Game();
            mainController.start(game);


        } catch (Exception e) {
            System.out.println(e);
        }
    }


}
