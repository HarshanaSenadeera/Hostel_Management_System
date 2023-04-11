package lk.ijse.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginFormController {
    public TextField UserName_Id;
    public PasswordField Pasword_Id;
    public Label lblHide;
    public AnchorPane logging_pane;

    public void CancelOnAction(ActionEvent actionEvent) {
    }

    public void showPasswordOnMousePressed(MouseEvent mouseEvent) {

        Image img = new Image("/lk/ijse/hibernate/view/assests/Open_Eye1.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(20);
        view.setFitWidth(20);
        lblHide.setGraphic(view);

        Pasword_Id.setPromptText(Pasword_Id.getText());
        Pasword_Id.setText("");
        Pasword_Id.setDisable(true);
        Pasword_Id.requestFocus();
    }

    public void LoggingOnAction(ActionEvent actionEvent) {

        
    }

    public void hidePasswordOnMousePressedd(MouseEvent mouseEvent) {
        Image img = new Image("/lk/ijse/hibernate/view/assests/Cloce_Eye1.png");
        ImageView view = new ImageView(img);
        view.setFitHeight(20);
        view.setFitWidth(20);
        lblHide.setGraphic(view);

        Pasword_Id.setText(Pasword_Id.getPromptText());
        Pasword_Id.setPromptText("");
        Pasword_Id.setDisable(false);
    }
}
