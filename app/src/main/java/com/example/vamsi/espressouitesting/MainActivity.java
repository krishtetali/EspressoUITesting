package com.example.vamsi.espressouitesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.edit1);
    }

    public void dosomething(View view) {
        Intent i1 = new Intent(this,Second.class);
        i1.putExtra("key1",e1.getText().toString());
        startActivity(i1);

    }
}
