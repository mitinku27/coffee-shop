package com.example.home.cafecoffeeday;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.home.cafecoffeeday.Global.price;
import static com.example.home.cafecoffeeday.Global.quantity;
import static com.example.home.cafecoffeeday.Global.result;
import static com.example.home.cafecoffeeday.Global.total;

public class PizzaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        setTitle("Cafe  ToDay!");

        final CheckBox bbqChk= (CheckBox) findViewById(R.id.checkboxPizzaBbq);
        final CheckBox italianChk= (CheckBox) findViewById(R.id.checkBoxPizzaItalian);
        final CheckBox mexicanChk= (CheckBox) findViewById(R.id.checkBoxMexicanPizza);

        final EditText bbqEt= (EditText) findViewById(R.id.editTextBbqPizza);
        final EditText mexicanEt= (EditText) findViewById(R.id.editTextMexicanPizza);
        final EditText italianEt= (EditText) findViewById(R.id.editTextItalianPizzaQuantity);

        Button order= (Button) findViewById(R.id.buttonOrder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bbqChk.isChecked()){
                    quantity= Integer.parseInt(bbqEt.getText().toString());
                    price=220*quantity;
                    result=result+" BBQ Chicken Pizza\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(mexicanChk.isChecked()){
                    quantity= Integer.parseInt(mexicanEt.getText().toString());
                    price=180*quantity;
                    result=result+" Mexican Pizza\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(italianChk.isChecked()){
                    quantity= Integer.parseInt(italianEt.getText().toString());
                    price=150*quantity;
                    result=result+" Italian Pizza\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                Toast.makeText(PizzaActivity.this,"Order Confirmed",Toast.LENGTH_LONG).show();
                startActivity(new Intent(PizzaActivity.this,MenuActivity.class));
            }
        });



    }





}

