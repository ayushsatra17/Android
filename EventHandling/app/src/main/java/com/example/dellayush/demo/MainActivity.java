package com.example.dellayush.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="LogInfo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button) findViewById(R.id.myButton);

        myButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView myText = (TextView) findViewById(R.id.myTextView);
                        myText.setText("Button has been Clicked!");
                    }
                }
        );

        myButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView myText = (TextView) findViewById(R.id.myTextView);
                        myText.setText("Button has been Clicked for long time");
                        return true;
                    }
                }
        );

    }
}
