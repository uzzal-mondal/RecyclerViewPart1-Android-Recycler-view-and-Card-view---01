package com.example.uzzal.recyclerviewatifsir_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id find
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView_id);
        //set the properties
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(this));//Linear Layout
        mRecyclerView.setLayoutManager(new GridLayoutManager(this,2)); //Grid Layout 2 means - 2 coloums in row

        //adapter set
        myAdapter = new MyAdapter(this, getPlayers());
        mRecyclerView.setAdapter(myAdapter);


    }

    // add models to arrayList
    private ArrayList<Model> getPlayers() {

        ArrayList<Model> models = new ArrayList<>();

        Model p = new Model();
        p.setTitle("England");
        p.setDescription("This is  england country");
        p.setImg(R.drawable.england);
        models.add(p);

        p = new Model();
        p.setTitle("India");
        p.setDescription("This is  India country");
        p.setImg(R.drawable.india);
        models.add(p);


        p = new Model();
        p.setTitle("Newzealand");
        p.setDescription("This is Newzealand charming country");
        p.setImg(R.drawable.newzeland);
        models.add(p);


        p = new Model();
        p.setTitle("South Africa");
        p.setDescription("This is South Africa charming country");
        p.setImg(R.drawable.suothafrica);
        models.add(p);


        p = new Model();
        p.setTitle("Pakistan");
        p.setDescription("This is Pakistan charming country");
        p.setImg(R.drawable.pakistan);
        models.add(p);


        p = new Model();
        p.setTitle("Australia");
        p.setDescription("This is Australia charming country");
        p.setImg(R.drawable.australia);
        models.add(p);


        p = new Model();
        p.setTitle("Bangladesh");
        p.setDescription("This is my charming country");
        p.setImg(R.drawable.bangla);
        models.add(p);


        p = new Model();
        p.setTitle("Srilanka");
        p.setDescription("This is Srilanka charming country");
        p.setImg(R.drawable.srilanka);
        models.add(p);


        p = new Model();
        p.setTitle("WestIndies");
        p.setDescription("This is WestIndies charming country");
        p.setImg(R.drawable.wesindies);
        models.add(p);

        p = new Model();
        p.setTitle("Afghanistan");
        p.setDescription("This is Afghanistan charming country");
        p.setImg(R.drawable.afganstan);
        models.add(p);

        return models;
    }
}
