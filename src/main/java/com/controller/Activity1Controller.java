package com.controller;


import com.view.MainMenuView;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Activity1Controller {

	@FXML
	public Label label;
	@FXML
	public AnchorPane anchorPane;
	@FXML
	public Button returnMenuButton;
	@FXML
	public Button zero, one, two, three, four, five, six, seven, eight, nine;
	@FXML
	public Button add, sub, div, mult, equal;
	@FXML
	public TextField calcText;
    @FXML
    public void initialize() {
        returnMenuButton.setOnAction(event -> toMainMenu());
        
        
        buttonInsert();
        Platform.runLater(() -> calcText.requestFocus());
    }
    public void toMainMenu() {
    	if (returnMenuButton.getScene().getWindow() instanceof Stage stage) {
            stage.setScene(MainMenuView.createScene());
            stage.setTitle("Page 1");
    	}else {
    		System.out.println("Não foi possível carregar a próxima cena.");
    	}
      }
   
    @FXML
    public void textInsert(KeyEvent event){
    	
    	System.out.println(event.getSource());
    	switch(event.getCode()) {
			case ADD 			 -> calcText.appendText(" + ");
			case SUBTRACT 		 -> calcText.appendText(" - ");
			case MULTIPLY 		 -> calcText.appendText(" * ");
			case DIVIDE 		 ->	calcText.appendText(" / ");
			case DECIMAL 		 -> calcText.appendText(".");
			case NUMPAD0, DIGIT0 -> calcText.appendText("0");
			case NUMPAD1, DIGIT1 -> calcText.appendText("1");
			case NUMPAD2, DIGIT2 -> calcText.appendText("2");
			case NUMPAD3, DIGIT3 -> calcText.appendText("3");
			case NUMPAD4, DIGIT4 -> calcText.appendText("4");
			case NUMPAD5, DIGIT5 -> calcText.appendText("5");
			case NUMPAD6, DIGIT6 -> calcText.appendText("6");
			case NUMPAD7, DIGIT7 -> calcText.appendText("7");
			case NUMPAD8, DIGIT8 -> calcText.appendText("8");
			case NUMPAD9, DIGIT9 -> calcText.appendText("9");
			case EQUALS, ENTER 	 -> calcText.appendText("");
			case C 				 -> calcText.deleteText(0, calcText.getLength());
			case BACK_SPACE 	 -> {
				calcText.deleteText(calcText.getLength() - 1, calcText.getLength());
			}
			default -> System.out.println("Aconteceu algo de errado.");
		}

    }
    @FXML
    public void buttonInsert() {
    	Button numbers[] = {zero, one, two, three, four, five, six, seven, eight, nine};
    	Button ops[] = {add, sub, mult, div};
    	
    	for(int i = 0; i < ops.length; i++) {
    		final int n = i;
    		ops[i].setOnAction(event -> {
    			 switch(n) {
	    			 case 0 	-> calcText.appendText(" + ");
	    			 case 1 	-> calcText.appendText(" - ");
	    			 case 2 	-> calcText.appendText(" * ");
	    			 case 3 	-> calcText.appendText(" / ");
	    			 default 	-> calcText.appendText("Error");
    			 }
    		});
    	}
    	
    	for (int i = 0; i < numbers.length; i++) {
    		final int n = i;
    		numbers[i].setOnAction(event -> calcText.appendText(String.valueOf(n)));
    	}
//    	Button b0,b1,b2,b3;
//    	b0 = ops[0];
//    	b1 = ops[1];
//    	b2 = ops[2];
//    	b3 = ops[3];
//    	System.out.println();
//    	System.out.println(b0+" "+b1+ " "+ b2+ " "+b3);
    	
    	
    }
}
