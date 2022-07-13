package controller;

import dbConnection.Handler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import models.ScheduleTable;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerMainTrPage implements Initializable {


    @FXML
    private TableView<ScheduleTable> scheduleTable;

    @FXML
    private TableColumn<ScheduleTable, Integer> col_scheduleID;

    @FXML
    private TableColumn<ScheduleTable, String> col_customer;

    @FXML
    private TableColumn<ScheduleTable, String> col_date;

    @FXML
    private TableColumn<ScheduleTable, String> col_time;

    @FXML
    private TableColumn<ScheduleTable, String> col_hall;

    @FXML
    private TextField nameID;

    @FXML
    private TextField equip;

    @FXML
    private ChoiceBox<String> choiceBoxHall;

    @FXML
    private TextField duration;

    @FXML
    private TextField calBurn;

    @FXML
    private TextField trName;

    @FXML
    private Button createTraining;

    @FXML
    private TextField custName;

    @FXML
    private TextField trainerName;

    @FXML
    private TextField kiloKal;

    @FXML
    private TextField mealTime;

    @FXML
    private Button createDiet;

    private Handler handler;
    private Connection dbConnection;
    private PreparedStatement pst;

    @FXML
    public void onClickActionCreateTraining(ActionEvent actionEvent) {
        createTraining.getScene().getWindow().hide();
        String insert = "INSERT INTO trainers(name, caloriesBurned, equipment, duration, trainer, hall)"
                + "VALUES (?,?,?,?,?,?)";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameID.getText());
            pst.setString(2, calBurn.getText());
            pst.setString(3, equip.getText());
            pst.setString(4, duration.getText());
            pst.setString(5, trName.getText());
            pst.setString(6, getHall());


            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void onClickActionCreateDiet(ActionEvent actionEvent) {
        createDiet.getScene().getWindow().hide();
        String insert = "INSERT INTO diets(kiloKal/day, mealTime, customer, trainer)"
                + "VALUES (?,?,?,?)";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, kiloKal.getText());
            pst.setString(2, mealTime.getText());
            pst.setString(3, custName.getText());
            pst.setString(4, trainerName.getText());


            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    ObservableList<ScheduleTable> observableList1 = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new Handler();

        choiceBoxHall.setItems(FXCollections.observableArrayList("FITNESS", "BODYBUILDING", "AEROBIC", "SWIMMING"));

        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from schedule");
            while(rs.next())
                observableList1.add(new ScheduleTable(rs.getInt("scheduleID"), rs.getString("customer"),
                        rs.getString("date"), rs.getString("time"), rs.getString("hall")));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_scheduleID.setCellValueFactory(new PropertyValueFactory<>("scheduleID"));
        col_customer.setCellValueFactory(new PropertyValueFactory<>("customer"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        col_time.setCellValueFactory(new PropertyValueFactory<>("time"));
        col_hall.setCellValueFactory(new PropertyValueFactory<>("hall"));

        scheduleTable.setItems(observableList1);

    }

    public String getHall() {
        return (String) choiceBoxHall.getSelectionModel().getSelectedItem();
    }

}

