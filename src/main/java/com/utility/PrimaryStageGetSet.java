package com.utility;

import javafx.stage.Stage;

public class PrimaryStageGetSet {

    public static Stage PrimaryStage;

    public static Stage getPrimaryStage() {
        return PrimaryStage;
    }
    public static void setPrimaryStage(Stage primaryStage) {
        PrimaryStage = primaryStage;
    }
}

