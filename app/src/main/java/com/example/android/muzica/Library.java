package com.example.android.muzica;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Library extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show the content of the home activity screen
        setContentView(R.layout.activity_library);

        // Takes you to Playing when the button is clicked
        Button playing = (Button) findViewById(R.id.button2);

        // A click listener on the button
        playing.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent playingIntent = new Intent(Library.this, Playing.class);

                // Start the new activity
                startActivity(playingIntent);
            }
        });

        // Takes you to Playlist when the button is clicked
        Button playlist = (Button) findViewById(R.id.button3);

        // A click listener on the button
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent playlistIntent = new Intent(Library.this, Playlist.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });

    }
}
