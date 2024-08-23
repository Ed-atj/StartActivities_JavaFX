package com.controller;



import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.io.IOException;

import com.view.*;

public class MainMenuController{

    @FXML
	public Button toActivity1Button;
    
    @FXML
    private ToggleButton navPage2Button;
    
    @FXML
	private void initialize() {
    	
    		toActivity1Button.setOnAction(event -> {
				try {
					goToActivity1();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
        	navPage2Button.setOnAction(event -> {
				try {
					goToPage2();
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
        	
 	}

    @FXML
    private void goToActivity1()throws IOException{
    	if(toActivity1Button.getScene().getWindow() instanceof Stage stage) {
    		stage.setScene(Activity1View.createScene());
            stage.setTitle("Page 1 - "+ toActivity1Button.getText());
    	}else {
    		System.out.println("Não foi possível carregar a próxima cena.");
    	}
    	
    }
    
    @FXML
    private void goToPage2() throws IOException{
    	if (navPage2Button.getScene().getWindow() instanceof Stage stage) {
    		stage.setScene(Page2View.createScene());
        	stage.setTitle("Page 2");
    	}else {
    		System.out.println("Não foi possível carregar a próxima cena.");
    	}
	
    }
   
}
