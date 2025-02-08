module app.lab4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens app.lab4 to javafx.fxml;
    exports app.lab4;
}