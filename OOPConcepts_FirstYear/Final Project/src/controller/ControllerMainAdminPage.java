package controller;

import dbConnection.Handler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import models.DetOfHallsTable;
import models.FeedbackTable;
import models.ScheduleTable;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerMainAdminPage implements Initializable {

    @FXML
    private TextField usernameId;

    @FXML
    private PasswordField passiId;

    @FXML
    private TextField nameId;

    @FXML
    private TextField phoneId;

    @FXML
    private TextField emailId;

    @FXML
    private DatePicker birthdayId;

    @FXML
    private ChoiceBox<String> choiceBoxGender;

    @FXML
    private Button addId;

    @FXML
    private ChoiceBox<String> choiceBoxSpecialty;

    @FXML
    private TableView<DetOfHallsTable> detOfHallsTable;

    @FXML
    private TableColumn<DetOfHallsTable, String> col_name;

    @FXML
    private TableColumn<DetOfHallsTable, byte[]> col_image;

    @FXML
    private TableView<ScheduleTable> workHoursTable;

    @FXML
    private TableColumn<ScheduleTable, Integer> col_schedID;

    @FXML
    private TableColumn<ScheduleTable, String> col_customer;

    @FXML
    private TableColumn<ScheduleTable, String> col_date;

    @FXML
    private TableColumn<ScheduleTable, String> col_time;

    @FXML
    private TableColumn<ScheduleTable, String> col_hall;

    @FXML
    private TableView<FeedbackTable> feedbackTable;

    @FXML
    private TableColumn<FeedbackTable, Integer> col_id;

    @FXML
    private TableColumn<FeedbackTable, String> col_client;

    @FXML
    private TableColumn<FeedbackTable, String> col_trainer;

    @FXML
    private TableColumn<FeedbackTable, String> col_stars;

    @FXML
    private TableColumn<FeedbackTable, String> col_feedback;

    private Handler handler;
    private Connection dbConnection;
    private PreparedStatement pst;

    //first tab: ADD A NEW TRAINER

    @FXML
    public void onClickActionAddId(ActionEvent actionEvent) throws IOException {
        addId.getScene().getWindow().hide();
        if (getSpecialty() == "FITNESS") {
            String insert = "INSERT INTO trainers(name, phone, email, birthday, gender, specialty, username, password, hallID)"
                    + "VALUES (?,?,?,?,?,?,?,?, '1')";

            dbConnection = handler.getConnection();
            try {
                pst = dbConnection.prepareStatement(insert);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pst.setString(1, nameId.getText());
                pst.setString(2, phoneId.getText());
                pst.setString(3, emailId.getText());
                pst.setString(4, String.valueOf(birthdayId.getValue()));
                pst.setString(5, getGender());
                pst.setString(6, getSpecialty());
                pst.setString(7, usernameId.getText());
                pst.setString(8, passiId.getText());

                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (getSpecialty() == "BODYBUILDING") {
            String insert = "INSERT INTO trainers(name, phone, email, birthday, gender, specialty, username, password, hallID)"
                    + "VALUES (?,?,?,?,?,?,?,?, '2')";

            dbConnection = handler.getConnection();
            try {
                pst = dbConnection.prepareStatement(insert);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pst.setString(1, nameId.getText());
                pst.setString(2, phoneId.getText());
                pst.setString(3, emailId.getText());
                pst.setString(4, String.valueOf(birthdayId.getValue()));
                pst.setString(5, getGender());
                pst.setString(6, getSpecialty());
                pst.setString(7, usernameId.getText());
                pst.setString(8, passiId.getText());

                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (getSpecialty() == "AEROBIC") {
            String insert = "INSERT INTO trainers(name, phone, email, birthday, gender, specialty, username, password, hallID)"
                    + "VALUES (?,?,?,?,?,?,?,?, '3')";

            dbConnection = handler.getConnection();
            try {
                pst = dbConnection.prepareStatement(insert);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pst.setString(1, nameId.getText());
                pst.setString(2, phoneId.getText());
                pst.setString(3, emailId.getText());
                pst.setString(4, String.valueOf(birthdayId.getValue()));
                pst.setString(5, getGender());
                pst.setString(6, getSpecialty());
                pst.setString(7, usernameId.getText());
                pst.setString(8, passiId.getText());

                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } else if (getSpecialty() == "SWIMMING") {
            String insert = "INSERT INTO trainers(name, phone, email, birthday, gender, specialty, username, password, hallID)"
                    + "VALUES (?,?,?,?,?,?,?,?, '4')";

            dbConnection = handler.getConnection();
            try {
                pst = dbConnection.prepareStatement(insert);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pst.setString(1, nameId.getText());
                pst.setString(2, phoneId.getText());
                pst.setString(3, emailId.getText());
                pst.setString(4, String.valueOf(birthdayId.getValue()));
                pst.setString(5, getGender());
                pst.setString(6, getSpecialty());
                pst.setString(7, usernameId.getText());
                pst.setString(8, passiId.getText());

                pst.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


    ObservableList<DetOfHallsTable> observableList1 = FXCollections.observableArrayList();
    ObservableList<ScheduleTable> observableList2 = FXCollections.observableArrayList();
    ObservableList<FeedbackTable> observableList3 = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new Handler();
        choiceBoxGender.setItems(FXCollections.observableArrayList("MALE", "FEMALE"));
        choiceBoxSpecialty.setItems(FXCollections.observableArrayList("FITNESS", "BODYBUILDING", "AEROBIC", "SWIMMING"));

        dbConnection = handler.getConnection();

        //second tab: DETAILS OF THE HALLS
        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from halls");
            while (rs.next()) {
                observableList1.add(new DetOfHallsTable(rs.getString("name"), rs.getBytes("image")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_image.setCellValueFactory(new PropertyValueFactory<>("image"));

        detOfHallsTable.setItems(observableList1);

        //third tab: WORK HOURS
        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from schedule");
            while(rs.next())
                observableList2.add(new ScheduleTable(rs.getInt("scheduleID"), rs.getString("customer"),
                        rs.getString("date"), rs.getString("time"), rs.getString("hall")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_schedID.setCellValueFactory(new PropertyValueFactory<>("scheduleID"));
        col_customer.setCellValueFactory(new PropertyValueFactory<>("customer"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        col_time.setCellValueFactory(new PropertyValueFactory<>("time"));
        col_hall.setCellValueFactory(new PropertyValueFactory<>("hall"));

        workHoursTable.setItems(observableList2);

        //fourth tab: FEEDBACK FROM CLIENTS

        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from feedbacks");
            while (rs.next())
                observableList3.add(new FeedbackTable(rs.getInt("id"), rs.getString("client"),
                        rs.getString("trainer"), rs.getString("stars"), rs.getString("feedback")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_client.setCellValueFactory(new PropertyValueFactory<>("client"));
        col_trainer.setCellValueFactory(new PropertyValueFactory<>("trainer"));
        col_stars.setCellValueFactory(new PropertyValueFactory<>("stars"));
        col_feedback.setCellValueFactory(new PropertyValueFactory<>("feedback"));

        feedbackTable.setItems(observableList3);
    }


    public String getGender() {
        return (String) choiceBoxGender.getSelectionModel().getSelectedItem();
    }

    public String getSpecialty() {
        return (String) choiceBoxSpecialty.getSelectionModel().getSelectedItem();
    }


}
