package com.view;

import com.utility.PrimaryStageGetSet;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MainMenuView{

    @FXML
    private Label buttonPrimaryStage;
    //Create scene class
    @FXML
    public Scene sceneCreate(Application application){


        Button button1 = new Button("Atividade 1");
        Button button2 = new Button("Atividade 2");


        button1.setOnAction(event -> ToActivity1(application));
        button2.setOnAction(event -> ToActivity2(application));


        VBox root = new VBox(10, button1, button2);
        return new Scene(root, 300, 200);
    }

    public void ToActivity1(Application application){
    Stage stage = (Stage) PrimaryStageGetSet.getPrimaryStage().getScene().getWindow();
    stage.setScene(Activity1View.sceneCreate());

    }
    public void ToActivity2(Application application){
        Stage stage = (Stage) PrimaryStageGetSet.getPrimaryStage().getScene().getWindow();
        stage.setScene(Activity2View.sceneCreate());

    }
}
