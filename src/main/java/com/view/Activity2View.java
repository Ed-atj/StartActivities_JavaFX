package com.view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;

public class Activity2View {
	
	private Activity2View() {}
	
    public static Scene sceneCreate(){
		try {
			FXMLLoader loader = new FXMLLoader(Activity1View.class.getResource("/com/view/Activity1View.fxml"));
			Parent root = loader.load();
			return new Scene(root, 480, 400);
		} catch (IOException e) {
			return new Scene(new VBox(), 480, 400); 
		}
	}
}
