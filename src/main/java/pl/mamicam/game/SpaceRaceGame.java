package pl.mamicam.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import pl.mamicam.utils.FxmlUtils;

public class SpaceRaceGame extends Application {

    public static final String MAIN_PANE_FXML = "/fxml/MainPane.fxml";

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane borderPane = FxmlUtils.fxmlLoader(MAIN_PANE_FXML);
            Scene scene = new Scene(borderPane);
            primaryStage.setScene(scene);
            primaryStage.setTitle(FxmlUtils.getResourceBundle().getString("title.application"));
            primaryStage.show();
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
