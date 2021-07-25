package com.javafx.js;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class MainWebView extends Application {

    @FXML
    private WebView webView;

    @FXML
    private Button backButton;

    @FXML
    private Button nextButton;


    @Override
    public void start(Stage stage) throws Exception {
        VBox mainPane = FXMLLoader.load(getClass().getResource("/browserPane.fxml"));
        Scene scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.setTitle("web browser");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void initialize() {
        WebEngine engine = webView.getEngine();
        engine.load("https://google.pl");
        backButton.setOnAction(x -> engine.executeScript("history.back();"));
        nextButton.setOnAction(x -> engine.executeScript("history.forward();"));
    }
}
