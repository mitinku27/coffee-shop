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

public class CoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        setTitle("Cafe  ToDay!");

        final CheckBox mochaChk= (CheckBox) findViewById(R.id.checkBoxMochaCoffee);
        final CheckBox espressoChk= (CheckBox) findViewById(R.id.checkBoxEspresso);
        final CheckBox cappucinoChk= (CheckBox) findViewById(R.id.checkboxCappuccino);
        final CheckBox latteChk= (CheckBox) findViewById(R.id.checkboxLatte);
        final CheckBox whiteChk= (CheckBox) findViewById(R.id.checkboxWhite);

        final EditText mochaEt= (EditText) findViewById(R.id.editTextMochaQuantity);
        final EditText espressoEt= (EditText) findViewById(R.id.editTextEspresso);
        final EditText cappucinoEt= (EditText) findViewById(R.id.editTextCappuccino);
        final EditText latteEt= (EditText) findViewById(R.id.editTextLatte);
        final EditText whiteEt= (EditText) findViewById(R.id.editTextWhite);

        Button order= (Button) findViewById(R.id.buttonOrder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mochaChk.isChecked()){
                    quantity= Integer.parseInt(mochaEt.getText().toString());
                    price=100*quantity;
                    result=result+" Mocha Coffee\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(espressoChk.isChecked()){
                    quantity= Integer.parseInt(espressoEt.getText().toString());
                    price=150*quantity;
                    result=result+" Espresso Coffee\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(cappucinoChk.isChecked()){
                    quantity= Integer.parseInt(cappucinoEt.getText().toString());
                    price=110*quantity;
                    result=result+" Cappucino Coffee\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(latteChk.isChecked()){
                    quantity= Integer.parseInt(latteEt.getText().toString());
                    price=120*quantity;
                    result=result+" Latte Coffee\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(whiteChk.isChecked()){
                    quantity= Integer.parseInt(whiteEt.getText().toString());
                    price=80*quantity;
                    result=result+" White Coffee\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                Toast.makeText(CoffeeActivity.this,"Order Confirmed",Toast.LENGTH_LONG).show();
                startActivity(new Intent(CoffeeActivity.this,MenuActivity.class));
            }
        });
    }
}
