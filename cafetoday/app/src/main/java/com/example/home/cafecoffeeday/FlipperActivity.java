package com.example.home.cafecoffeeday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewFlipper;

public class FlipperActivity extends AppCompatActivity {

    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);

        setTitle("Cafe  ToDay!");
        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.startFlipping();
                viewFlipper.setFlipInterval(2000);
            }
        });
    }
}
