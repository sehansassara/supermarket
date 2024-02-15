package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainFormController {
    @FXML
    private AnchorPane centerNode;

    public void initialize() throws IOException {
        loadDashboardForm();
    }

    private void loadDashboardForm() throws IOException {
        AnchorPane dashboarPane = FXMLLoader.load(this.getClass().getResource("/view/dashboardForm.fxml"));


        centerNode.getChildren().clear();
        centerNode.getChildren().add(dashboarPane);
    }

    @FXML
    void btnCustomerOnAction(ActionEvent event) throws IOException {
       AnchorPane customerPane =  FXMLLoader.load(this.getClass().getResource("/view/customerForm.fxml"));

        centerNode.getChildren().clear();
        centerNode.getChildren().add(customerPane);
    }

    @FXML
    void btnDashboardOnAction(ActionEvent event) throws IOException {
        AnchorPane dashboardPane = FXMLLoader.load(this.getClass().getResource("/view/dashboardForm.fxml"));

        centerNode.getChildren().clear();
        centerNode.getChildren().add(dashboardPane);

    }

    @FXML
    void btnItemOnAction(ActionEvent event) throws IOException {
        AnchorPane itemPane = FXMLLoader.load(this.getClass().getResource("/view/itemForm.fxml"));

        centerNode.getChildren().clear();
        centerNode.getChildren().add(itemPane);
    }

    @FXML
    void btnLogoutOnAction(ActionEvent event) {

    }
}
