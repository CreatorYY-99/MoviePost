package com.example.moviepost;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;

import javax.sql.DataSource;

public class MoviePlay extends AppCompatActivity {
    VideoView bofang;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_;

        bofang = findViewById(R.id.);
        ExoPlayer player = ExoPlayerFactory.newSimpleInstance(this);
        player.setPlayWhenReady(true);
        bofang.setPlayer(player);
        DataSource.Factory factory = new DefaultDataSourceFactory(this,true);
        Uri uri = Uri.parse("http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8");
        HlsMediaSource source = new HlsMediaSource.Factory(factory).createMediaSource();
        player.prepare(source);
    }
}
