package com.example.basketballscorecounter;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    int valueA = 0;
    int valueB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    private void displayPrice(int number) {
//        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
//        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
//    }


    public void pointA3(View view)
    {
        valueA = valueA + 3;
        displayA(valueA);
    }

    public void pointB3(View view)
    {
        valueB = valueB + 3;
        displayB(valueB);
    }

    public void pointA2(View view)
    {
        valueA = valueA + 2;
        displayA(valueA);
    }

    public void pointB2(View view)
    {
        valueB = valueB + 2;
        displayB(valueB);
    }

    public void freeA(View view)
    {
        valueA = valueA + 1;
        displayA(valueA);
    }

    public void freeB(View view)
    {
        valueB = valueB + 1;
        displayB(valueB);
    }



//    private void displayMessage(String message) {
//        TextView priceTextView = (TextView) findViewById(R.id.teamA);
//        priceTextView.setText(message);
//    }

    // This method is called when the order button is clicked.
    public void reset(View view) {
       valueA = 0;
       valueB = 0;
       displayA(valueA);
       displayB(valueB);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamB);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.teamA);
        quantityTextView.setText("" + number);
    }
}
