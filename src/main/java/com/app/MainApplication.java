// File: com/app/MainApplication.java
package com.app;

import com.view.MainMenuView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {

    

    @Override
    public void start(Stage stage) {
        Scene scene = MainMenuView.createScene();
        stage.setScene(scene);
        stage.setTitle("Page 1");
        stage.show();

    }
    
    public static void main(String[] args) {
        launch(args);
 
    }
}
