package app.lab4;

import db.Queries;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class HomeController {

    private NavigationHelper router = new NavigationHelper();
    FXMLLoader loader = new FXMLLoader(
            getClass().getResource("home.fxml")
    );

    public void initialize(){
        errorMessage.setFill(Color.RED);
    }

    @FXML
    public Text result;

    @FXML
    public Text errorMessage;

    @FXML
    public Button search;

    @FXML
    private TextField commandSearchField;

    public void onSubmit() {
        String input = commandSearchField.getText();
        String[] response = new String[3];
        try {
            if (isValid(input)) {
                response = Queries.getCommandById(input);
            }
        } catch (Exception e) {
            errorMessage.setText(e.getMessage());
            return;
        }
        String baseOutput = "id: %s%ncommand: %s%ndescription: %s%n";
        String output = String.format(
                baseOutput,
                response[0],
                response[1],
                response[2]
        );

        result.setText(output);


    }

    private boolean isValid(String input) throws Exception {
        try {
            int option = Integer.parseInt(input);

            if (option < 1 || option > 5) {
                throw new Exception();
            }

            return true;

        } catch (Exception e) {
            throw new Exception("Input not valid, must be a number between 1-5.");
        }
    }

}