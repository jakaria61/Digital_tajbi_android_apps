package com.shirintech.digitaltasbi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textDisplay;
    Button addButton,subButton,resetButton;

    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textDisplay = findViewById(R.id.textDisplay);
        addButton = findViewById(R.id.addButton);
        subButton =findViewById( R.id.subButton);
        resetButton =findViewById(R.id.resetButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                count =count+1;
                textDisplay.setText(""+count);

            }
        });

        subButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(count==0){
                    //textDisplay.setText("Negative value not support");
                    count=0;
                }
                else {
                    count=count-1;
                    textDisplay.setText(""+count);
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=count*0;
                textDisplay.setText(""+count);
            }
        });

    }
}