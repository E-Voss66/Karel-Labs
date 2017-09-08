package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        enterRoom();
        checkWalls();
        faceSouth();
        exitRoom();
        repeat();
        repeat();
        repeat();
        repeat();
        repeat();
        repeat();
        repeat();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void enterRoom() {
        move();
        turnLeft();
        move();
    }
    
    public void checkWalls() {
        turnRight();
        if(!frontIsClear()) {
            turnLeft();
            if(!frontIsClear()) {
                turnLeft();
                if(!frontIsClear()) {
                    putBeeper();
                }
            }
        }
        
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    /*
     * This is my problem 1 just facing south
     */
    
    public void faceSouth() {
        if(facingNorth()) {
            turnAround();
        }
        if(facingEast()) {
            turnRight();
        }
        if(facingWest()) {
            turnLeft();
        }
    }
    
    public void exitRoom() {
        move();
        turnLeft();
    }
    
    public void repeat() {
        enterRoom();
        checkWalls();
        faceSouth();
        exitRoom();
    }
}

