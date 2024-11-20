package com.example.pianoj;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.HorizontalScrollView;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class PianoActivity extends AppCompatActivity {

    private MediaPlayer[][] pianoKeys;  // 2D array for keys and octaves

    private static final int TOTAL_OCTAVES = 8;
    private static final int NOTES_PER_OCTAVE = 12;  // Assuming 12 notes per octave

    private int currentOctave = 1;      // Default starting octave

    private HorizontalScrollView scrollView;

    private static final int REQUEST_CODE_CATEGORY = 1;


    private void setupKeyListeners(Button key, int noteIndex) {
        key.setOnClickListener(v -> {
            if (pianoKeys != null && pianoKeys[currentOctave] != null && pianoKeys[currentOctave][noteIndex] != null) {
                pianoKeys[currentOctave][noteIndex].start();  // Play the note at the given index for the current octave
            } else {
                Log.e("PianoActivity", "pianoKeys array is not properly initialized for octave " + currentOctave + " and noteIndex " + noteIndex);
            }
        });
    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano);

        // Get the selected category from the intent
        String category = getIntent().getStringExtra("selectedCategory");
        if (category == null) {
            Log.e("PianoActivity", "Category is null! Setting default piano keys.");
            category = "grand"; // Set a default category if null
        }
        setupPianoKeys(category);

        ImageButton cat = findViewById(R.id.cat);
        if (cat != null) {
            cat.setOnClickListener(v -> {
                Log.d("PianoActivity", "Cat button clicked");
                Intent intent = new Intent(PianoActivity.this, CategoryActivity.class);
                startActivityForResult(intent, REQUEST_CODE_CATEGORY);
            });
        }else {
            Log.e("PianoActivity", "Cat button is null!");  // Log if the button isn't found
        }



        // For Button
        Button keyC1 = findViewById(R.id.keyC1);
        Button keyC1Sharp = findViewById(R.id.keyC1Sharp);

        Button keyD1 = findViewById(R.id.keyD1);
        Button keyD1Sharp = findViewById(R.id.keyD1Sharp);

        Button keyE1 = findViewById(R.id.keyE1);

        Button keyF1 = findViewById(R.id.keyF1);
        Button keyF1Sharp = findViewById(R.id.keyF1Sharp);

        Button keyG1 = findViewById(R.id.keyG1);
        Button keyG1Sharp = findViewById(R.id.keyG1Sharp);

        Button keyA1 = findViewById(R.id.keyA1);
        Button keyA1Sharp = findViewById(R.id.keyA1Sharp);

        Button keyB1 = findViewById(R.id.keyB1);

        setupKeyListeners(keyC1, 0);  // C
        setupKeyListeners(keyC1Sharp, 1);  // C#
        setupKeyListeners(keyD1, 2);  // D
        setupKeyListeners(keyD1Sharp, 3);  // D#
        setupKeyListeners(keyE1, 4);  // E
        setupKeyListeners(keyF1, 5);  // F
        setupKeyListeners(keyF1Sharp, 6);  // F#
        setupKeyListeners(keyG1, 7);  // G
        setupKeyListeners(keyG1Sharp, 8);  // G#
        setupKeyListeners(keyA1, 9);  // A
        setupKeyListeners(keyA1Sharp, 10);  // A#
        setupKeyListeners(keyB1, 11);  // B

// Similarly, you can initialize buttons for the second octave if needed:
        Button keyC2 = findViewById(R.id.keyC2);
        Button keyC2Sharp = findViewById(R.id.keyC2Sharp);

        Button keyD2 = findViewById(R.id.keyD2);
        Button keyD2Sharp = findViewById(R.id.keyD2Sharp);

        Button keyE2 = findViewById(R.id.keyE2);

        Button keyF2 = findViewById(R.id.keyF2);
        Button keyF2Sharp = findViewById(R.id.keyF2Sharp);

        Button keyG2 = findViewById(R.id.keyG2);
        Button keyG2Sharp = findViewById(R.id.keyG2Sharp);

        Button keyA2 = findViewById(R.id.keyA2);
        Button keyA2Sharp = findViewById(R.id.keyA2Sharp);

        Button keyB2 = findViewById(R.id.keyB2);

        setupKeyListeners(keyC2, 0);  // C
        setupKeyListeners(keyC2Sharp, 1);  // C#
        setupKeyListeners(keyD2, 2);  // D
        setupKeyListeners(keyD2Sharp, 3);  // D#
        setupKeyListeners(keyE2, 4);  // E
        setupKeyListeners(keyF2, 5);  // F
        setupKeyListeners(keyF2Sharp, 6);  // F#
        setupKeyListeners(keyG2, 7);  // G
        setupKeyListeners(keyG2Sharp, 8);  // G#
        setupKeyListeners(keyA2, 9);  // A
        setupKeyListeners(keyA2Sharp, 10);  // A#
        setupKeyListeners(keyB2, 11);  // B
// Similarly, you can initialize buttons for the second octave if needed:

        Button keyC3 = findViewById(R.id.keyC3);
        Button keyC3Sharp = findViewById(R.id.keyC3Sharp);

        Button keyD3 = findViewById(R.id.keyD3);
        Button keyD3Sharp = findViewById(R.id.keyD3Sharp);

        Button keyE3 = findViewById(R.id.keyE3);

        Button keyF3 = findViewById(R.id.keyF3);
        Button keyF3Sharp = findViewById(R.id.keyF3Sharp);

        Button keyG3 = findViewById(R.id.keyG3);
        Button keyG3Sharp = findViewById(R.id.keyG3Sharp);

        Button keyA3 = findViewById(R.id.keyA3);
        Button keyA3Sharp = findViewById(R.id.keyA3Sharp);

        Button keyB3 = findViewById(R.id.keyB3);

        setupKeyListeners(keyC3, 0);  // C
        setupKeyListeners(keyC3Sharp, 1);  // C#
        setupKeyListeners(keyD3, 2);  // D
        setupKeyListeners(keyD3Sharp, 3);  // D#
        setupKeyListeners(keyE3, 4);  // E
        setupKeyListeners(keyF3, 5);  // F
        setupKeyListeners(keyF3Sharp, 6);  // F#
        setupKeyListeners(keyG3, 7);  // G
        setupKeyListeners(keyG3Sharp, 8);  // G#
        setupKeyListeners(keyA3, 9);  // A
        setupKeyListeners(keyA3Sharp, 10);  // A#
        setupKeyListeners(keyB3, 11);  // B

// Similarly, you can initialize buttons for the second octave if needed:

        Button keyC4 = findViewById(R.id.keyC4);
        Button keyC4Sharp = findViewById(R.id.keyC4Sharp);

        Button keyD4 = findViewById(R.id.keyD4);
        Button keyD4Sharp = findViewById(R.id.keyD4Sharp);

        Button keyE4 = findViewById(R.id.keyE4);

        Button keyF4 = findViewById(R.id.keyF4);
        Button keyF4Sharp = findViewById(R.id.keyF4Sharp);

        Button keyG4 = findViewById(R.id.keyG4);
        Button keyG4Sharp = findViewById(R.id.keyG4Sharp);

        Button keyA4 = findViewById(R.id.keyA4);
        Button keyA4Sharp = findViewById(R.id.keyA4Sharp);

        Button keyB4 = findViewById(R.id.keyB4);

        setupKeyListeners(keyC4, 0);  // C
        setupKeyListeners(keyC4Sharp, 1);  // C#
        setupKeyListeners(keyD4, 2);  // D
        setupKeyListeners(keyD4Sharp, 3);  // D#
        setupKeyListeners(keyE4, 4);  // E
        setupKeyListeners(keyF4, 5);  // F
        setupKeyListeners(keyF4Sharp, 6);  // F#
        setupKeyListeners(keyG4, 7);  // G
        setupKeyListeners(keyG4Sharp, 8);  // G#
        setupKeyListeners(keyA4, 9);  // A
        setupKeyListeners(keyA4Sharp, 10);  // A#
        setupKeyListeners(keyB4, 11);  // B


        // Similarly, you can initialize buttons for the second octave if needed:
        Button keyC5 = findViewById(R.id.keyC5);
        Button keyC5Sharp = findViewById(R.id.keyC5Sharp);

        Button keyD5 = findViewById(R.id.keyD5);
        Button keyD5Sharp = findViewById(R.id.keyD5Sharp);

        Button keyE5 = findViewById(R.id.keyE5);

        Button keyF5 = findViewById(R.id.keyF5);
        Button keyF5Sharp = findViewById(R.id.keyF5Sharp);

        Button keyG5 = findViewById(R.id.keyG5);
        Button keyG5Sharp = findViewById(R.id.keyG5Sharp);

        Button keyA5 = findViewById(R.id.keyA5);
        Button keyA5Sharp = findViewById(R.id.keyA5Sharp);

        Button keyB5 = findViewById(R.id.keyB5);

        setupKeyListeners(keyC5, 0);  // C
        setupKeyListeners(keyC5Sharp, 1);  // C#
        setupKeyListeners(keyD5, 2);  // D
        setupKeyListeners(keyD5Sharp, 3);  // D#
        setupKeyListeners(keyE5, 4);  // E
        setupKeyListeners(keyF5, 5);  // F
        setupKeyListeners(keyF5Sharp, 6);  // F#
        setupKeyListeners(keyG5, 7);  // G
        setupKeyListeners(keyG5Sharp, 8);  // G#
        setupKeyListeners(keyA5, 9);  // A
        setupKeyListeners(keyA5Sharp, 10);  // A#
        setupKeyListeners(keyB5, 11);  // B

        // Similarly, you can initialize buttons for the second octave if needed:
        Button keyC6 = findViewById(R.id.keyC6);
        Button keyC6Sharp = findViewById(R.id.keyC6Sharp);

        Button keyD6 = findViewById(R.id.keyD6);
        Button keyD6Sharp = findViewById(R.id.keyD6Sharp);

        Button keyE6 = findViewById(R.id.keyE6);

        Button keyF6 = findViewById(R.id.keyF6);
        Button keyF6Sharp = findViewById(R.id.keyF6Sharp);

        Button keyG6 = findViewById(R.id.keyG6);
        Button keyG6Sharp = findViewById(R.id.keyG6Sharp);

        Button keyA6 = findViewById(R.id.keyA6);
        Button keyA6Sharp = findViewById(R.id.keyA6Sharp);

        Button keyB6 = findViewById(R.id.keyB6);

        setupKeyListeners(keyC6, 0);  // C
        setupKeyListeners(keyC6Sharp, 1);  // C#
        setupKeyListeners(keyD6, 2);  // D
        setupKeyListeners(keyD6Sharp, 3);  // D#
        setupKeyListeners(keyE6, 4);  // E
        setupKeyListeners(keyF6, 5);  // F
        setupKeyListeners(keyF6Sharp, 6);  // F#
        setupKeyListeners(keyG6, 7);  // G
        setupKeyListeners(keyG6Sharp, 8);  // G#
        setupKeyListeners(keyA6, 9);  // A
        setupKeyListeners(keyA6Sharp, 10);  // A#
        setupKeyListeners(keyB6, 11);  // B

// Similarly, you can initialize buttons for the second octave if needed:

        Button keyC7 = findViewById(R.id.keyC7);
        Button keyC7Sharp = findViewById(R.id.keyC7Sharp);

        Button keyD7 = findViewById(R.id.keyD7);
        Button keyD7Sharp = findViewById(R.id.keyD7Sharp);

        Button keyE7 = findViewById(R.id.keyE7);

        Button keyF7 = findViewById(R.id.keyF7);
        Button keyF7Sharp = findViewById(R.id.keyF7Sharp);

        Button keyG7 = findViewById(R.id.keyG7);
        Button keyG7Sharp = findViewById(R.id.keyG7Sharp);

        Button keyA7 = findViewById(R.id.keyA7);
        Button keyA7Sharp = findViewById(R.id.keyA7Sharp);

        Button keyB7 = findViewById(R.id.keyB7);

        setupKeyListeners(keyC7, 0);  // C
        setupKeyListeners(keyC7Sharp, 1);  // C#
        setupKeyListeners(keyD7, 2);  // D
        setupKeyListeners(keyD7Sharp, 3);  // D#
        setupKeyListeners(keyE7, 4);  // E
        setupKeyListeners(keyF7, 5);  // F
        setupKeyListeners(keyF7Sharp, 6);  // F#
        setupKeyListeners(keyG7, 7);  // G
        setupKeyListeners(keyG7Sharp, 8);  // G#
        setupKeyListeners(keyA7, 9);  // A
        setupKeyListeners(keyA7Sharp, 10);  // A#
        setupKeyListeners(keyB7, 11);  // B

        // Initialize HorizontalScrollView and SeekBar
        scrollView = findViewById(R.id.scrollView);
        SeekBar seekBar = findViewById(R.id.seekBar);

        // Set SeekBar properties
        seekBar.setMax(6);   // Max value for 6 octaves (0-6)
        seekBar.setProgress(1);  // Default to octave 1

        // Set SeekBar listener
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // Update the current octave when the SeekBar is moved
                currentOctave = progress;
                Log.d("PianoActivity", "Octave changed to: " + currentOctave);

                // Scroll to the corresponding octave
                int maxScroll = scrollView.getChildAt(0).getWidth() - scrollView.getWidth(); // Maximum scroll value
                int scrollX = (int) ((progress / (float) seekBar.getMax()) * maxScroll); // Calculate the scroll position based on SeekBar progress

                // Smoothly scroll to the calculated position
                scrollView.smoothScrollTo(scrollX, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // Optional: Behavior when tracking starts
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // Optional: Behavior when tracking stops
            }
        });





