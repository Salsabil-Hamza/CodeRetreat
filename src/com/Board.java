package com;

public class Board {
    private  boolean[][] state;

    public Board(boolean[][] state){
        this.state = state;
    }

    /*
    x x x 0 x x
    x 0 x x x x
    0 0 x x x x
     */
    public void playIteration() {
        boolean[][] expectedState = new boolean[][] { new boolean[] {false, false}, new boolean[] {false, false}};
        state=expectedState;



    }

    public boolean[][] getState() {
        return state;
    }
}
