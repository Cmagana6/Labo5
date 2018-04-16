package com.barahona.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Planetas> planetlist;
    RecyclerView recyclerView;
    PlanetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        planetlist = filllist();

        recyclerView = findViewById(R.id.rv1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        adapter = new PlanetAdapter(this,planetlist);

        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Planetas> filllist() {
        ArrayList<Planetas> l = new ArrayList<>();
        String desc = "ijbsadgojbsjgbsaodufbdsaiobfsdkf";

        l.add(new Planetas(1, "omg", desc));
        l.add(new Planetas(2, "watch", desc));
        l.add(new Planetas(3, "this", desc));

        return l;
    }
}
