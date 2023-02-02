package com.example.cctv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;

import java.net.URL;

public class TuguWelcome extends AppCompatActivity {
    ImageView back;
    VideoView vtuguwelcome;
    PlayerView playerView;
    ExoPlayer exoPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugu_welcome);


        String videoUrl = "https://mam.jogjaprov.go.id:1937/atcs-kota/SimpangAmongrogoTimur.stream/playlist.m3u8";


        exoPlayer = new ExoPlayer.Builder(this).build();
        playerView = findViewById(R.id.exoplayerTugu);
        playerView.setPlayer(exoPlayer);
        MediaItem mediaItem = MediaItem.fromUri(videoUrl);
        exoPlayer.addMediaItem(mediaItem);
        exoPlayer.prepare();
        exoPlayer.setPlayWhenReady(true);
        //exoPlayer.play();

    }
}