package com.example.int_systems.africasport;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.int_systems.africasport.AppServices.BioResponce;
import com.example.int_systems.africasport.AppServices.bioAdapter;

import java.util.ArrayList;
import java.util.List;

public class bio extends AppCompatActivity {
    View view;
    Context globalContext;
    List<BioResponce> productList;
    //Response response =new Response();
    ArrayList<String> listItems = new ArrayList<String>();
    //a list to store all the products


    //the recyclerview
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        //getting the recyclerview from xml
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new BioResponce(
                        1,
                        "Lee",
                        "Kaliyati",
                        "Volley Ball",
                        "",
                        R.drawable.lee));

        productList.add(
                new BioResponce(
                        1,
                        "Kossam ",
                        "Kafeso",
                        "Soccer",
                        "",
                        R.drawable.lee));


        //creating recyclerview adapter
        bioAdapter adapter = new bioAdapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }
    }

