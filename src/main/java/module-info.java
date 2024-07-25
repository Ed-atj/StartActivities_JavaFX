module com.app.startactivities {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.app to javafx.fxml;
    exports com.app;
    exports com.controller;
    opens com.controller to javafx.fxml;
}