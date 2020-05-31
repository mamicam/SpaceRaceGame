package pl.mamicam.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import pl.mamicam.images.ImageLocation;

public class ChooseYourShipController {


    @FXML CheckBox checkRedShip = new CheckBox(),
                    checkGreenShip = new CheckBox(),
                    checkYellowShip = new CheckBox(),
                    checkBlueShip = new CheckBox();

    @FXML private final ImageView redShipImage = new ImageView();
    @FXML private final ImageView greenShipImage = new ImageView();
    @FXML private final ImageView blueShipImage = new ImageView();
    @FXML private final ImageView yellowShipImage = new ImageView();

    @FXML private GameSceneController gameSceneController = new GameSceneController();

    @FXML
    public void chooseRedShip() {
        if (checkRedShip.isSelected()) {
            checkGreenShip.setSelected(false);
            checkBlueShip.setSelected(false);
            checkYellowShip.setSelected(false);
            System.out.println("Red ship is selected.");
        }
    }

    @FXML
    public void chooseGreenShip() {
        if (checkGreenShip.isSelected()) {
            checkRedShip.setSelected(false);
            checkBlueShip.setSelected(false);
            checkYellowShip.setSelected(false);
            System.out.println("Green ship is selected.");
//            loadShip();
        }
    }

    @FXML
    public void chooseBlueShip() {
        if (checkBlueShip.isSelected()) {
            checkRedShip.setSelected(false);
            checkGreenShip.setSelected(false);
            checkYellowShip.setSelected(false);
            System.out.println("Blue ship is selected.");
//            loadShip();
        } else if (!checkBlueShip.isSelected()){
            System.out.println("Blue ship is not selected.");
        }
    }

    @FXML
    public void chooseYellowShip() {
        if (checkYellowShip.isSelected()) {
            checkRedShip.setSelected(false);
            checkGreenShip.setSelected(false);
            checkBlueShip.setSelected(false);
//            loadShip();
            System.out.println("Yellow ship is selected.");
        }
    }

//    public void loadShip() {
//        if (checkRedShip.isSelected()) {
//            gameSceneController.gameBorderPane.setBottom(redShipImage);
//        } else if (checkBlueShip.isSelected()) {
//            gameSceneController.gameBorderPane.setBottom(blueShipImage);
//        } else if (checkGreenShip.isSelected()) {
//            gameSceneController.gameBorderPane.setBottom(greenShipImage);
//        } else if ((checkYellowShip.isSelected())) {
//            gameSceneController.gameBorderPane.setBottom(yellowShipImage);
//        } else {
//            System.out.println("Error in loading chosen ship.");
//        }
//    }

    public void pressRedShip(MouseEvent event) {
//        Parent shipPaneParent = FxmlUtils.fxmlLoader("/fxml/GameScene.fxml");
//        Scene gameScene = new Scene(shipPaneParent);
//        Stage gameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        gameStage.setScene(gameScene);
//        gameStage.setTitle(FxmlUtils.getResourceBundle().getString("title.game"));
//        gameStage.setResizable(false);
//        gameStage.show();
//
//        redShipImage.setImage(new Image(ImageLocation.class.getResource("/ships/Ship_type1_red.png").toExternalForm()));
//        gameSceneController.gameBorderPane.setBottom(redShipImage);
//        System.out.println("Jednak jestem wczytywany!");
    }

    public void clickedGreenShip(MouseEvent event) {

    }

    public void clickedBlueShip(MouseEvent event) {

    }

    public void clickedYellowShip(MouseEvent mouseEvent) {

    }

    public ImageView getRedShipImage() {
        redShipImage.setImage(new Image(ImageLocation.class.getResource("/ships/Ship_type1_red.png").toExternalForm()));
        return redShipImage;
    }

    public ImageView getGreenShipImage() {
        greenShipImage.setImage(new Image(ImageLocation.class.getResource("/ships/Ship_type2_green.png").toExternalForm()));
        return greenShipImage;
    }

    public void setGameSceneController(GameSceneController gameSceneController) {
        this.gameSceneController = gameSceneController;
    }
}
