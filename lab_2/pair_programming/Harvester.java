package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author : E. Voss    
 * teacher : Mr. Appel
 * due date: 
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
        harvestTwoRows();
        harvestTwoRows();
        harvestTwoRows();
        repositionTop();
        plantTwoRows();
        plantTwoRows();
        plantTwoRows();
        //Complete this method, using the methods you create below so that all rows are harvested
    }
    //your methods go below
    /**
     * Precondition: Robot facing east, one block away from row of beepers
     * Post Condition: Robot facing east, two streets from where it started, one block away from the beeper
     */
    public void harvestTwoRows() {
        harvestOneRow();
        repositionTurnLeft();
        harvestOneRow();
        repositionTurnRight();
        
    }
    
    public void repositionTop() {
        turnRight();
        move();
        turnLeft();
    }
    
    public void plantTwoRows() {    
        plantOneRow();
        repositionTurnRight();
        plantOneRow();
        repositionTurnLeft();
    }
    
    public void plantOneRow() {
        putAllBeepers();
        putAllBeepers();
        putAllBeepers();
        putAllBeepers();
        putAllBeepers();
        putAllBeepers();
        move();
    }
    
    public void putAllBeepers() {
        move();
        putBeeper();
    }
    
    public void harvestOneRow() {
        pickAllBeepers();
        pickAllBeepers();
        pickAllBeepers();
        pickAllBeepers();
        pickAllBeepers();
        move();
    }
    
    public void pickAllBeepers() {
        move();
        pickBeeper();
    }
    
    public void repositionTurnLeft() {
        turnLeft();
        move();
        turnLeft();
    }
    
    public void repositionTurnRight() {
        turnRight();
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

