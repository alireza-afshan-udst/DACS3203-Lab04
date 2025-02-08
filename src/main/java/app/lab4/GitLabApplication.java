package app.lab4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GitLabApplication extends Application{
    private static Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(app.lab4.GitLabApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 320);
        setPrimaryStage(stage);
        stage.setTitle("Lab 4 - Github - 60304390");
        stage.setScene(scene);
        stage.show();
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage primaryStage){
        GitLabApplication.primaryStage = primaryStage;
    }

    public static void main(String[] args) {
        launch();
    }
}