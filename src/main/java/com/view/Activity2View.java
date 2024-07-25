package com.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Activity2View {
    public static Scene sceneCreate(){
        VBox root = new VBox();
        root.getChildren().add(new Button("This is activity 2"));
        return new Scene(root, 300, 200);
    }
}
