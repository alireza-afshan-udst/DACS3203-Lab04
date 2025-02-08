package app.lab4;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.stage.Stage;




public class HomeController {
    private NavigationHelper router = new NavigationHelper();
    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("home.fxml")
    );

    @FXML
    public Label search;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onSearchButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onSubmit() {
        Stage stage = GitLabApplication.getPrimaryStage();
        router.navigateTo("command.fxml", stage);
    }
}