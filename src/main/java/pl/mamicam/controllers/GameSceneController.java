package pl.mamicam.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.mamicam.images.ImageLocation;
import pl.mamicam.utils.FxmlUtils;

public class GameSceneController {
    @FXML
    BorderPane gameBorderPane = new BorderPane();

    @FXML
    ChooseYourShipController chooseYourShipController;

    public GameSceneController() {
       // createKeyListeners();
    }

    @FXML
    public void backToMainMenu(ActionEvent event) {
        Parent gamePaneParent = FxmlUtils.fxmlLoader("/fxml/MainPane.fxml");
        Scene gameScene = new Scene(gamePaneParent);
        Stage gameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        gameStage.setScene(gameScene);
        gameStage.setTitle(FxmlUtils.getResourceBundle().getString("back.menu"));
        gameStage.setResizable(false);
        gameStage.show();
    }

    @FXML
    public void initialize() {
        chooseYourShipController = new ChooseYourShipController();
        chooseYourShipController.setGameSceneController(this);
    }

    public void setShip(String shipPath) {
        ImageView imageView = new ImageView();
        imageView.setImage(new Image(ImageLocation.class.getResource(shipPath).toExternalForm()));
        gameBorderPane.setBottom(imageView);
    }
}
