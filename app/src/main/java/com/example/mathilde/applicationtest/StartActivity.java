package com.example.mathilde.applicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;



public class StartActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        textView = (TextView) findViewById(R.id.mood_startactivity_id);
        editText = (EditText) findViewById(R.id.edittext_login_id);

    }

    public void buttonClick(View view) {
        textView.setText(R.string.onClick_text);
    }

    public void goConnect(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        Log.d("Text", editText.getText().toString());
        intent.putExtra("datastring", editText.getText().toString());
        startActivity(intent);
    }


}
