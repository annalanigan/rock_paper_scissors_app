package com.example.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView computerHand;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        computerHand = findViewById(R.id.computers_hand);
        result = findViewById(R.id.result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String computersHand = extras.getString("computer");
        String result = extras.getString("results");

        this.computerHand.setText(computersHand);
        this.result.setText(result);

    }

    public void onClickPlayAgain(View button){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}
