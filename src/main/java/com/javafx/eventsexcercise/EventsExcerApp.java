package com.javafx.eventsexcercise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventsExcerApp extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");

        VBox mainPane = FXMLLoader.load(getClass().getResource("/eventsexcercise/contentPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Events Training");
        stage.show();
    }
}
