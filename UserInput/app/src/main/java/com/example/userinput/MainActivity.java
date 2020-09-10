package com.example.userinput;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }
    public  void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }
    public  void submitOrder(View view) {
        String priceMessage = "Total Amount is " + quantity*5 + "$ \nThank You!";
        displayMessage(priceMessage);


    }
    private void display(int number) {
        TextView quantityTextview = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextview.setText("" + number);
    }
    private void displayPrice(float n) {
        TextView quantity2Textview = (TextView) findViewById(
                R.id.quantity2_text_view);
        quantity2Textview.setText("$" + n);
    }
    private void displayMessage(String  m) {
        TextView quantity2Textview = (TextView) findViewById(
                R.id.quantity2_text_view);
        quantity2Textview.setText(m);
    }
}