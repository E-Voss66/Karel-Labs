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
        beeperNoBeeper();
        exitRoom();
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
            
        }
        
    }
}

