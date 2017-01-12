package com.example.fragger.delhitourbooklet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDescription extends AppCompatActivity implements View.OnClickListener{

    Button prevButton;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_description);
        prevButton= (Button) findViewById(R.id.prevButton);
        nextButton= (Button) findViewById(R.id.nextButton);

        ((ImageView)findViewById(R.id.descriptionImageView)).setImageResource(Place.PdescriptionImageId);
        ((TextView)findViewById(R.id.descriptionTitle)).setText(Place.Pname);
        ((TextView)findViewById(R.id.descriptionText)).setText(Place.Pdescription);
        ((TextView)findViewById(R.id.descriptionOpenTime)).setText(Place.PopenTime);
        ((TextView)findViewById(R.id.descriptionCloseTime)).setText(Place.PcloseTime);
        ((TextView)findViewById(R.id.descriptionFees)).setText(Place.Pfees);
        prevButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String name[] = getResources().getStringArray(R.array.PlaceList);
        String description[] =getResources().getStringArray(R.array.Description);
        String open[] =getResources().getStringArray(R.array.OpenTime);
        String close[] =getResources().getStringArray(R.array.CloseTime);
        String fees[] =getResources().getStringArray(R.array.Fees);
        int curPos;
        curPos = Place.currentPosition;

        if(view == prevButton)
        {
            --curPos;
            if(curPos<1) curPos=Place.places_count-1;
        }

        else if(view==nextButton){
            ++curPos;
            if((curPos+1)>Place.places_count) curPos=0;
        }
        Place.load(curPos,name,description,open,close,fees);
        startActivity(new Intent(ShowDescription.this,ShowDescription.class));
        finish();

    }
}
