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
    game1 = new Rps("Scissors");
    game2 = new Rps("Rock");
    game3 = new Rps("Paper");
    }

    @Test
    public void canDrawScissors(){
        assertEquals("Draw", game1.checkDraw("Scissors"));
    }

    @Test
    public void canDrawRock(){
        assertEquals("Draw", game2.checkDraw("Rock"));
    }

    @Test
    public void canDrawPaper(){
        assertEquals("Draw", game3.checkDraw("Paper"));
    }




}
