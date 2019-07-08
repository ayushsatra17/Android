package com.example.dellayush.mynewapp;

import android.content.res.Resources;
import android.os.Bundle;
import android.app.Activity;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout relLayout = new RelativeLayout(this);

        Button newButton = new Button(this);
        newButton.setId(1);
        EditText userName = new EditText(this);
        userName.setId(2);

        relLayout.setBackgroundColor(Color.GREEN);
        newButton.setBackgroundColor(Color.RED);
        newButton.setText("Click Me!");

        RelativeLayout.LayoutParams buttonDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        RelativeLayout.LayoutParams userNameDetails =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        userNameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        userNameDetails.addRule(RelativeLayout.CENTER_VERTICAL);
        userNameDetails.addRule(RelativeLayout.ABOVE,newButton.getId());
        userNameDetails.setMargins(0,0,0,50);

        Resources r = getResources();
        int pixelValue = (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,350,r.getDisplayMetrics());
        userName.setWidth(pixelValue);

        relLayout.addView(newButton,buttonDetails);
        relLayout.addView(userName,userNameDetails);
        setContentView(relLayout);
    }


}
