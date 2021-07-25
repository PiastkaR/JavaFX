package com.javafx.media;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController {

    @FXML
    private Button playButton;
    @FXML
    private MediaView mediaView;

    public void initialize() {
        Media media = new Media("https://sample-videos.com/video123/mp4/240/big_buck_bunny_240p_1mb.mp4");
        MediaPlayer player = new MediaPlayer(media);
        player.setAutoPlay(true);
        mediaView.setMediaPlayer(player);

        playButton.setOnAction(event -> {
            if (player.getStatus() == MediaPlayer.Status.READY || player.getStatus() == MediaPlayer.Status.PAUSED) {
                player.play();
                playButton.setText("Pause");
            } else {
                player.pause();
                playButton.setText("Play");
            }
        });
    }
}
