package com.example.pianoj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton; // Updated to use ImageButton
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the ImageButton instead of Button
        ImageButton pianoButton = findViewById(R.id.pianoButton);

        // Set listener to go to the piano activity
        pianoButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PianoActivity.class);
            startActivity(intent);
        });
    }
}
//change 1