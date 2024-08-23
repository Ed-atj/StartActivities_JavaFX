package com.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;

import com.view.MainMenuView;

import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;

@ExtendWith(ApplicationExtension.class)
class MainMenuControllerTest {

    private Button toActivity1Button;
    private ToggleButton navPage2Button;

    
//  Starting scene
    @Start
    public void start(Stage stage) {
        Scene scene = MainMenuView.createScene();
        stage.setScene(scene);
        stage.show();
        toActivity1Button = (Button) scene.lookup("#toActivity1Button");
        navPage2Button = (ToggleButton) scene.lookup("#navPage2Button");
        

    }  
    

    @Test
    void testToActivity1Button(FxRobot robot) {
        assertNotNull(toActivity1Button);
        robot.clickOn(toActivity1Button);
        
    }

    @Test
    void testNavPage2Button(FxRobot robot) {
        assertNotNull(navPage2Button);
        robot.clickOn(navPage2Button);
    }
 
}