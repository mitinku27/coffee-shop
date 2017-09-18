package com.example.home.cafecoffeeday;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        setTitle("Cafe  ToDay!");

        ImageButton cash,bcash;

        cash= (ImageButton) findViewById(R.id.imageButtonCashPay);
        bcash= (ImageButton) findViewById(R.id.imageButtonBCashPay);

        cash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(Global.quantity==0){
                    Toast.makeText(PaymentActivity.this,"Please Select Some Items",Toast.LENGTH_LONG).show();
                }
                else{
                    new AlertDialog.Builder(PaymentActivity.this)
                            .setTitle("Confirm Cash Payment")
                            .setMessage(Global.result+"\nYour Bill Total: "+Global.total+"\nConfirm your payment of "+Global.total+"?")
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int whichButton){
                                    Toast.makeText(PaymentActivity.this, "You Have Confirmed Your Order", Toast.LENGTH_SHORT).show();
                                    Global.total=0;
                                    Global.quantity=0;
                                    Global.price=0;
                                    Global.result="";
                                    startActivity(new Intent(PaymentActivity.this,MainActivity.class));
                                }})
                            .setNegativeButton(android.R.string.no, null).show();


                }

            }
        });

        bcash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Global.quantity==0){
                    Toast.makeText(PaymentActivity.this,"Please Select Some Items",Toast.LENGTH_LONG).show();
                }

                else{
                    startActivity(new Intent(PaymentActivity.this,BCashPaymentActivity.class));
                }
            }
        });
    }
}
