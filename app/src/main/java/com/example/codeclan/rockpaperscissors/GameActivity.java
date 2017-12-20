package com.example.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    TextView gamesWon;
    TextView gameslost;

    Rps game = new Rps();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);
        gamesWon = findViewById(R.id.player_score);
        gameslost = findViewById(R.id.computer_score);

        gamesWon.setText(game.getPlayerScore().toString());
        gameslost.setText(game.getComputerScore().toString());

    }

    public void onClickRockButton(View button){
        String compHand = game.computersHand();
        String result = game.checkGame("rock", compHand);

        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("computer", compHand);
        intent.putExtra("results", result);

        startActivity(intent);
    }

    public void onClickPaperButton(View button){
        String compHand = game.computersHand();
        String result = game.checkGame("paper", compHand);

        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("computer", compHand);
        intent.putExtra("results", result);

        startActivity(intent);
    }

    public void onClickScissorsButton(View button){
        String compHand = game.computersHand();
        String result = game.checkGame("scissors", compHand);

        Intent intent = new Intent(this, ResultActivity.class);

        intent.putExtra("computer", compHand);
        intent.putExtra("results", result);

        startActivity(intent);
    }

}
