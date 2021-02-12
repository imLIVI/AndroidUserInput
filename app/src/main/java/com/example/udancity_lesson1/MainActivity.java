package com.example.udancity_lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    int numberOfCoffees=0;
    public void submitOrder(View view) {
        int total=numberOfCoffees*5;
        String message = "Total: " + "$" + total + "\nThank you!";
        displayMessage(message);
         /*displayPrice(numberOfCoffees*5);
       displayMessage("Thank you!");*/
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.num_text);
        quantityTextView.setText("" + number);
    }

    private void displayPrice(int number) {

        TextView priseTextView = (TextView) findViewById(R.id.price_text);
        priseTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    public void increment(View v){
        int newNum=++numberOfCoffees;
        display(newNum);
        displayPrice(newNum*5);
    }

    public void decrement(View v){
        int newNum=--numberOfCoffees;
        display(newNum);
        displayPrice(newNum*5);
    }
    public void displayMessage(String message)
    {
        TextView priceTextView=(TextView)findViewById(R.id.price_text);
        priceTextView.setText(message);
    }
}