package controller;

import dbConnection.Handler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javafx.scene.control.cell.PropertyValueFactory;

import models.FeedbackTable;
import models.DietTable;
import models.ScheduleTableCust;
import org.controlsfx.control.Rating;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ControllerMainCustPage implements Initializable {


    @FXML
    private TableView<ScheduleTableCust> scheduleTable;

    @FXML
    private TableColumn<ScheduleTableCust, Integer> col_scheduleId;

    @FXML
    private TableColumn<ScheduleTableCust, String> col_customer;

    @FXML
    private TableColumn<ScheduleTableCust, String> col_date;

    @FXML
    private TableColumn<ScheduleTableCust, String> col_time;

    @FXML
    private TableColumn<ScheduleTableCust, String> col_hall;

    @FXML
    private TextField nameID;

    @FXML
    private DatePicker dateID;

    @FXML
    private TextField timeID;

    @FXML
    private Button submitID;

    @FXML
    private ChoiceBox<String> choiceBoxHall;

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


    @FXML
    private Button sendId;

    @FXML
    private Rating ratingID;

    @FXML
    private Label ratLabelID;

    @FXML
    private TextArea feedbackID;

    @FXML
    private TextField customerName;

    @FXML
    private TextField trainerName;

    @FXML
    private TableView<DietTable> dietTable;

    @FXML
    private TableColumn<DietTable, Integer> col_dietID;

    @FXML
    private TableColumn<DietTable, String> col_name;

    @FXML
    private TableColumn<DietTable, String> col_kilo;

    @FXML
    private TableColumn<DietTable, String> col_mealTime;

    @FXML
    private TableColumn<DietTable, String> col_custDiet;

    private Handler handler;
    private Connection dbConnection;
    private PreparedStatement pst;

    //first tab: ADD A NEW SCHEDULE

    @FXML
    public void onClickActionSubmitId(ActionEvent actionEvent) {
        submitID.getScene().getWindow().hide();

        String insert = "INSERT INTO schedule(customer, date, time, hall)"
                + "VALUES (?,?,?,?)";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, nameID.getText());
            pst.setString(2, String.valueOf(dateID.getValue()));
            pst.setString(3, timeID.getText());
            pst.setString(4, getHall());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void onClickActionSendId(ActionEvent actionEvent) {
        sendId.getScene().getWindow().hide();
        String insert = "INSERT INTO feedbacks(client, trainer, stars, feedback)"
                + "VALUES (?,?,?,?)";

        dbConnection = handler.getConnection();
        try {
            pst = dbConnection.prepareStatement(insert);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            pst.setString(1, customerName.getText());
            pst.setString(2, trainerName.getText());
            pst.setString(3, ratLabelID.getText());
            pst.setString(4, feedbackID.getText());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }


    ObservableList<ScheduleTableCust> observableList1 = FXCollections.observableArrayList();
    ObservableList<FeedbackTable> observableList2 = FXCollections.observableArrayList();
    ObservableList<DietTable> observableList3 = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        handler = new Handler();

        choiceBoxHall.setItems(FXCollections.observableArrayList("FITNESS", "BODYBUILDING", "AEROBIC", "SWIMMING"));

        dbConnection = handler.getConnection();

        //first page: SCHEDULE

        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from schedule");
            while (rs.next()) {
                observableList1.add(new ScheduleTableCust(rs.getInt("scheduleID"), rs.getString("customer"),
                        rs.getString("date"), rs.getString("time"), rs.getString("hall")));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_scheduleId.setCellValueFactory(new PropertyValueFactory<>("scheduleID"));
        col_customer.setCellValueFactory(new PropertyValueFactory<>("customer"));
        col_date.setCellValueFactory(new PropertyValueFactory<>("date"));
        col_time.setCellValueFactory(new PropertyValueFactory<>("time"));
        col_hall.setCellValueFactory(new PropertyValueFactory<>("hall"));

        scheduleTable.setItems(observableList1);

        //fourth tab: SEE THE DIETS

        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from diet");
            while (rs.next()) {
                observableList3.add(new DietTable(rs.getInt("dietID"), rs.getString("name"),
                        rs.getString("kiloKal/day"), rs.getString("mealTime"), rs.getString("customer")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_dietID.setCellValueFactory(new PropertyValueFactory<>("dietID"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_kilo.setCellValueFactory(new PropertyValueFactory<>("kiloKal/day"));
        col_mealTime.setCellValueFactory(new PropertyValueFactory<>("mealTime"));
        col_custDiet.setCellValueFactory(new PropertyValueFactory<>("customer"));

        dietTable.setItems(observableList3);

        //second page: TRAINERS

        try {
            ResultSet rs = dbConnection.createStatement().executeQuery("select * from feedbacks");
            while (rs.next()) {
                observableList2.add(new FeedbackTable(rs.getInt("id"), rs.getString("client"),
                        rs.getString("trainer"), rs.getString("stars"), rs.getString("feedback")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_client.setCellValueFactory(new PropertyValueFactory<>("client"));
        col_trainer.setCellValueFactory(new PropertyValueFactory<>("trainer"));
        col_stars.setCellValueFactory(new PropertyValueFactory<>("stars"));
        col_feedback.setCellValueFactory(new PropertyValueFactory<>("feedback"));

        feedbackTable.setItems(observableList2);


        ratingID.ratingProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                ratLabelID.setText("Rating: " + newValue.toString());
            }
        });

    }


    public String getHall() {
        return (String) choiceBoxHall.getSelectionModel().getSelectedItem();
    }


}
