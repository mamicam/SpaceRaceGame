package pl.mamicam.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class LeftMenuButtonsController {
    public static final String SHIP_BUTTON_FXML = "/fxml/ChooseYourShipButton.fxml";
    public static final String PLAY_BUTTON_FXML = "/fxml/PlayButton.fxml";
    public static final String SCORE_BUTTON_FXML = "/fxml/ScoreButton.fxml";
    public static final String HELP_BUTTON_FXML = "/fxml/HelpButton.fxml";
    public static final String CREDITS_BUTTON_FXML = "/fxml/CreditsButton.fxml";

    @FXML
    private MainPaneController mainPaneController;

    @FXML
    private ToggleGroup leftToggleButtons;

    @FXML
    public void chooseShip() {
        mainPaneController.setCenter(SHIP_BUTTON_FXML);
    }

    @FXML
    public void playGame() {
        resetToggleButtons();
        mainPaneController.setCenter(PLAY_BUTTON_FXML);
    }

    @FXML
    public void yourScore() {
        resetToggleButtons();
        mainPaneController.setCenter(SCORE_BUTTON_FXML);
    }

    @FXML
    public void help() {
        resetToggleButtons();
        mainPaneController.setCenter(HELP_BUTTON_FXML);
    }

    @FXML
    public void yourCredits() {
        resetToggleButtons();
        mainPaneController.setCenter(CREDITS_BUTTON_FXML);
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
}
