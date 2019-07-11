package com.example.dellayush.checkboxapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClicked(View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        boolean checked = ((CheckBox) view).isChecked();
        int id = view.getId();
        switch (id){
            case R.id.checkBox1:
                if(checked) {
                    textView.setText("PEPSI selected" + "\n");
                }
                break;
            case R.id.checkBox2:
                if(checked) {
                    textView.setText("MIRINDA selected" + "\n");
                }
                break;
            case R.id.checkBox3:
                if(checked) {
                    textView.setText("SPRITE selected" + "\n");
                }
                break;
            case R.id.checkBox4:
                if(checked) {
                    textView.setText("COKE selected" + "\n");
                }
                break;
            case R.id.checkBox5:
                if(checked) {
                    textView.setText("LIMCA selected" + "\n");
                }
                break;
        }

    }

}
