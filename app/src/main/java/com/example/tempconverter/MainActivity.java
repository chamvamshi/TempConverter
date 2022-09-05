package com.example.tempconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
      TextView textView;
      EditText editTextTextPersonName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editText = findViewById(R.id.editTextTextPersonName);

    }

    public void convert(View view) {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String Inputstring = editText.getText().toString();
        Double InputDouble = Double.parseDouble(Inputstring);
        Double fahrenheit = (InputDouble*9/5) + 32;

        Snackbar.make(view,"temp in"+" "+InputDouble+  "" + "is" +  "farhrenheit"+"  "+  fahrenheit,Snackbar.LENGTH_LONG).show();
    }
}