package com.javafx.multiplemodules;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MultipleModulesApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");

        AnchorPane mainPane = FXMLLoader.load(getClass().getResource("/multiplemodules/mainPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Main Pane ");
        stage.show();
    }
}
