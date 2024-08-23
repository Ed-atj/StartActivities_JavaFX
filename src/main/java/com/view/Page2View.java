package com.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Page2View{
	
	private Page2View() {}
	
//	Create page 2 scene.
	public static Scene createScene() throws IOException {
		FXMLLoader loader = new FXMLLoader(Page2View.class.getResource("/com/view/Page2View.fxml"));
		Parent root = loader.load();
		return new Scene(root, 480, 400);
	}
}

