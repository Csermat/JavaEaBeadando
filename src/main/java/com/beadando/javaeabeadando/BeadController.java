package com.beadando.javaeabeadando;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BeadController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}