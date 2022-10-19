package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ItemModel> itemModels = new ArrayList<>();

    int[] itemPics = {R.drawable.couch,R.drawable.fire,R.drawable.gaming,R.drawable.lock,R.drawable.movies,
                      R.drawable.sports,R.drawable.texts,R.drawable.transport,R.drawable.wash,R.drawable.work};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpItemModels();
        I_RecyclerAdapter adapter = new I_RecyclerAdapter(this, itemModels);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    private void setUpItemModels(){
        String[] titles = getResources().getStringArray(R.array.title);
        String[] descriptions = getResources().getStringArray(R.array.description);
        String[] lingos = getResources().getStringArray(R.array.slang);

        for (int i = 0; i < titles.length; i++) {
            itemModels.add(new ItemModel(titles[i], descriptions[i], lingos[i], itemPics[i]));
        }
    }
}