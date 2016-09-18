package com.blues.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button albumsBtn = (Button) findViewById(R.id.albums_btn);
        albumsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AlbumsActivity.class);
                startActivity(i);
            }
        });

        Button artistsBtn = (Button) findViewById(R.id.artists_btn);
        artistsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,ArtistsActivity.class);
                startActivity(i);
            }
        });

        Button playistBtn = (Button) findViewById(R.id.playist_btn);
        playistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PlaylistActivity.class);
                startActivity(i);
            }
        });

        Button nowPlayingBtn = (Button) findViewById(R.id.nowPlaying_btn);
        nowPlayingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailActivity.class);
                startActivity(i);
            }
        });

    }
}
