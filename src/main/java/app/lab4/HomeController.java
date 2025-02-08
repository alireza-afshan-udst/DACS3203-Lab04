package app.lab4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;




public class HomeController {

    private NavigationHelper router = new NavigationHelper();
    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("home.fxml")
    );
    @FXML
    public Label search;

    public Label textField;

    @FXML
    public Label textLabel;

    @FXML
    private TextField commandSearchField;

    public void initialize() {
        commandSearchField.textProperty().addListener((obs, oldText, newText) -> {
            textLabel.setText(newText);
        });
    }

    protected void updateText(ActionEvent event) {

    }

    public void onSubmit() {

        Stage stage = GitLabApplication.getPrimaryStage();
        router.navigateTo("command.fxml", stage);
    }
}