package com.example.pianoj;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        // Assuming you have 6 ImageButtons for the 6 piano categories
        ImageButton grandButton = findViewById(R.id.grand);
        ImageButton brightButton = findViewById(R.id.bright);
        ImageButton classicButton = findViewById(R.id.classical);
        ImageButton closedButton = findViewById(R.id.closed);
        ImageButton softButton = findViewById(R.id.soft);
        ImageButton rodsButton = findViewById(R.id.rods);

        // Replace with actual ID
        // Replace with actual ID
        // Add ImageButtons for the remaining 4 categories...

        // Set onClick listeners to select a category
                grandButton.setOnClickListener(v -> selectCategory("grand"));
                brightButton.setOnClickListener(v -> selectCategory("bright"));
                classicButton.setOnClickListener(v -> selectCategory("classic"));
                closedButton.setOnClickListener(v -> selectCategory("closed"));
                softButton.setOnClickListener(v -> selectCategory("soft"));
                rodsButton.setOnClickListener(v -> selectCategory("rods"));
        // Set listeners for the other categories...
    }

private void selectCategory(String category) {
    // Set result with selected category and finish
    Intent resultIntent = new Intent();
    resultIntent.putExtra("selectedCategory", category);
    setResult(RESULT_OK, resultIntent);
    finish();
}
}
