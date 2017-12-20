package com.example.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by annalanigan on 20/12/2017.
 */

public class RpsTest {

    Rps game1;
    Rps game2;
    Rps game3;

    @Before
    public void before(){
    game1 = new Rps();
    game2 = new Rps();
    game3 = new Rps();
    }

    @Test
    public void canDrawScissors(){
        assertEquals(true, game1.checkDraw("scissors", "scissors"));
    }

    @Test
    public void canDrawRock(){
        assertEquals(true, game2.checkDraw("rock", "rock"));
    }

    @Test
    public void canDrawPaper(){
        assertEquals(true, game3.checkDraw("paper","paper"));
    }

    @Test
    public void canWinWithScissors(){
        assertEquals(true, game1.checkWin("scissors", "paper"));
    }

    @Test
    public void canWinWithRock(){
        assertEquals(true, game2.checkWin("rock", "scissors"));
    }

    @Test
    public void canWinWithPaper(){
        assertEquals(true, game3.checkWin("paper","rock"));
    }

    @Test
    public void canLoseWithScissors(){
        assertEquals(true, game1.checkLoss("scissors","rock"));
    }

    @Test
    public void canLossWithRock(){
        assertEquals(true, game2.checkLoss("rock","paper"));
    }

    @Test
    public void canLossWithPaper(){
        assertEquals(true, game3.checkLoss("paper","scissors"));
    }

    @Test
    public void canPlay_Win(){
        assertEquals("You Win!", game1.checkGame("scissors", "paper"));
    }

    @Test
    public void canAddToScore() {
        game1.checkGame("scissors", "paper");
        game1.checkGame("scissors", "paper");
        assertEquals((Integer)2, game1.getPlayerScore());
    }
}
