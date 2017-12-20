package com.example.codeclan.rockpaperscissors;

import java.util.HashMap;

/**
 * Created by annalanigan on 20/12/2017.
 */

public class Rps {

    private HashMap<String, String> winCheck;
    private ComputerMove computerMove;

    public Rps() {
        this.winCheck = new HashMap<>();
        winCheck.put("scissors", "paper");
        winCheck.put("paper", "rock");
        winCheck.put("rock", "scissors");
        this.computerMove = new ComputerMove();
    }

    public String computersHand(){
        return computerMove.getRandom();
    }

    public Boolean checkDraw(String playerMove, String compInput) {
        return compInput.equals(playerMove);
    }

    public Boolean checkWin(String playerMove, String compInput) {
        String value = winCheck.get(playerMove);
        return value.equals(compInput);
    }

    public Boolean checkLoss(String playerMove, String comInput) {
        String value = winCheck.get(comInput);
        return value.equals(playerMove);
    }

    public String checkGame(String player, String computer){
        String result = "";
       if (this.checkDraw(player, computer)){
           result = "It's a Draw";
       }
       else if (this.checkWin(player, computer)){
           result = "You Win!";
       }
       else if (this.checkLoss(player, computer)){
            result = "You Lose!";
       }
        return result;
    }



}
