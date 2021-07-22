package com.javafx.eventsexcercise.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class ContentPaneController {

    @FXML
    private Button clearButton;

    @FXML
    private TextPaneController textPaneController;

    public void initialize() {
        TextArea inputTextArea = textPaneController.getInputTextArea();
        TextArea outputTextArea = textPaneController.getOutputTextArea();
        clearButton.setOnAction(actionEvent -> {
            inputTextArea.clear();
            outputTextArea.clear();
        });
    }

}
