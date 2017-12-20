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
        assertEquals("Draw", game1.checkDraw("scissors"));
    }

    @Test
    public void canDrawRock(){
        assertEquals("Draw", game2.checkDraw("rock"));
    }

    @Test
    public void canDrawPaper(){
        assertEquals("Draw", game3.checkDraw("paper"));
    }

    @Test
    public void canWinWithScissors(){
        assertEquals(true, game1.checkWin("paper"));
    }




}
