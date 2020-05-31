package pl.mamicam.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import pl.mamicam.utils.FxmlUtils;

public class MainPaneController {

    @FXML
    BorderPane borderPane, buttonsBorderPane;

    @FXML
    ChooseYourShipController chooseYourShipController;

    @FXML
    LeftMenuButtonsController leftMenuButtonsController;

    @FXML
    public void initialize() {
        leftMenuButtonsController.setMainPaneController(this);
    }

    public void setButtonsPaneToLeft(String fxmlPath) {
        buttonsBorderPane.setLeft(FxmlUtils.fxmlLoader(fxmlPath));
    }
}
