package com.blues.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button albumsBtn = (Button) findViewById(R.id.albums_btn);
        albumsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this,AlbumsActivity.class);
                startActivity(i);
            }
        });

        Button artistsBtn = (Button) findViewById(R.id.artists_btn);
        artistsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this,ArtistsActivity.class);
                startActivity(i);
            }
        });

        Button playistBtn = (Button) findViewById(R.id.playist_btn);
        playistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this,PlaylistActivity.class);
                startActivity(i);
            }
        });

        Button addToPlayListBtn= (Button) findViewById(R.id.add_to_playlist_btn);
        addToPlayListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailActivity.this,DetailActivity.class);
                startActivity(i);
            }
        });

    }
}
