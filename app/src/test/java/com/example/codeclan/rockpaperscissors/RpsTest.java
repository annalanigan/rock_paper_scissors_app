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
    game1 = new Rps("scissors");
    game2 = new Rps("rock");
    game3 = new Rps("paper");
    }

    @Test
    public void canDrawScissors(){
        assertEquals(true, game1.checkDraw("scissors"));
    }

    @Test
    public void canDrawRock(){
        assertEquals(true, game2.checkDraw("rock"));
    }

    @Test
    public void canDrawPaper(){
        assertEquals(true, game3.checkDraw("paper"));
    }

    @Test
    public void canWinWithScissors(){
        assertEquals(true, game1.checkWin("paper"));
    }

    @Test
    public void canWinWithRock(){
        assertEquals(true, game2.checkWin("scissors"));
    }

    @Test
    public void canWinWithPaper(){
        assertEquals(true, game3.checkWin("rock"));
    }

    @Test
    public void canLoseWithScissors(){
        assertEquals(true, game1.checkLoss("rock"));
    }

    @Test
    public void canLossWithRock(){
        assertEquals(true, game2.checkLoss("paper"));
    }

    @Test
    public void canLossWithPaper(){
        assertEquals(true, game3.checkLoss("scissors"));
    }




}
