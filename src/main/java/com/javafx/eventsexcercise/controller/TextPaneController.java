package com.javafx.eventsexcercise.controller;


import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class TextPaneController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

        public void initialize() {
        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> {
            reverseTextHandler(inputTextArea, outputTextArea);
        });

        outputTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
            reverseTextHandler(outputTextArea, inputTextArea);
        });

    }

    private void
    reverseTextHandler(TextArea source, TextArea target) {
            target.setText(new StringBuilder(source.getText()).reverse().toString());
    }

    public TextArea getInputTextArea() {
        return inputTextArea;
    }

    public TextArea getOutputTextArea() {
        return outputTextArea;
    }
}

