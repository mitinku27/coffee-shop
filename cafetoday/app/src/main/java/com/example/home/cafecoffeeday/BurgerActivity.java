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

public class BurgerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        setTitle("Cafe  ToDay!");

        final CheckBox buffaloChk= (CheckBox) findViewById(R.id.checkBoxBuffalo);
        final CheckBox cheeseChk= (CheckBox) findViewById(R.id.checkBoxCheeseBurger);
        final CheckBox salmonChk= (CheckBox) findViewById(R.id.checkboxSalmonBurger);
        final CheckBox vegChk= (CheckBox) findViewById(R.id.checkboxVegBurger);
        final CheckBox angusChk= (CheckBox) findViewById(R.id.checkboxAngusBurger);

        final EditText buffaloEt= (EditText) findViewById(R.id.editTextBuffaloQuantity);
        final EditText cheeseEt= (EditText) findViewById(R.id.editTextCheeseBurger);
        final EditText salmonEt= (EditText) findViewById(R.id.editTextSalmonBurger);
        final EditText vegEt= (EditText) findViewById(R.id.editTextVegBurger);
        final EditText angusEt= (EditText) findViewById(R.id.editTextAngusBurger);

        Button order= (Button) findViewById(R.id.buttonOrder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(vegChk.isChecked()){
                    quantity= Integer.parseInt(vegEt.getText().toString());
                    price=120*quantity;
                    result=result+" Vegetable Burger\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(buffaloChk.isChecked()){
                    quantity= Integer.parseInt(buffaloEt.getText().toString());
                    price=180*quantity;
                    result=result+" Buffalo Burger\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(cheeseChk.isChecked()){
                    quantity= Integer.parseInt(cheeseEt.getText().toString());
                    price=150*quantity;
                    result=result+" Cheese Burger\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }
                if(salmonChk.isChecked()){
                    quantity= Integer.parseInt(salmonEt.getText().toString());
                    price=160*quantity;
                    result=result+" Salmon Burger\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                if(angusChk.isChecked()){
                    quantity= Integer.parseInt(angusEt.getText().toString());
                    price=130*quantity;
                    result=result+" Angus Burger\nQuantity: "+quantity+"\nPrice: "+price+"\n";
                    total=total+price;
                }

                Toast.makeText(BurgerActivity.this,"Order Confirmed",Toast.LENGTH_LONG).show();
                startActivity(new Intent(BurgerActivity.this,MenuActivity.class));
            }
        });
    }
}
