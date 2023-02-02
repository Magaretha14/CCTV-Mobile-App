package com.example.cctv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.ui.PlayerView;

public class BunderanPLN extends AppCompatActivity {
    ImageView back;
    PlayerView playerView;
    ExoPlayer exoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunderan_pln);

        String videoUrl = "https://mam.jogjaprov.go.id:1937/cctv-kominfogk/BUNDARAN_PLN.stream/playlist.m3u8";


        exoPlayer = new ExoPlayer.Builder(this).build();
        playerView = findViewById(R.id.exoplayerPLN);
        playerView.setPlayer(exoPlayer);
        MediaItem mediaItem = MediaItem.fromUri(videoUrl);
        exoPlayer.addMediaItem(mediaItem);
        exoPlayer.prepare();
        exoPlayer.setPlayWhenReady(true);
        //exoPlayer.play();

    }
}