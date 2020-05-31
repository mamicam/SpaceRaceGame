package pl.mamicam.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import pl.mamicam.game.SpaceRaceGame;
import pl.mamicam.utils.FxmlUtils;


public class LeftMenuButtonsController extends SpaceRaceGame {

    public ToggleButton game = new ToggleButton();

    @FXML
    private MainPaneController mainPaneController;

    @FXML
    private GameSceneController gameSceneController = new GameSceneController();

    @FXML
    ChooseYourShipController chooseYourShipController = new ChooseYourShipController();

    @FXML
    SpaceRaceGame spaceRaceGame = new SpaceRaceGame();

    @FXML
    private ToggleGroup leftToggleButtons;

    @FXML
    public void chooseShip() {
        mainPaneController.setButtonsPaneToLeft("/fxml/ChooseYourShipButton.fxml");
        resetToggleButtons();
    }

    @FXML
    public void createGameStage(ActionEvent event) {
        Parent gamePaneParent = FxmlUtils.fxmlLoader("/fxml/GameScene.fxml");
        Scene gameScene = new Scene(gamePaneParent);
        Stage gameStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        gameStage.setScene(gameScene);
        gameStage.setTitle(FxmlUtils.getResourceBundle().getString("title.game"));
        gameStage.setResizable(false);
        gameStage.show();
    }

    @FXML
    public void eventOnGameButton() {
        if (game.isSelected()) {

        }
    }

    @FXML
    public void yourScore() {
        mainPaneController.setButtonsPaneToLeft("/fxml/ScoreButton.fxml");
        resetToggleButtons();
    }

    @FXML
    public void help() {
        mainPaneController.setButtonsPaneToLeft("/fxml/HelpButton.fxml");
        resetToggleButtons();
    }

    @FXML
    public void yourCredits() {
        mainPaneController.setButtonsPaneToLeft("/fxml/CreditsButton.fxml");
        resetToggleButtons();
    }

    @FXML
    public void gameClose() {
        Platform.exit();
        System.exit(0);
    }

    public void setMainPaneController(MainPaneController mainPaneController) {
        this.mainPaneController = mainPaneController;
    }

    private void resetToggleButtons() {
        if (leftToggleButtons.getSelectedToggle() != null) {
            leftToggleButtons.getSelectedToggle().setSelected(false);
        }
    }

    public void showShip(MouseEvent event) {
        LeftMenuButtonsController leftMenuButtonsController = new LeftMenuButtonsController();
        if (event.getButton() == MouseButton.PRIMARY) {
            if (leftMenuButtonsController.game.isPressed() & chooseYourShipController.checkRedShip.isSelected()) {
                gameSceneController.setShip("ships/Ship_type1_red.png");
                System.out.println("Red ship is visible");
                } else if (chooseYourShipController.checkGreenShip.isSelected()) {
                gameSceneController.setShip("ships/Ship_type2_green.png");
                System.out.println("Green ship is visible");
            } else {
                System.out.println("Error with loading ship, czyli progrmista mniejsza dupa!");
                }
            } else {
                System.out.println("Programista dupa!");
            }
        }
    }
