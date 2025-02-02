module com.example.gitlab {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitlab to javafx.fxml;
    exports com.example.gitlab;
}