package com.example.android.muzica;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Playing extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show the content of the home activity screen
        setContentView(R.layout.activity_playing);

        // Takes you to Library when the button is clicked
        Button library = (Button) findViewById(R.id.button1);

        // A click listener on the button
        library.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open
                Intent libraryIntent = new Intent(Playing.this, Library.class);

                // Start the new activity
                startActivity(libraryIntent);
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
                Intent playlistIntent = new Intent(Playing.this, Playlist.class);

                // Start the new activity
                startActivity(playlistIntent);
            }
        });


    }
}
