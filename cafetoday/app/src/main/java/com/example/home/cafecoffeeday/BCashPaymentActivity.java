package com.example.home.cafecoffeeday;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BCashPaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bcash_payment);

        setTitle("Cafe  ToDay!");

        final EditText address= (EditText) findViewById(R.id.editTextAddress);
        final EditText bcash= (EditText) findViewById(R.id.editTextBCash);
        Button order= (Button) findViewById(R.id.buttonOrder);


        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String adrs=address.getText().toString().trim();
                String number=bcash.getText().toString().trim();
                if(adrs.isEmpty())
                {
                    address.setError("Address Can't Be Empty");
                }
                if(number.isEmpty()){
                    bcash.setError("BCash Number Can't Be Empty");
                }
                else{
                    new AlertDialog.Builder(BCashPaymentActivity.this)
                            .setTitle("Confirm BCash Payment")
                            .setMessage(Global.result+"\nYour Bill Total: "+Global.total+"\nYour Address: "+address.getText().toString().trim()+"\nYour BCash Account Number: "+bcash.getText().toString().trim()+"\nConfirm your payment of "+(Global.total+100)+"?\n\n**100Tk Delivery Charge Added")
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int whichButton){
                                    Toast.makeText(BCashPaymentActivity.this, "You Have Confirmed Your Order", Toast.LENGTH_SHORT).show();
                                    Global.total=0;
                                    Global.quantity=0;
                                    Global.price=0;
                                    Global.result="";
                                    startActivity(new Intent(BCashPaymentActivity.this,MainActivity.class));
                                }})
                            .setNegativeButton(android.R.string.no, null).show();
                }

            }
        });

    }
}
