package com.example.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    Rps game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);

        game = new Rps();
    }

    public void onClickRockButton(View button){
        String compHand = game.computersHand();
        String result = game.checkGame("rock", compHand);

        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("computer", compHand);
        intent.putExtra("results", result);

        startActivity(intent);
    }

}
