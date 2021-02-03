package com.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainHelloFx extends Application {
    public static void main(String[] args) {
        System.out.println("Main");
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("start");

        AnchorPane mainPane = FXMLLoader.load(getClass().getResource("/helloFxml.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("Hello java fx!");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop");
    }

    public MainHelloFx() {
        System.out.println("Constructor");
    }

    @Override
    public void init() throws Exception {
        System.out.println("Init");
    }
}
