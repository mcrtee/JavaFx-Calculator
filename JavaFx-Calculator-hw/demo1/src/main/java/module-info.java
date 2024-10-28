module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.demo1 to javafx.fxml; // Allow javafx.fxml to access the demo1 package
    exports com.example.demo1;

}

