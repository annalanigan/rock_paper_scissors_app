package com.example.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by annalanigan on 20/12/2017.
 */

public class ComputerMoveTest {

    ComputerMove computerMove;

    @Before
    public void before(){
        computerMove= new ComputerMove();
    }

    @Test
    public void canGetMoves(){
        assertEquals(3, computerMove.getMove().size());
    }

    @Test
    public void canGetRandomAnswer(){
        assertNotNull(computerMove.getRandom());
    }

}

