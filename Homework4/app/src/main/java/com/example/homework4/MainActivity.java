package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Drama> darr = new ArrayList<>();

        Drama a = new Drama("Memories of the Alhambra", 16 , 8.1 , "Science fantasy, Action", 2018, R.drawable.memories);
        Drama b = new Drama("It's okay not to be okay", 16 , 9.0 , "Drama", 2020, R.drawable.itsok);
        Drama c = new Drama("Itaewon Class", 16 , 8.2 , "Drama, Business", 2020, R.drawable.itaewonclass);
        Drama d = new Drama("Start-up / SandBox", 16 , 8.1 , "Drama, Business", 2020, R.drawable.startup);
        Drama e = new Drama("Healer", 20 , 8.4 , " Action, Thriller", 2014, R.drawable.healer);
        Drama f = new Drama("Goblin", 16 , 8.9 , "  Fantasy,Romance", 2016, R.drawable.goblin);

        darr.add(a);
        darr.add(b);
        darr.add(c);
        darr.add(d);
        darr.add(e);
        darr.add(f);


        RecyclerView drv = findViewById(R.id.rv);
        drv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        drv.setLayoutManager(lm);

        DramaAdapter da = new DramaAdapter(darr,MainActivity.this);
        drv.setAdapter(da);
    }
}