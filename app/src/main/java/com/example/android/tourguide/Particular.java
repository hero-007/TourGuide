package com.example.android.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Particular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particular);
        String placeN = getIntent().getStringExtra("placeName");
        final String placeI = getIntent().getStringExtra("placeInfo");
        int placeP = getIntent().getIntExtra("placePic",12);
        final double place1 = getIntent().getDoubleExtra("placeD1",12.0000000);
        final double place2 = getIntent().getDoubleExtra("placeD2",12.0000000);

        TextView tv1 = (TextView)findViewById(R.id.final_place_name);
        tv1.setText(placeN);

        ImageView imageView = (ImageView)findViewById(R.id.final_place_pic);
        imageView.setImageResource(placeP);

        TextView tv2 = (TextView)findViewById(R.id.final_place_info);
        tv2.setText(placeI);

        Button gmap = (Button)findViewById(R.id.googleMaps);
        gmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:"+place1+","+place2));
                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }
            }
        });

    }
}
