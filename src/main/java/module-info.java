module SpaceRaceGame {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires javafx.graphics;

    opens pl.mamicam.game to javafx.graphics, javafx.controls, javafx.base, javafx.fxml;
    opens pl.mamicam.controllers to javafx.graphics, javafx.controls, javafx.base, javafx.fxml;
    opens pl.mamicam.utils to javafx.graphics, javafx.controls, javafx.base, javafx.fxml;
    opens background;
    opens bundles;
    opens buttons;
    opens fonts;
    opens fxml to javafx.fxml;
    opens ships;
}