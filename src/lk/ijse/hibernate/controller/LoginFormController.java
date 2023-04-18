package lk.ijse.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.hibernate.entity.Loging;
import lk.ijse.hibernate.util.FactoryConfiguration;
import lk.ijse.hibernate.util.NotificationController;
import lk.ijse.hibernate.util.UILoader;
import org.hibernate.Session;
import org.hibernate.query.Query;


import java.io.IOException;
import java.sql.SQLException;


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

        Session session = FactoryConfiguration.getInstance().getSession();

        Query query = (Query) session.createQuery("from Loging where name =:user_name and Password=:password");
        query.setParameter("user_name", UserName_Id.getText());
        query.setParameter("password", Pasword_Id.getText());
        Loging user = (Loging) query.uniqueResult();
        if (user != null) {
            try {
                UILoader.LoginOnAction(logging_pane, "DashBoard");
                NotificationController.LoginSuccessfulNotification("Admin");

            } catch (IOException ioException) {
                ioException.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        } else {
            NotificationController.LoginUnSuccessfulNotification("");

        }

        session.close();
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
