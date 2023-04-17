package lk.ijse.hibernate.util;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public class UILoader {

    public static void loadUiDashBoard(AnchorPane anchorPane, String location) throws IOException {

        anchorPane.getChildren().clear();
        anchorPane.getChildren().add(FXMLLoader.load(Objects.requireNonNull(UILoader.class.getResource("/lk/ijse/hibernate/view/" + location + ".fxml"))));
    }

    public static void LoginOnAction(AnchorPane anchorPane, String location) throws IOException, SQLException {

        Stage window = (Stage) anchorPane.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(UILoader.class.getResource("/lk/ijse/hibernate/view/" + location + ".fxml")))));
        window.setResizable(false);
        window.centerOnScreen();
    }

    public static void NavigateToHome(AnchorPane anchorPane, String location) throws IOException, SQLException {

        Stage primaryStage = (Stage) (anchorPane.getScene().getWindow());
        primaryStage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(UILoader.class.getResource("/lk/ijse/hibernate/view/" + location + ".fxml")))));
        primaryStage.centerOnScreen();
        Platform.runLater(() -> primaryStage.sizeToScene());
    }
}
