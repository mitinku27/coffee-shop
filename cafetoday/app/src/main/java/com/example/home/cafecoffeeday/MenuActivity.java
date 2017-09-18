package com.example.home.cafecoffeeday;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        setTitle("Cafe  ToDay!");

        FloatingActionButton fab= (FloatingActionButton) findViewById(R.id.fab);
        ListView lv= (ListView) findViewById(R.id.itemListView);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:
                        startActivity(new Intent(MenuActivity.this,PizzaActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(MenuActivity.this,BurgerActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(MenuActivity.this,CoffeeActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(MenuActivity.this,DrinksActivity.class));
                        break;

                }
            }
        });

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this,MainActivity.class));
            }
        });
    }
}
