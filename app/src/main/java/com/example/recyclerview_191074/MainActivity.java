package com.example.recyclerview_191074;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.recyclerview_191074.Adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Animals> animalsList=new ArrayList<>();
RecyclerView recyclerView;
RecyclerViewAdapter recyclerViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rv);
        recyclerViewAdapter=new RecyclerViewAdapter(MainActivity.this, animalsList);
        animalsList.add(new Animals(R.drawable.cat,"Muffin","6000"));
        animalsList.add(new Animals(R.drawable.dog,"Max","8000"));
        animalsList.add(new Animals(R.drawable.fish,"Chichi","7000"));
        animalsList.add(new Animals(R.drawable.parrot,"Mithu","5000"));
        animalsList.add(new Animals(R.drawable.rabbit,"Softie","7000"));
        animalsList.add(new Animals(R.drawable.babylion,"Simba","100000"));
        animalsList.add(new Animals(R.drawable.ducky,"Ducky","10000"));
        animalsList.add(new Animals(R.drawable.pigeom,"peggy","3000"));
        animalsList.add(new Animals(R.drawable.turtle,"SlowWo","7000"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);

    }

}