package lk.ijse.hibernate.controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class StudentManageController {


    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtContactNo;
    public JFXTextField txtAddress;
    public JFXComboBox cmbGender;
    public JFXDatePicker datePickerDOB;
    public TableView tblStudent;
    public Button btnAddNew;
    public Button btnSave;
    public Button btnDelete;
    public JFXTextField txtSearch;
    public Button btnBack1;
    public AnchorPane StudentPane;

    public void btnAddNew_OnAction(ActionEvent actionEvent) {
    }

    public void btnSave_OnAction(ActionEvent actionEvent) {
    }

    public void btnDelete_OnAction(ActionEvent actionEvent) {
    }

    public void BackOnAction(ActionEvent actionEvent) {
    }

    public void txtSearchOnAction(ActionEvent actionEvent) {
    }

    public void navigateToHome(MouseEvent mouseEvent) {
    }
}
