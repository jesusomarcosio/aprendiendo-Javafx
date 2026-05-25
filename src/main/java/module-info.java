module com.example.aprendiendojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aprendiendojavafx to javafx.fxml;
    exports com.example.aprendiendojavafx;
}