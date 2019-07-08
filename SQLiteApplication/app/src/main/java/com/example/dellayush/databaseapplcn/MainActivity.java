package com.example.dellayush.databaseapplcn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    TextView displayText;
    DatabaseHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.inputText);
        displayText = findViewById(R.id.displayTV);
        dbHandler = new DatabaseHandler(this,null,null,1);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void addButtonClick(View v){
//        String input = userInput.getText().toString();
//        displayText.setText(input);
//        userInput.setText("");
        Product products = new Product(userInput.getText().toString());
        dbHandler.addProduct(products);
        printDatabase();
    }

    public void deleteButtonClick(View v){
//        displayText.setText("Deteted "+userInput.getText().toString());
//        userInput.setText("");
//        Product products = new Product(userInput.getText().toString());
//        dbHandler.addProduct(products);
        String inputText= userInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbSting = dbHandler.databasetostring();
        displayText.setText(dbSting);
        userInput.setText("");
    }


}
