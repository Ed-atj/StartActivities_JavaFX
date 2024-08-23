package com.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainMenuView {
	
// Page 1
    public static Scene createScene() {
        try {
            FXMLLoader loader = new FXMLLoader(MainMenuView.class.getResource("/com/view/MainMenuView.fxml"));
            Parent root = loader.load();
            return new Scene(root, 480, 400);
        } catch (IOException e) {
            e.printStackTrace();
            return new Scene(new AnchorPane(), 480, 400);

        }
        
    }
}
