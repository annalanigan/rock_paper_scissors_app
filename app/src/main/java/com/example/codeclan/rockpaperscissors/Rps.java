package com.example.codeclan.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by annalanigan on 20/12/2017.
 */

public class Rps {

    private String playerMove;
    private HashMap<String, String> winCheck;

    public Rps(String inputMove) {
        this.playerMove = inputMove;
        this.winCheck = new HashMap<>();
        winCheck.put("scissors", "paper");
        winCheck.put("paper", "rock");
        winCheck.put("rock", "scissors");
    }


    public String checkDraw(String compInput) {
        String output = "";
        if (playerMove == compInput) {
            output = "Draw";
        }
        return output;
    }


    public boolean checkWin(String compInput) {
        String value = winCheck.get(playerMove);
        return value == compInput ? true : false ;
    }

    
}
