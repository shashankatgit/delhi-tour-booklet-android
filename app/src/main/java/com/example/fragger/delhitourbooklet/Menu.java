package com.example.fragger.delhitourbooklet;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String places[];

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        listView = (ListView) findViewById(R.id.menuListView);
        places = getResources().getStringArray(R.array.PlaceList);


        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,places);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String name[] = places;
        String description[] =getResources().getStringArray(R.array.Description);
        String open[] =getResources().getStringArray(R.array.OpenTime);
        String close[] =getResources().getStringArray(R.array.CloseTime);
        String fees[] =getResources().getStringArray(R.array.Fees);
        Place.load(i,name,description,open,close,fees);

        Intent intent=new Intent(Menu.this,ShowDescription.class);

        startActivity(intent);
        }
    }

