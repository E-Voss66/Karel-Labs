package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        enterRoom();
        checkWalls();
        faceSouth();
        exitRoom();
    }
    
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void enterRoom() {
        move();
        turnLeft();
        move();
    }
    
    /*
     * I Left Off Here
     */
    
    public void checkWalls() {
        turnRight();
        checkSideWalls();
        checkFront();
        if(facingNorth()) {
            turnRight();
            checkSideWalls();
            checkFront();
            if(facingNorth()) {
                turnRight();
                checkSideWalls();
                checkFront();
            }
        }
    }

    
    public void checkSideWalls() {
        if(!frontIsClear()) {
            turnAround();
            if(!frontIsClear()) {
                turnRight();
            }
        }
    }
    
    public void checkFront() {
        if(facingNorth()) {
            if(frontIsClear()) {
                move();
            }
            else {
                putBeeper();
            }
        }
    }
    
    public void faceSouth() {
        
    }
    
    public void exitRoom() {
        
    }
}

