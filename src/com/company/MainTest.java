package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void checkNumberOfNeighbours() {
        Zell cell = new Zell();
        cell.setNumberOfNeighbours(1);
        Assert.assertEquals(1,cell.getNumberOfNeigbours());

    }

    @Test
    public void checkInitialNumberOfNeighbors() {
      Zell cell = new Zell();
      int neigbours= cell.getNumberOfNeigbours();
      Assert.assertEquals(neigbours,2);

    }

    @Test
    public void checkOverPopulation() {
        Zell cell = new Zell();
        cell.setNumberOfNeighbours(4);
        boolean state=cell.isAlive();
        Assert.assertFalse(state);
    }

    @Test
    public void checkIfAlive() {
        Zell cell = new Zell();
        boolean state=cell.isAlive();
        Assert.assertTrue(state);

    }

    @Test
    public void checkUnderPopulation() {
        Zell cell = new Zell();
        cell.setNumberOfNeighbours(1);
        boolean state=cell.isAlive();
        Assert.assertFalse(state);


    }

    @Test
    public void check() {
    }
}