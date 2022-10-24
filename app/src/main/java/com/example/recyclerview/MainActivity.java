package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {
    ArrayList<ItemModel> itemModels = new ArrayList<>();

    int[] itemPics = {R.drawable.couch,R.drawable.fire,R.drawable.gaming,R.drawable.lock,R.drawable.movies,
                      R.drawable.sports,R.drawable.texts,R.drawable.transport,R.drawable.wash,R.drawable.work};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerView);
        setUpItemModels();
        I_RecyclerAdapter adapter = new I_RecyclerAdapter(this, itemModels, this);
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

    @Override
    public void onItemClicked(int position) {
        /*Intent intent = new Intent(MainActivity.this, DisplayActivity.class);

        intent.putExtra("title", itemModels.get(position).getTitle());
        intent.putExtra("description", itemModels.get(position).getDescription());
        intent.putExtra("lingo", itemModels.get(position).getLingo());
        intent.putExtra("image", itemModels.get(position).getImage());

        startActivity(intent);*/
    }
}