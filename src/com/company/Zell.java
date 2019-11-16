package com.company;

public class Zell {
    private int numberOfNeighbours=2;

    public int getNumberOfNeigbours() {

        return numberOfNeighbours;
    }

    public void setNumberOfNeighbours(int i) {
        numberOfNeighbours=i;

    }

    public boolean isAlive() {
        if (numberOfNeighbours <2)
        {return false;}
        else if(numberOfNeighbours >=4)
        {return false;}
        return true;
    }
}
