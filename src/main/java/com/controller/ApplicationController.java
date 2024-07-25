package com.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ApplicationController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void ButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}