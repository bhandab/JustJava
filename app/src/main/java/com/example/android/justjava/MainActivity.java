package com.example.android.justjava;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    private int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }
    public void decrement(View view){
        if (quantity>0) {
            quantity--;
        }
        else{
            quantity=0;
        }
       // display(quantity);
        //displayPrice(quantity*5)
        display(quantity);
    }
    public void increment(View view){
        quantity++ ;
        display(quantity);
    }
    public void submitOrder(View view) {
        //display(quantity);
        displayMessage("Your Total bill amount is $".toUpperCase()+calculatePrice(quantity,5)+"\nThank You!!");
        //displayPrice(quantity*5);

    }
    private void display(int number){
        TextView quantityTextView = (TextView)findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    /**private void displayPrice (int number ){
        TextView priceTextView = (TextView)  findViewById(R.id.price_text_view);
        priceTextView.setText("$"+number);
    }*/
   private void displayMessage(String string){
        TextView messageText = (TextView)findViewById(R.id.price_text_view);
        messageText.setText(string);
    }
    private int calculatePrice(int quantity, int rate){
        return quantity*rate;
    }
}