package com.javafx.login;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Label usernameLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private Button loginButton;

    public void initialize() {
        System.out.println("Controller created!"); //this method is used by implements initialziation (old version)
        usernameTextField.setText("Txt from controller!");
        loginButton.setText("Click me.");
    }
}
