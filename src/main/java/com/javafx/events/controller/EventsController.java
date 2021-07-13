package com.javafx.events.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class EventsController {

    @FXML
    private TextArea mainTextArea;

    @FXML
    private Button lowerCaseButton;

    public void initialize() {
//        lowerCaseButton.setOnAction(actionEvent -> {
//            System.out.println(actionEvent.getEventType());
//            String originalText = mainTextArea.getText();
//            String lowerText = originalText.toLowerCase();
//            mainTextArea.setText(lowerText);
//        });

//        lowerCaseButton.addEventHandler(ActionEvent.ACTION, actionEvent -> {
//            System.out.println(actionEvent.getEventType());
//            String originalText = mainTextArea.getText();
//            String lowerText = originalText.toLowerCase();
//            mainTextArea.setText(lowerText);
//        });

//        lowerCaseButton.addEventFilter(ActionEvent.ACTION, actionEvent -> {
//            System.out.println(actionEvent.getEventType());
//            String originalText = mainTextArea.getText();
//            String lowerText = originalText.toLowerCase();
//            mainTextArea.setText(lowerText);
//        });
//
//        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, (EventHandler<KeyEvent>) keyEvent -> {
//            System.out.println("was pressed: " + keyEvent.getCharacter());
//        });

//        mainTextArea.setOnKeyTyped(keyEvent -> System.out.println("Keyboard button pressed: " + keyEvent.getCharacter()));
        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> System.out.println("Keyboard button pressed: " + keyEvent.getCharacter()));
//        mainTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> System.out.println("Secon event used by filter."));

        mainTextArea.addEventFilter(MouseEvent.MOUSE_PRESSED, mouseEvent -> System.out.println("How many times mouse was clicked? " + mouseEvent.getClickCount()));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_ENTERED, mouseEvent -> System.out.println("Mouse entered. "));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_EXITED, mouseEvent -> System.out.println("Mouse exited. "));
        mainTextArea.addEventFilter(MouseEvent.MOUSE_EXITED, mouseEvent -> System.out.println("X coordinate: " + mouseEvent.getScreenX()));
//        mainTextArea.addEventFilter(MouseEvent.MOUSE_MOVED, mouseEvent -> System.out.println("Mouse moved " + counter()));
    }

    public void toLowerCaseAction(ActionEvent actionEvent) {
        System.out.println("toLowerCaseAction was used.");
        String originalText = mainTextArea.getText();
        String lowerText = originalText.toLowerCase();
        mainTextArea.setText(lowerText);
    }
}
