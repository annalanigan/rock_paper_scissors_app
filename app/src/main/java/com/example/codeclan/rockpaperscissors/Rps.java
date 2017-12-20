package com.example.codeclan.rockpaperscissors;

/**
 * Created by annalanigan on 20/12/2017.
 */

public class Rps {

    private String playerMove;

    public Rps(String inputMove) {
        this.playerMove = inputMove;
    }


    public String checkDraw(String compInput) {
        String output = "";
        if (playerMove == compInput) {
            output = "Draw";
        }
        return output;
    }



}
