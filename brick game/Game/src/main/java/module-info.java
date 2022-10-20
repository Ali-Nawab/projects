module com.example.justlearning {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.justlearning to javafx.fxml;
    exports com.example.justlearning;
}