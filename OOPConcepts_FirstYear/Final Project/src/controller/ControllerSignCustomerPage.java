package controller;

import dbConnection.Handler;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerSignCustomerPage implements Initializable {

    @FXML
    private Button fitness1M;

    @FXML
    private Button fitness6M;

    @FXML
    private Button fitness1Y;

    @FXML
    private Button body1M;

    @FXML
    private Button body6M;

    @FXML
    private Button body1Y;

    @FXML
    private Button aerobic1M;

    @FXML
    private Button aerobic6M;

    @FXML
    private Button aerobic1Y;

    @FXML
    private Button swim1M;

    @FXML
    private Button swim6M;

    @FXML
    private Button swim1Y;

    @FXML
    private ChoiceBox<String> choiceBoxGender;

    @FXML
    private TextField phoneId;

    @FXML
    private TextField emailId;

    @FXML
    private DatePicker birthdayId;

    @FXML
    private PasswordField passiId;

    @FXML
    private TextField nameId;

    @FXML
    private TextField usernameId;

    @FXML
    private TextField adressId;

    private Handler handler;
    private Connection dbConnection;
    private PreparedStatement pst;


    @FXML
    public void onClickActionFitness1M(ActionEvent actionEvent) throws IOException {
        fitness1M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'1','1','1')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage fitness1MStage = new Stage();
        fitness1MStage.setScene(new Scene(root));
        fitness1MStage.setResizable(false);
        fitness1MStage.show();
    }

    @FXML
    public void onClickActionFitness6M(ActionEvent actionEvent) throws IOException {
        fitness6M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'2','1','1')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage fitness6MStage = new Stage();
        fitness6MStage.setScene(new Scene(root));
        fitness6MStage.setResizable(false);
        fitness6MStage.show();
    }

    @FXML
    public void onClickActionFitness1Y(ActionEvent actionEvent) throws IOException {
        fitness1Y.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'3','1','1')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage fitness1YStage = new Stage();
        fitness1YStage.setScene(new Scene(root));
        fitness1YStage.setResizable(false);
        fitness1YStage.show();
    }

    @FXML
    public void onClickActionBody1M(ActionEvent actionEvent) throws IOException {
        body1M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'4','2','2')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage body1MStage = new Stage();
        body1MStage.setScene(new Scene(root));
        body1MStage.setResizable(false);
        body1MStage.show();
    }

    @FXML
    public void onClickActionBody6M(ActionEvent actionEvent) throws IOException {
        body6M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'5','2','2')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage body6MStage = new Stage();
        body6MStage.setScene(new Scene(root));
        body6MStage.setResizable(false);
        body6MStage.show();
    }

    @FXML
    public void onClickActionBody1Y(ActionEvent actionEvent) throws IOException {
        body1Y.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId)"
                + "VALUES (?,?,?,?,?,?,?,?,'6','2','2')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage body1YStage = new Stage();
        body1YStage.setScene(new Scene(root));
        body1YStage.setResizable(false);
        body1YStage.show();
    }

    @FXML
    public void onClickActionAerobic1M(ActionEvent actionEvent) throws IOException {
        aerobic1M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'7','3','3')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage aerobic1MStage = new Stage();
        aerobic1MStage.setScene(new Scene(root));
        aerobic1MStage.setResizable(false);
        aerobic1MStage.show();
    }

    @FXML
    public void onClickActionAerobic6M(ActionEvent actionEvent) throws IOException {
        aerobic6M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'8','3','3')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage aerobic6MStage = new Stage();
        aerobic6MStage.setScene(new Scene(root));
        aerobic6MStage.setResizable(false);
        aerobic6MStage.show();
    }

    @FXML
    public void onClickActionAerobic1Y(ActionEvent actionEvent) throws IOException {
        aerobic1Y.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'9','3','3')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage aerobic1YStage = new Stage();
        aerobic1YStage.setScene(new Scene(root));
        aerobic1YStage.setResizable(false);
        aerobic1YStage.show();
    }

    @FXML
    public void onClickActionSwim1M(ActionEvent actionEvent) throws IOException {
        swim1M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'10','4','4')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage swim1MStage = new Stage();
        swim1MStage.setScene(new Scene(root));
        swim1MStage.setResizable(false);
        swim1MStage.show();
    }

    @FXML
    public void onClickActionSwim6M(ActionEvent actionEvent) throws IOException {
        swim6M.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'11','4','4')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage swim6MStage = new Stage();
        swim6MStage.setScene(new Scene(root));
        swim6MStage.setResizable(false);
        swim6MStage.show();
    }

    @FXML
    public void onClickActionSwim1Y(ActionEvent actionEvent) throws IOException {
        swim1Y.getScene().getWindow().hide();

        String insert = "INSERT INTO customers(name, adress, phoneNumber, email, birthday, gender, username, password, " +
                "subscriptionId, trainerID, hallID)"
                + "VALUES (?,?,?,?,?,?,?,?,'12','4','4')";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameId.getText());
            pst.setString(2, adressId.getText());
            pst.setString(3, phoneId.getText());
            pst.setString(4, emailId.getText());
            pst.setString(5, String.valueOf(birthdayId.getValue()));
            pst.setString(6, getGender());
            pst.setString(7, usernameId.getText());
            pst.setString(8, passiId.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
        Stage swim1YStage = new Stage();
        swim1YStage.setScene(new Scene(root));
        swim1YStage.setResizable(false);
        swim1YStage.show();


    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new Handler();
        choiceBoxGender.setItems(FXCollections.observableArrayList("MALE", "FEMALE"));
    }

    public String getGender() {
        return (String) choiceBoxGender.getSelectionModel().getSelectedItem();
    }

}
