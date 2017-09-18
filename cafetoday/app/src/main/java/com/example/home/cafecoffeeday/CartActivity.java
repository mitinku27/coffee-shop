package com.example.home.cafecoffeeday;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.home.cafecoffeeday.Global.result;
import static com.example.home.cafecoffeeday.Global.total;


public class CartActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        setTitle("Cafe  ToDay!");

        FloatingActionButton fab= (FloatingActionButton) findViewById(R.id.fab);
        TextView txtResult= (TextView) findViewById(R.id.textviewResult);

        if(Global.quantity>0){
            txtResult.setText(result+"\nTotal Amount: "+total+"\n");

        }
        else
        {
            txtResult.setText("You have selected 0 Items. Please Select Some items.");
        }

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CartActivity.this,MainActivity.class));
            }
        });
    }
}
