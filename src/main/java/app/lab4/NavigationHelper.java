package app.lab4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NavigationHelper {

    @FXML
    public void navigateTo(String fxmlFile, Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            GitLabApplication.setPrimaryStage(stage);
            Scene scene = new Scene(root, 480, 320);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}