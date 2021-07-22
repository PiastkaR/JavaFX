package com.javafx.properties.controller;

import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class VolumeController {
    @FXML
    private Slider volumeSlider;

    @FXML
    private Label volumeLevelLabel;

    public void initialize() {
        StringBinding volumeSliderBinding = volumeSlider.valueProperty().asString();
        volumeLevelLabel.textProperty().bind(volumeSliderBinding);
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            double volume = (Double) newValue;
            if (volume > 75) {
                System.out.println("Too Loud!");
            } else if (volume < 10) {
                System.out.println("Too quiet..");
            }

        });
    }
}

