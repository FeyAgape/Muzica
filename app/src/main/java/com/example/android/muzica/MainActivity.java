package com.example.android.muzica;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Show the content of the home activity screen
        setContentView(R.layout.activity_main);

        // Takes you to home when the welcome button is clicked
        Button welcome = (Button) findViewById(R.id.welcome);

        // A click listener on the welcome button
        welcome.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HomeActivity}
                Intent homeIntent = new Intent(MainActivity.this, Home.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });
    }
}
