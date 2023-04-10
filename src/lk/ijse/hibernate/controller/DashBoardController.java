package lk.ijse.hibernate.controller;

import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class DashBoardController {


    public ImageView imgStudent;
    public ImageView imgRooms;
    public ImageView imgKeyMoney;
    public Label lblMenu;
    public Label lblDescription;
    public Button btnManageUser;
    public AnchorPane AdminDashboard;
    public Button btnManageUser1;

    public void userOnAction(ActionEvent actionEvent) {
    }

    public void navigate(MouseEvent mouseEvent) {
    }

    public void playMouseEnterAnimation(MouseEvent mouseEvent) {

        if (mouseEvent.getSource() instanceof ImageView) {
            ImageView icon = (ImageView) mouseEvent.getSource();

            switch (icon.getId()) {
                case "imgStudent":
                    lblMenu.setText("Manage Registration");
                    lblDescription.setText("Click to Make Registration and Add, Update, Delete Student");
                    break;
                case "imgRooms":
                    lblMenu.setText("Manage Rooms");
                    lblDescription.setText("Click to Add, Update, Delete Rooms");
                    break;
                case "imgKeyMoney":
                    lblMenu.setText("Find  Key Money");
                    lblDescription.setText("Click to find remain key money student");
                    break;
            }

            ScaleTransition scaleT = new ScaleTransition(Duration.millis(200), icon);
            scaleT.setToX(1.2);
            scaleT.setToY(1.2);
            scaleT.play();

            DropShadow glow = new DropShadow();
            glow.setColor(Color.ORANGE);
            glow.setWidth(20);
            glow.setHeight(20);
            glow.setRadius(20);
            icon.setEffect(glow);
        }
    }

    public void playMouseExitAnimation(MouseEvent mouseEvent) {

        if (mouseEvent.getSource() instanceof ImageView) {
            ImageView icon = (ImageView) mouseEvent.getSource();
            ScaleTransition scaleT = new ScaleTransition(Duration.millis(200), icon);
            scaleT.setToX(1);
            scaleT.setToY(1);
            scaleT.play();

            icon.setEffect(null);
            lblMenu.setText("Welcome");
            lblDescription.setText("Please select one of above main operations to proceed");
        }
    }

    public void navigateToHome(MouseEvent mouseEvent) {
    }

    public void BackOnAction(ActionEvent actionEvent) {
    }
}
