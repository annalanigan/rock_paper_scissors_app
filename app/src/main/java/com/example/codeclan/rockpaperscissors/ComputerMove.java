package com.example.codeclan.rockpaperscissors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by annalanigan on 20/12/2017.
 */

public class ComputerMove {

    private ArrayList<String> move;

    public ComputerMove(){
        this.move = new ArrayList<>();
        move.add("rock");
        move.add("paper");
        move.add("scissors");
    }

    public ArrayList<String> getMove() {
        return move;
    }

    public void addMove(String newMove) {
        this.move.add(newMove);
    }


    public String getRandom() {
        Collections.shuffle(this.move);
        return this.move.get(0);
    }
}
