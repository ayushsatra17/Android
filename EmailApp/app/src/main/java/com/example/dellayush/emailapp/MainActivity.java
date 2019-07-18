package com.example.dellayush.emailapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText subject;
    EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        subject = findViewById(R.id.subject);
        message = findViewById(R.id.message);
    }

    public void sendMail(View view){
        String recipent = "travospirit.123@gmail.com";
        String personName = name.getText().toString();
        String emailSubject = subject.getText().toString();
        String emailMessage = message.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipent});
        intent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);
        intent.putExtra(Intent.EXTRA_TEXT, emailMessage);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an Email client :"));
    }


}
