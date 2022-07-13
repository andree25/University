package controller;

import dbConnection.Handler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerMainPage implements Initializable {

    @FXML
    private PasswordField passAdmin;

    @FXML
    private TextField usernameAdmin;

    @FXML
    private Button logTrId;

    @FXML
    private TextField usernameCust;

    @FXML
    private PasswordField passTr;

    @FXML
    private PasswordField passCust;

    @FXML
    private Button logAdId;

    @FXML
    private Button signCustId;

    @FXML
    private Button logCustId;


    @FXML
    private TextField usernameTr;

    private Handler handler;
    private Connection dbConnection;
    private PreparedStatement pst;

    @FXML
    public void onClickActionLogCustId(javafx.event.ActionEvent actionEvent) {
        logCustId.getScene().getWindow().hide();

        dbConnection = handler.getConnection();
        String q1 = "SELECT * FROM customers WHERE username=? and password=?";

        try {
            pst = dbConnection.prepareStatement(q1);
            pst.setString(1, usernameCust.getText());
            pst.setString(2, passCust.getText());
            ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            if (count == 1) {
                logCustId.getScene().getWindow().hide();

                try {

                    Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainCustPage.fxml"));
                    Stage testLogCustIdStage = new Stage();
                    testLogCustIdStage.setScene(new Scene(root));
                    testLogCustIdStage.setResizable(false);
                    testLogCustIdStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Username or password is not correct!");
                alert.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void onClickActionSignCustId(javafx.event.ActionEvent actionEvent) throws IOException {
        signCustId.getScene().getWindow().hide();

        Parent root = FXMLLoader.load(getClass().getResource("/resources/view/signCustomerPage.fxml"));
        Stage signCustIdStage = new Stage();
        signCustIdStage.setScene(new Scene(root));
        signCustIdStage.setResizable(false);
        signCustIdStage.show();
    }

    @FXML
    public void onClickActionLogAdId(javafx.event.ActionEvent actionEvent) {
        logAdId.getScene().getWindow().hide();

        dbConnection = handler.getConnection();
        String q1 = "SELECT * FROM manager WHERE username=? and password=?";

        try {
            pst = dbConnection.prepareStatement(q1);
            pst.setString(1, usernameAdmin.getText());
            pst.setString(2, passAdmin.getText());
            ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            if (count == 1) {
                logAdId.getScene().getWindow().hide();

                try {

                    Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainAdminPage.fxml"));
                    Stage testLogAdIdStage = new Stage();
                    testLogAdIdStage.setScene(new Scene(root));
                    testLogAdIdStage.setResizable(false);
                    testLogAdIdStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Username or password is not correct!");
                alert.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    public void onClickActionLogTrId(javafx.event.ActionEvent actionEvent) {
        logTrId.getScene().getWindow().hide();

        dbConnection = handler.getConnection();
        String q1 = "SELECT * FROM trainers WHERE username=? and password=?";

        try {
            pst = dbConnection.prepareStatement(q1);
            pst.setString(1, usernameTr.getText());
            pst.setString(2, passTr.getText());
            ResultSet rs = pst.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            if (count == 1) {
                logTrId.getScene().getWindow().hide();

                try {

                    Parent root = FXMLLoader.load(getClass().getResource("/resources/view/mainTrPage.fxml"));
                    Stage testLogTrIdStage = new Stage();
                    testLogTrIdStage.setScene(new Scene(root));
                    testLogTrIdStage.setResizable(false);
                    testLogTrIdStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setContentText("Username or password is not correct!");
                alert.show();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                dbConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new Handler();

    }
}
