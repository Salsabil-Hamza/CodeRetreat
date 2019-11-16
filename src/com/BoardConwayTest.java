package com;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoardConwayTest {
    @Test
    public void checkEachZellInTheBoard() {
        boolean[][] state = new boolean[][] { new boolean[] {true, false}, new boolean[] {true, false}};
        Board board = new Board(state);
        assertArrayEquals(state, board.getState());
    }
    @Test
    public void check2AliveZells() {
        boolean[][] state = new boolean[][] { new boolean[] {true, false}, new boolean[] {true, false}};

        Board board = new Board(state);
        board.playIteration();

        boolean[][] expectedState = new boolean[][] { new boolean[] {false, false}, new boolean[] {false, false}};
        assertArrayEquals(expectedState, board.getState());
    }
}