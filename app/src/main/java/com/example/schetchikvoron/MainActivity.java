package com.example.schetchikvoron;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mCrowsCounterButton;
    private int mCount=0;
    private TextView mInfoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton=(Button)findViewById(R.id.button_counter);
        mInfoTextView=(TextView)findViewById(R.id.helloTextView);
        mCrowsCounterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mInfoTextView.setText("Я насчитал "+ ++mCount +" ворон");
            }
        });
    }

    public void onClick(View view) {
        TextView helloTextView=(TextView)findViewById(R.id.helloTextView);
        helloTextView.setText("Hello Kitty!");
    }
}