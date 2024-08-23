	module com.app.startactivities{

	requires transitive javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.swing;
    
    
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires org.slf4j;
	requires java.scripting;
	
    opens com.app to javafx.fxml;
    opens com.controller to javafx.fxml;
    opens com.view to javafx.fxml;
    
    exports com.app;
    exports com.controller;
    exports com.view;
}