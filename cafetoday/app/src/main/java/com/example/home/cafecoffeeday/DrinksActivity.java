package com.example.home.cafecoffeeday;

import android.content.Intent;
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

public class DrinksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        setTitle("Cafe  ToDay!");

        final CheckBox dumChk= (CheckBox) findViewById(R.id.checkboxDumBiriyani);
        final CheckBox kacchiChk= (CheckBox) findViewById(R.id.checkboxKacchiBiriyani);
        final CheckBox hydrabadiChk= (CheckBox) findViewById(R.id.checkBoxHydrabadi);
        final CheckBox muttonBiriyaniChk= (CheckBox) findViewById(R.id.checkboxMuttonBiriyani);
        final CheckBox vegChk= (CheckBox) findViewById(R.id.checkVegBiriyani);

        final EditText dumEt= (EditText) findViewById(R.id.editTextDumBiriyani);
        final EditText kacchiEt= (EditText) findViewById(R.id.editTextKacchiBiriyani);
        final EditText hydrabadiEt= (EditText) findViewById(R.id.editTextHydrabadi);
        final EditText muttonEt= (EditText) findViewById(R.id.editTextMuttonBiriyani);
        final EditText vegEt= (EditText) findViewById(R.id.editTextVegBiriyani);

        Button order= (Button) findViewById(R.id.buttonOrder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vegChk.isChecked()){
                    quantity= Integer.parseInt(vegEt.getText().toString());
                    price=80*quantity;
                    result=result+" Vegetable Biriyani\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(muttonBiriyaniChk.isChecked()){
                    quantity= Integer.parseInt(muttonEt.getText().toString());
                    price=160*quantity;
                    result=result+" Mutton Biriyani\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(hydrabadiChk.isChecked()){
                    quantity= Integer.parseInt(hydrabadiEt.getText().toString());
                    price=220*quantity;
                    result=result+" Hydrabadi Biriyani\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(kacchiChk.isChecked()){
                    quantity= Integer.parseInt(kacchiEt.getText().toString());
                    price=180*quantity;
                    result=result+" Kacchi Biriyani\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(dumChk.isChecked()){
                    quantity= Integer.parseInt(dumEt.getText().toString());
                    price=150*quantity;
                    result=result+" Dum Biriyani\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                Toast.makeText(DrinksActivity.this,"Order Confirmed",Toast.LENGTH_LONG).show();
                startActivity(new Intent(DrinksActivity.this,MenuActivity.class));
            }
        });
    }
}
