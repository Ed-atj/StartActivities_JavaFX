package com.app;

import com.utility.PrimaryStageGetSet;
import com.view.MainMenuView;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainApplication extends Application {

    @Override
    public void start(Stage PrimaryStage){
        PrimaryStageGetSet.setPrimaryStage(PrimaryStage);
        MainMenuView mainMenuView = new MainMenuView();
        PrimaryStage.setTitle("Hello!");
        PrimaryStage.setScene(mainMenuView.sceneCreate(this));
        PrimaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}