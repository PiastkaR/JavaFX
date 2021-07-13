package com.javafx.eventsexcercise;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class EventsExcerciseController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextArea outputTextArea;

    @FXML
    private Button clearButton;

//    public void initialize() {
//        inputTextArea.addEventFilter(KeyEvent.KEY_RELEASED, keyEvent -> {
//            reverseTextHandler(inputTextArea, outputTextArea);
//        });
//
//        outputTextArea.addEventFilter(KeyEvent.KEY_TYPED, keyEvent -> {
//            reverseTextHandler(outputTextArea, inputTextArea);
//        });
//
//        clearButton.setOnAction(event -> {
//            inputTextArea.clear();
//            outputTextArea.clear();
//        });
//    }

    private void reverseTextHandler(TextArea source, TextArea target) {
        target.setText(new StringBuilder(source.getText()).reverse().toString());
    }
}

