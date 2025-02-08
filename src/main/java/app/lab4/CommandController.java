package app.lab4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CommandController {
    NavigationHelper router = new NavigationHelper();
    @FXML
    private Label homeButton;

    @FXML
    protected void onHomeButtonClick() {
        Stage stage = GitLabApplication.getPrimaryStage();
        router.navigateTo("home.fxml", stage);
    }
}