package db;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Queries {
    public static String[]  getCommandById(String input) {
        String[] response = {"N/A", "N/A", "N/A"};
        Connection connection = DBUtils.establishConnection();
        String query= String.format("SELECT * FROM command WHERE id=%s", input);

        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();

            String id = resultSet.getString(1);
            String command = resultSet.getString(2);
            String description = resultSet.getString(3);

            response = new String[]{id, command, description};

            DBUtils.closeConnection(connection, statement);
            System.out.println(resultSet);
        } catch (Exception e) {
            e.printStackTrace();
            //showAlert("Database Error", "Failed to connect to the database.");
        }


        return response;
    }

    private static void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}
