package lk.ijse.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hibernate.bo.BOFactory;
import lk.ijse.hibernate.bo.custom.UserBO;
import lk.ijse.hibernate.dto.LoginDTO;
import lk.ijse.hibernate.util.NotificationController;
import lk.ijse.hibernate.util.UILoader;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public class LoginFormController {
    public TextField UserName_Id;
    public PasswordField Pasword_Id;
    public Label lblHide;
    public AnchorPane logging_pane;
    int attempts = 0;


    private final UserBO userBO = (UserBO) BOFactory.getBoFactory().getBO(BOFactory.BOTypes.USER);
    public void CancelOnAction(ActionEvent actionEvent) {
        UserName_Id.clear();
        Pasword_Id.clear();
    }

    public void showPasswordOnMousePressed(MouseEvent mouseEvent) {

        Image img = new Image("/lk/ijse/hibernate/view/assests/images/Open_Eye1.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(20);
        view.setFitWidth(20);
        lblHide.setGraphic(view);

        Pasword_Id.setPromptText(Pasword_Id.getText());
        Pasword_Id.setText("");
        Pasword_Id.setDisable(true);
        Pasword_Id.requestFocus();
    }

    public void LoggingOnAction(ActionEvent actionEvent) throws SQLException, IOException, ClassNotFoundException {

        UILoader.LoginOnAction(logging_pane, "DashBoard");
        NotificationController.LoginSuccessfulNotification("Admin");
        ArrayList<LoginDTO> loginDTOS = userBO.getAllUsers();
        attempts++;
        loginDTOS.forEach(e -> {
            if (attempts <= 3) {
                if (e.getUserID().equals(UserName_Id.getText()) && e.getPassword().equals(Pasword_Id.getText())) {
                    try {
                        UILoader.LoginOnAction(logging_pane, "DashBoard");
                        NotificationController.LoginSuccessfulNotification("Admin");
                    } catch (IOException | SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {

                }
            } else {
                UserName_Id.setEditable(false);
                Pasword_Id.setEditable(false);
                NotificationController.LoginUnSuccessfulNotification("Account is Temporarily Disabled or You Did not Sign in Correctly.");
            }
        });
        
    }

    public void hidePasswordOnMousePressedd(MouseEvent mouseEvent) {
        Image img = new Image("/lk/ijse/hibernate/view/assests/images/Cloce_Eye1.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(20);
        view.setFitWidth(20);
        lblHide.setGraphic(view);

        Pasword_Id.setText(Pasword_Id.getPromptText());
        Pasword_Id.setPromptText("");
        Pasword_Id.setDisable(false);
    }
}
