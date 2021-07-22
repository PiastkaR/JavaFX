package com.javafx.multiplemodules.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class MainController {

    @FXML
    private ContentPaneController contentPaneController;

    @FXML
    private ControlPaneController controlPaneController;

    public void initialize() {
        Button lowerCaseButton = controlPaneController.getLowerCaseButton();
        Button upperCaseButton = controlPaneController.getUpperCaseButton();
        TextArea mainTextArea = contentPaneController.getMainTextArea();

        lowerCaseButton.setOnAction(actionEvent -> mainTextArea.setText(mainTextArea.getText().toLowerCase()));
        upperCaseButton.setOnAction(actionEvent -> mainTextArea.setText(mainTextArea.getText().toUpperCase()));
    }


}
