package com.example.vaibhav.screen38;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapter.Screen38_Adapter;
import model.Screen38_Model;

public class Screen38Activity extends AppCompatActivity {

    private Integer imgpicgiral[] = {R.drawable.img2, R.drawable.image1, R.drawable.img2};
    private Integer profileimage[] =  {R.drawable.men, R.drawable.men, R.drawable.men};
    private String tv1[] = {"JACKET","SCARF","DRESS"};

    private String tv2[] = {"Very nice dress, nice soft fabric. High quality sewn. ",
            "Add an element of fun to your persona wearing this\nblack coloured stole.",
            "Lusting after luster wearing dress by Soie. Made\nfrom polyester fabric style."};
    private String tv3[] = {"Jennifer Horn","Michael Douglas","Maria Rodriguez"};
    private String tv4[] = {"13:12 PM, MONDAY ","13:47 PM, TUESDAY ","16:13 PM, TUESDAY"};
    private String tv5[] = {"279","198","238"};
    private String tv6[] = {"324","247","136"};
    private String tv7[] = {"34","29","29"};

    private RecyclerView recyclerView;
    private ArrayList<Screen38_Model> screen38_models;
    private Screen38_Adapter screen38_adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen38);

        recyclerView = findViewById(R.id.recy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Screen38Activity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        screen38_models = new ArrayList<>();

        for (int i = 0; i < imgpicgiral.length; i++) {
            Screen38_Model ab = new Screen38_Model(imgpicgiral[i],profileimage[i],tv1[i],tv2[i],tv3[i],tv4[i],tv5[i],tv6[i],tv7[i]);
            screen38_models.add(ab);
        }
        screen38_adapter = new Screen38_Adapter(Screen38Activity.this, screen38_models);
        recyclerView.setAdapter(screen38_adapter);
    }
}
