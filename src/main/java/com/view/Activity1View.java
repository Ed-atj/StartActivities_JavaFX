package com.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;


public class Activity1View {
	
	public static Scene createScene() throws IOException {
		FXMLLoader loader = new FXMLLoader(Activity1View.class.getResource("/com/view/Activity1View.fxml"));
		Parent root = loader.load();
		return new Scene(root, 480, 400);
	}
	
}
	

	
