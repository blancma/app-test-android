package com.example.mathilde.applicationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

public class LoginActivity extends AppCompatActivity {

    private TextView dataFirstActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Bundle bundle = getIntent().getExtras();
        dataFirstActivity = (TextView) findViewById(R.id.texttap_startactivity_id);
        dataFirstActivity.setText(bundle.getString("datastring"));


    }

    public void goList (View view){
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    public void back (View v) {
        super.onBackPressed();
    }
}
