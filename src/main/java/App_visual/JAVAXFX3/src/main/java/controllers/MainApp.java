package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
    public class MainApp extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/views/CompraView.fxml"));
            primaryStage.setTitle("Cálculo de Compras");
            primaryStage.setScene(new Scene(root, 300, 400));
            primaryStage.show();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }



