package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        String name = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String lingo = getIntent().getStringExtra("lingo");
        int image = getIntent().getIntExtra("image", 0);

        /*TextView title = findViewById(R.id.title);
        TextView desc = findViewById(R.id.description);
        TextView slang = findViewById(R.id.slang);
        TextView pic = findViewById(R.id.image);*/

        //title.set

    }
}