//repet for other OCTAVES.....................................................................
    }



    private void setupPianoKeys(String category) {

        pianoKeys = new MediaPlayer[8][12];// 8 octaves, 12 notes in each


//         Load sounds for octave 0 (just as an example)
        pianoKeys[0][0] = MediaPlayer.create(this, R.raw.classic_c1_note);   // C note
        pianoKeys[0][1] = MediaPlayer.create(this, R.raw.classic_csharp1_note); // C# note
        pianoKeys[0][2] = MediaPlayer.create(this, R.raw.classic_d1_note);   // D note
        pianoKeys[0][3] = MediaPlayer.create(this, R.raw.classic_dsharp1_note); // D# note
        pianoKeys[0][4] = MediaPlayer.create(this, R.raw.classic_e1_note);   // E note
        pianoKeys[0][5] = MediaPlayer.create(this, R.raw.classic_f1_note);   // F note
        pianoKeys[0][6] = MediaPlayer.create(this, R.raw.classic_fsharp1_note); // F# note
        pianoKeys[0][7] = MediaPlayer.create(this, R.raw.classic_g1_note);   // G note
        pianoKeys[0][8] = MediaPlayer.create(this, R.raw.classic_gsharp1_note); // G# note
        pianoKeys[0][9] = MediaPlayer.create(this, R.raw.classic_a1_note);   // A note
        pianoKeys[0][10] = MediaPlayer.create(this, R.raw.classic_asharp1_note); // A# note
        pianoKeys[0][11] = MediaPlayer.create(this, R.raw.classic_b1_note);  // B note

        // Load sounds for octave 0 (just as an example)
        pianoKeys[1][0] = MediaPlayer.create(this, R.raw.classic_c2_note);
        pianoKeys[1][1] = MediaPlayer.create(this, R.raw.classic_csharp2_note); // C# note
        pianoKeys[1][2] = MediaPlayer.create(this, R.raw.classic_d2_note);   // D note
        pianoKeys[1][3] = MediaPlayer.create(this, R.raw.classic_dsharp2_note); // D# note
        pianoKeys[1][4] = MediaPlayer.create(this, R.raw.classic_e2_note);   // E note
        pianoKeys[1][5] = MediaPlayer.create(this, R.raw.classic_f2_note);   // F note
        pianoKeys[1][6] = MediaPlayer.create(this, R.raw.classic_fsharp2_note); // F# note
        pianoKeys[1][7] = MediaPlayer.create(this, R.raw.classic_g2_note);   // G note
        pianoKeys[1][8] = MediaPlayer.create(this, R.raw.classic_gsharp2_note); // G# note
        pianoKeys[1][9] = MediaPlayer.create(this, R.raw.classic_a2_note);   // A note
        pianoKeys[1][10] = MediaPlayer.create(this, R.raw.classic_asharp2_note); // A# note
        pianoKeys[1][11] = MediaPlayer.create(this, R.raw.classic_b2_note);  // B note
        // Load sounds for octave 0 (just as an example)
        pianoKeys[2][0] = MediaPlayer.create(this, R.raw.classic_c3_note);   // C note
        pianoKeys[2][1] = MediaPlayer.create(this, R.raw.classic_csharp3_note); // C# note
        pianoKeys[2][2] = MediaPlayer.create(this, R.raw.classic_d3_note);   // D note
        pianoKeys[2][3] = MediaPlayer.create(this, R.raw.classic_dsharp3_note); // D# note
        pianoKeys[2][4] = MediaPlayer.create(this, R.raw.classic_e3_note);   // E note
        pianoKeys[2][5] = MediaPlayer.create(this, R.raw.classic_f3_note);   // F note
        pianoKeys[2][6] = MediaPlayer.create(this, R.raw.classic_fsharp3_note); // F# note
        pianoKeys[2][7] = MediaPlayer.create(this, R.raw.classic_g3_note);   // G note
        pianoKeys[2][8] = MediaPlayer.create(this, R.raw.classic_gsharp3_note); // G# note
        pianoKeys[2][9] = MediaPlayer.create(this, R.raw.classic_a3_note);   // A note
        pianoKeys[2][10] = MediaPlayer.create(this, R.raw.classic_asharp3_note); // A# note
        pianoKeys[2][11] = MediaPlayer.create(this, R.raw.classic_b3_note);  // B note
        // Load sounds for octave 0 (just as an example)
        pianoKeys[3][0] = MediaPlayer.create(this, R.raw.classic_c4_note);   // C note
        pianoKeys[3][1] = MediaPlayer.create(this, R.raw.classic_csharp4_note); // C# note
        pianoKeys[3][2] = MediaPlayer.create(this, R.raw.classic_d4_note);   // D note
        pianoKeys[3][3] = MediaPlayer.create(this, R.raw.classic_dsharp4_note); // D# note
        pianoKeys[3][4] = MediaPlayer.create(this, R.raw.classic_e4_note);   // E note
        pianoKeys[3][5] = MediaPlayer.create(this, R.raw.classic_f4_note);   // F note
        pianoKeys[3][6] = MediaPlayer.create(this, R.raw.classic_fsharp4_note); // F# note
        pianoKeys[3][7] = MediaPlayer.create(this, R.raw.classic_g4_note);   // G note
        pianoKeys[3][8] = MediaPlayer.create(this, R.raw.classic_gsharp4_note); // G# note
        pianoKeys[3][9] = MediaPlayer.create(this, R.raw.classic_a4_note);   // A note
        pianoKeys[3][10] = MediaPlayer.create(this, R.raw.classic_asharp4_note); // A# note
        pianoKeys[3][11] = MediaPlayer.create(this, R.raw.classic_b4_note);  // B note

        // Load sounds for octave 0 (just as an example)
        pianoKeys[4][0] = MediaPlayer.create(this, R.raw.classic_c5_note);   // C note
        pianoKeys[4][1] = MediaPlayer.create(this, R.raw.classic_csharp5_note); // C# note
        pianoKeys[4][2] = MediaPlayer.create(this, R.raw.classic_d5_note);   // D note
        pianoKeys[4][3] = MediaPlayer.create(this, R.raw.classic_dsharp5_note); // D# note
        pianoKeys[4][4] = MediaPlayer.create(this, R.raw.classic_e5_note);   // E note
        pianoKeys[4][5] = MediaPlayer.create(this, R.raw.classic_f5_note);   // F note
        pianoKeys[4][6] = MediaPlayer.create(this, R.raw.classic_fsharp5_note); // F# note
        pianoKeys[4][7] = MediaPlayer.create(this, R.raw.classic_g5_note);   // G note
        pianoKeys[4][8] = MediaPlayer.create(this, R.raw.classic_gsharp5_note); // G# note
        pianoKeys[4][9] = MediaPlayer.create(this, R.raw.classic_a5_note);   // A note
        pianoKeys[4][10] = MediaPlayer.create(this, R.raw.classic_asharp5_note); // A# note
        pianoKeys[4][11] = MediaPlayer.create(this, R.raw.classic_b5_note);  // B note

        // Load sounds for octave 0 (just as an example)
        pianoKeys[5][0] = MediaPlayer.create(this, R.raw.classic_c6_note);   // C note
        pianoKeys[5][1] = MediaPlayer.create(this, R.raw.classic_csharp6_note); // C# note
        pianoKeys[5][2] = MediaPlayer.create(this, R.raw.classic_d6_note);   // D note
        pianoKeys[5][3] = MediaPlayer.create(this, R.raw.classic_dsharp6_note); // D# note
        pianoKeys[5][4] = MediaPlayer.create(this, R.raw.classic_e6_note);   // E note
        pianoKeys[5][5] = MediaPlayer.create(this, R.raw.classic_f6_note);   // F note
        pianoKeys[5][6] = MediaPlayer.create(this, R.raw.classic_fsharp6_note); // F# note
        pianoKeys[5][7] = MediaPlayer.create(this, R.raw.classic_g6_note);   // G note
        pianoKeys[5][8] = MediaPlayer.create(this, R.raw.classic_gsharp6_note); // G# note
        pianoKeys[5][9] = MediaPlayer.create(this, R.raw.classic_a6_note);   // A note
        pianoKeys[5][10] = MediaPlayer.create(this, R.raw.classic_asharp6_note); // A# note
        pianoKeys[5][11] = MediaPlayer.create(this, R.raw.classic_b6_note);  // B note

        // Load sounds for octave 0 (just as an example)
        pianoKeys[6][0] = MediaPlayer.create(this, R.raw.classic_c7_note);   // C note
        pianoKeys[6][1] = MediaPlayer.create(this, R.raw.classic_csharp7_note); // C# note
        pianoKeys[6][2] = MediaPlayer.create(this, R.raw.classic_d7_note);   // D note
        pianoKeys[6][3] = MediaPlayer.create(this, R.raw.classic_dsharp7_note); // D# note
        pianoKeys[6][4] = MediaPlayer.create(this, R.raw.classic_e7_note);   // E note
        pianoKeys[6][5] = MediaPlayer.create(this, R.raw.classic_f7_note);   // F note
        pianoKeys[6][6] = MediaPlayer.create(this, R.raw.classic_fsharp7_note); // F# note
        pianoKeys[6][7] = MediaPlayer.create(this, R.raw.classic_g7_note);   // G note
        pianoKeys[6][8] = MediaPlayer.create(this, R.raw.classic_gsharp7_note); // G# note
        pianoKeys[6][9] = MediaPlayer.create(this, R.raw.classic_a7_note);   // A note
        pianoKeys[6][10] = MediaPlayer.create(this, R.raw.classic_asharp7_note); // A# note
        pianoKeys[6][11] = MediaPlayer.create(this, R.raw.classic_b7_note);  // B note

        // Load sounds for octave 8 (just as an example)
//        Repeat loading sounds for the other octaves similarly...
        // Load different sound files based on the category
        switch (category) {
            case "grand":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.grand_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.grand_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.grand_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.grand_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.grand_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.grand_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.grand_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.grand_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.grand_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.grand_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.grand_asharp1_note);// A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.grand_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.grand_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.grand_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.grand_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.grand_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.grand_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.grand_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.grand_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.grand_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.grand_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.grand_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.grand_asharp2_note);// A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.grand_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.grand_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.grand_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.grand_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.grand_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.grand_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.grand_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.grand_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.grand_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.grand_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.grand_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.grand_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.grand_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.grand_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.grand_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.grand_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.grand_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.grand_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.grand_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.grand_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.grand_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.grand_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.grand_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.grand_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.grand_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.grand_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.grand_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.grand_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.grand_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.grand_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.grand_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.grand_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.grand_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.grand_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.grand_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.grand_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.grand_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.grand_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.grand_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.grand_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.grand_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.grand_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.grand_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.grand_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.grand_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.grand_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.grand_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.grand_asharp6_note);// A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.grand_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.grand_c_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.grand_csharp_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.grand_d_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.grand_dsharp_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.grand_e_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.grand_f_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.grand_fsharp_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.grand_g_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.grand_gsharp_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.grand_a_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.grand_a_note); // A# note look at this key every time when uo came here idiot
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.grand_b_note);  // B note

                break;
            case "bright":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.bright_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.bright_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.bright_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.bright_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.bright_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.bright_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.bright_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.bright_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.bright_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.bright_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.bright_asharp1_note); // A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.bright_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.bright_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.bright_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.bright_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.bright_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.bright_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.bright_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.bright_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.bright_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.bright_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.bright_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.bright_asharp2_note); // A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.bright_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.bright_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.bright_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.bright_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.bright_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.bright_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.bright_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.bright_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.bright_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.bright_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.bright_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.bright_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.bright_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.bright_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.bright_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.bright_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.bright_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.bright_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.bright_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.bright_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.bright_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.bright_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.bright_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.bright_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.bright_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)


                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.bright_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.bright_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.bright_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.bright_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.bright_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.bright_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.bright_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.bright_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.bright_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.bright_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.bright_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.bright_b5_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.bright_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.bright_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.bright_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.bright_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.bright_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.bright_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.bright_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.bright_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.bright_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.bright_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.bright_asharp6_note); // A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.bright_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.bright_c7_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.bright_csharp7_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.bright_d7_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.bright_dsharp7_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.bright_e7_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.bright_f7_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.bright_fsharp7_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.bright_g7_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.bright_gsharp7_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.bright_a7_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.bright_asharp7_note); // A# note
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.bright_b7_note);  // B note

                break;
            case "classical":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.classic_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.classic_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.classic_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.classic_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.classic_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.classic_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.classic_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.classic_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.classic_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.classic_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.classic_asharp1_note); // A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.classic_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.classic_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.classic_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.classic_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.classic_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.classic_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.classic_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.classic_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.classic_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.classic_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.classic_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.classic_asharp2_note); // A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.classic_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.classic_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.classic_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.classic_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.classic_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.classic_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.classic_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.classic_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.classic_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.classic_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.classic_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.classic_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.classic_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.classic_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.classic_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.classic_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.classic_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.classic_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.classic_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.classic_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.classic_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.classic_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.classic_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.classic_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.classic_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.classic_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.classic_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.classic_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.classic_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.classic_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.classic_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.classic_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.classic_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.classic_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.classic_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.classic_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.classic_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.classic_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.classic_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.classic_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.classic_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.classic_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.classic_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.classic_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.classic_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.classic_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.classic_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.classic_asharp6_note); // A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.classic_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.classic_c7_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.classic_csharp7_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.classic_d7_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.classic_dsharp7_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.classic_e7_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.classic_f7_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.classic_fsharp7_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.classic_g7_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.classic_gsharp7_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.classic_a7_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.classic_asharp7_note); // A# note
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.classic_b7_note);  // B note

                // Load sounds for octave 8 (just as an example)

                break;
            case "closed":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.closed_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.closed_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.closed_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.closed_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.closed_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.closed_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.closed_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.closed_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.closed_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.closed_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.closed_asharp1_note); // A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.closed_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.closed_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.closed_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.closed_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.closed_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.closed_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.closed_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.closed_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.closed_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.closed_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.closed_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.closed_asharp2_note); // A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.closed_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.closed_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.closed_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.closed_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.closed_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.closed_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.closed_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.closed_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.closed_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.closed_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.closed_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.closed_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.closed_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.closed_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.closed_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.closed_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.closed_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.closed_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.closed_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.closed_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.closed_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.closed_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.closed_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.closed_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.closed_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.closed_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.closed_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.closed_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.closed_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.closed_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.closed_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.closed_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.closed_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.closed_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.closed_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.closed_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.closed_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.closed_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.closed_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.closed_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.closed_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.closed_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.closed_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.closed_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.closed_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.closed_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.closed_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.closed_asharp6_note); // A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.closed_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.closed_c7_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.closed_csharp7_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.closed_d7_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.closed_dsharp7_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.closed_e7_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.closed_f7_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.closed_fsharp7_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.closed_g7_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.closed_gsharp7_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.closed_a7_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.closed_asharp7_note); // A# note
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.closed_b7_note);  // B note

                // Load sounds for octave 0 (just as an example)
                break;
            case "soft":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.soft_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.soft_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.soft_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.soft_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.soft_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.soft_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.soft_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.soft_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.soft_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.soft_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.soft_asharp1_note); // A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.soft_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.soft_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.soft_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.soft_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.soft_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.soft_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.soft_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.soft_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.soft_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.soft_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.soft_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.soft_asharp2_note); // A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.soft_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.soft_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.soft_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.soft_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.soft_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.soft_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.soft_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.soft_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.soft_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.soft_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.soft_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.soft_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.soft_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.soft_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.soft_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.soft_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.soft_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.soft_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.soft_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.soft_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.soft_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.soft_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.soft_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.soft_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.soft_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.soft_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.soft_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.soft_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.soft_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.soft_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.soft_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.soft_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.soft_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.soft_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.soft_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.soft_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.soft_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.soft_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.soft_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.soft_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.soft_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.soft_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.soft_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.soft_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.soft_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.soft_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.soft_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.soft_asharp6_note); // A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.soft_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.soft_c7_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.soft_csharp7_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.soft_d7_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.soft_dsharp7_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.soft_e7_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.soft_f7_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.soft_fsharp7_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.soft_g7_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.soft_gsharp7_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.soft_a7_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.soft_asharp7_note); // A# note
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.soft_b7_note);  // B note

                // Load sounds for octave 0 (just as an example)

                break;
            case "rods":
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.rods_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.rods_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.rods_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.rods_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.rods_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.rods_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.rods_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.rods_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.rods_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.rods_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.rods_asharp1_note); // A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.rods_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.rods_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.rods_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.rods_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.rods_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.rods_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.rods_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.rods_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.rods_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.rods_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.rods_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.rods_asharp2_note); // A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.rods_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.rods_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.rods_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.rods_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.rods_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.rods_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.rods_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.rods_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.rods_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.rods_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.rods_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.rods_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.rods_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.rods_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.rods_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.rods_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.rods_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.rods_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.rods_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.rods_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.rods_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.rods_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.rods_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.rods_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.rods_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.rods_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.rods_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.rods_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.rods_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.rods_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.rods_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.rods_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.rods_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.rods_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.rods_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.rods_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.rods_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.rods_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.rods_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.rods_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.rods_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.rods_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.rods_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.rods_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.rods_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.rods_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.rods_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.rods_asharp6_note); // A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.rods_b6_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[6][0] = MediaPlayer.create(this, R.raw.rods_c7_note);   // C note
                pianoKeys[6][1] = MediaPlayer.create(this, R.raw.rods_csharp7_note); // C# note
                pianoKeys[6][2] = MediaPlayer.create(this, R.raw.rods_d7_note);   // D note
                pianoKeys[6][3] = MediaPlayer.create(this, R.raw.rods_dsharp7_note); // D# note
                pianoKeys[6][4] = MediaPlayer.create(this, R.raw.rods_e7_note);   // E note
                pianoKeys[6][5] = MediaPlayer.create(this, R.raw.rods_f7_note);   // F note
                pianoKeys[6][6] = MediaPlayer.create(this, R.raw.rods_fsharp7_note); // F# note
                pianoKeys[6][7] = MediaPlayer.create(this, R.raw.rods_g7_note);   // G note
                pianoKeys[6][8] = MediaPlayer.create(this, R.raw.rods_gsharp7_note); // G# note
                pianoKeys[6][9] = MediaPlayer.create(this, R.raw.rods_a7_note);   // A note
                pianoKeys[6][10] = MediaPlayer.create(this, R.raw.rods_asharp7_note); // A# note
                pianoKeys[6][11] = MediaPlayer.create(this, R.raw.rods_b7_note);  // B note

                // Load sounds for octave 8 (just as an example)

            default:
                pianoKeys[0][0] = MediaPlayer.create(this, R.raw.grand_c1_note);   // C note
                pianoKeys[0][1] = MediaPlayer.create(this, R.raw.grand_csharp1_note); // C# note
                pianoKeys[0][2] = MediaPlayer.create(this, R.raw.grand_d1_note);   // D note
                pianoKeys[0][3] = MediaPlayer.create(this, R.raw.grand_dsharp1_note); // D# note
                pianoKeys[0][4] = MediaPlayer.create(this, R.raw.grand_e1_note);   // E note
                pianoKeys[0][5] = MediaPlayer.create(this, R.raw.grand_f1_note);   // F note
                pianoKeys[0][6] = MediaPlayer.create(this, R.raw.grand_fsharp1_note); // F# note
                pianoKeys[0][7] = MediaPlayer.create(this, R.raw.grand_g1_note);   // G note
                pianoKeys[0][8] = MediaPlayer.create(this, R.raw.grand_gsharp1_note); // G# note
                pianoKeys[0][9] = MediaPlayer.create(this, R.raw.grand_a1_note);   // A note
                pianoKeys[0][10] = MediaPlayer.create(this, R.raw.grand_asharp1_note);// A# note
                pianoKeys[0][11] = MediaPlayer.create(this, R.raw.grand_b1_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[1][0] = MediaPlayer.create(this, R.raw.grand_c2_note);   // C note
                pianoKeys[1][1] = MediaPlayer.create(this, R.raw.grand_csharp2_note); // C# note
                pianoKeys[1][2] = MediaPlayer.create(this, R.raw.grand_d2_note);   // D note
                pianoKeys[1][3] = MediaPlayer.create(this, R.raw.grand_dsharp2_note); // D# note
                pianoKeys[1][4] = MediaPlayer.create(this, R.raw.grand_e2_note);   // E note
                pianoKeys[1][5] = MediaPlayer.create(this, R.raw.grand_f2_note);   // F note
                pianoKeys[1][6] = MediaPlayer.create(this, R.raw.grand_fsharp2_note); // F# note
                pianoKeys[1][7] = MediaPlayer.create(this, R.raw.grand_g2_note);   // G note
                pianoKeys[1][8] = MediaPlayer.create(this, R.raw.grand_gsharp2_note); // G# note
                pianoKeys[1][9] = MediaPlayer.create(this, R.raw.grand_a2_note);   // A note
                pianoKeys[1][10] = MediaPlayer.create(this, R.raw.grand_asharp2_note);// A# note
                pianoKeys[1][11] = MediaPlayer.create(this, R.raw.grand_b2_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[2][0] = MediaPlayer.create(this, R.raw.grand_c3_note);   // C note
                pianoKeys[2][1] = MediaPlayer.create(this, R.raw.grand_csharp3_note); // C# note
                pianoKeys[2][2] = MediaPlayer.create(this, R.raw.grand_d3_note);   // D note
                pianoKeys[2][3] = MediaPlayer.create(this, R.raw.grand_dsharp3_note); // D# note
                pianoKeys[2][4] = MediaPlayer.create(this, R.raw.grand_e3_note);   // E note
                pianoKeys[2][5] = MediaPlayer.create(this, R.raw.grand_f3_note);   // F note
                pianoKeys[2][6] = MediaPlayer.create(this, R.raw.grand_fsharp3_note); // F# note
                pianoKeys[2][7] = MediaPlayer.create(this, R.raw.grand_g3_note);   // G note
                pianoKeys[2][8] = MediaPlayer.create(this, R.raw.grand_gsharp3_note); // G# note
                pianoKeys[2][9] = MediaPlayer.create(this, R.raw.grand_a3_note);   // A note
                pianoKeys[2][10] = MediaPlayer.create(this, R.raw.grand_asharp3_note); // A# note
                pianoKeys[2][11] = MediaPlayer.create(this, R.raw.grand_b3_note);  // B note
                // Load sounds for octave 0 (just as an example)
                pianoKeys[3][0] = MediaPlayer.create(this, R.raw.grand_c4_note);   // C note
                pianoKeys[3][1] = MediaPlayer.create(this, R.raw.grand_csharp4_note); // C# note
                pianoKeys[3][2] = MediaPlayer.create(this, R.raw.grand_d4_note);   // D note
                pianoKeys[3][3] = MediaPlayer.create(this, R.raw.grand_dsharp4_note); // D# note
                pianoKeys[3][4] = MediaPlayer.create(this, R.raw.grand_e4_note);   // E note
                pianoKeys[3][5] = MediaPlayer.create(this, R.raw.grand_f4_note);   // F note
                pianoKeys[3][6] = MediaPlayer.create(this, R.raw.grand_fsharp4_note); // F# note
                pianoKeys[3][7] = MediaPlayer.create(this, R.raw.grand_g4_note);   // G note
                pianoKeys[3][8] = MediaPlayer.create(this, R.raw.grand_gsharp4_note); // G# note
                pianoKeys[3][9] = MediaPlayer.create(this, R.raw.grand_a4_note);   // A note
                pianoKeys[3][10] = MediaPlayer.create(this, R.raw.grand_asharp4_note); // A# note
                pianoKeys[3][11] = MediaPlayer.create(this, R.raw.grand_b4_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[4][0] = MediaPlayer.create(this, R.raw.grand_c5_note);   // C note
                pianoKeys[4][1] = MediaPlayer.create(this, R.raw.grand_csharp5_note); // C# note
                pianoKeys[4][2] = MediaPlayer.create(this, R.raw.grand_d5_note);   // D note
                pianoKeys[4][3] = MediaPlayer.create(this, R.raw.grand_dsharp5_note); // D# note
                pianoKeys[4][4] = MediaPlayer.create(this, R.raw.grand_e5_note);   // E note
                pianoKeys[4][5] = MediaPlayer.create(this, R.raw.grand_f5_note);   // F note
                pianoKeys[4][6] = MediaPlayer.create(this, R.raw.grand_fsharp5_note); // F# note
                pianoKeys[4][7] = MediaPlayer.create(this, R.raw.grand_g5_note);   // G note
                pianoKeys[4][8] = MediaPlayer.create(this, R.raw.grand_gsharp5_note); // G# note
                pianoKeys[4][9] = MediaPlayer.create(this, R.raw.grand_a5_note);   // A note
                pianoKeys[4][10] = MediaPlayer.create(this, R.raw.grand_asharp5_note); // A# note
                pianoKeys[4][11] = MediaPlayer.create(this, R.raw.grand_b5_note);  // B note

                // Load sounds for octave 0 (just as an example)
                pianoKeys[5][0] = MediaPlayer.create(this, R.raw.grand_c6_note);   // C note
                pianoKeys[5][1] = MediaPlayer.create(this, R.raw.grand_csharp6_note); // C# note
                pianoKeys[5][2] = MediaPlayer.create(this, R.raw.grand_d6_note);   // D note
                pianoKeys[5][3] = MediaPlayer.create(this, R.raw.grand_dsharp6_note); // D# note
                pianoKeys[5][4] = MediaPlayer.create(this, R.raw.grand_e6_note);   // E note
                pianoKeys[5][5] = MediaPlayer.create(this, R.raw.grand_f6_note);   // F note
                pianoKeys[5][6] = MediaPlayer.create(this, R.raw.grand_fsharp6_note); // F# note
                pianoKeys[5][7] = MediaPlayer.create(this, R.raw.grand_g6_note);   // G note
                pianoKeys[5][8] = MediaPlayer.create(this, R.raw.grand_gsharp6_note); // G# note
                pianoKeys[5][9] = MediaPlayer.create(this, R.raw.grand_a6_note);   // A note
                pianoKeys[5][10] = MediaPlayer.create(this, R.raw.grand_asharp6_note);// A# note
                pianoKeys[5][11] = MediaPlayer.create(this, R.raw.grand_b6_note);  // B note

                break;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Release MediaPlayer resources
        for (MediaPlayer[] pianoKey : pianoKeys)
            for (MediaPlayer mediaPlayer : pianoKey) {
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
            }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_CATEGORY && resultCode == RESULT_OK) {
            String newCategory = data.getStringExtra("selectedCategory");

            if (newCategory != null) {
                Log.d("PianoActivity", "Received category: " + newCategory);
                setupPianoKeys(newCategory);  // Reconfigure keys based on new category
            } else {
                Log.e("PianoActivity", "Category is null!");
            }
        }
    }

}
