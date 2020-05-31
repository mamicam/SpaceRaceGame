package pl.mamicam.game;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import pl.mamicam.utils.FxmlUtils;

public class SpaceRaceGame extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FxmlUtils.fxmlLoader("/fxml/MainPane.fxml");
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
