package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Problem2
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
        if(checkLeftWall() && checkRightWall() && checkCeiling()) {
            carpetRoom();
        }
        else {
            faceSouth();
            exitRoom();
        }
        findNextRoom();
        findNextRoom();
        findNextRoom();
        findNextRoom();
        findNextRoom();
        findNextRoom();
        findNextRoom();
    }
    
    
    public void enterRoom() {
        move();
        turnLeft();
        move();
    }
  
    public boolean checkLeftWall() {
        faceWest();
        // no wall present = false 
        // wall present = true
        if(frontIsClear()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public boolean checkRightWall() {
        faceEast();
        // no wall present = false 
        // wall present = true
        if(frontIsClear()) {
            return false;
        }
        else{
            return true;
        }
    }
    
    public void faceEast() {
        if(facingNorth()) {
            turnRight();
        }
        if(facingSouth()) {
            turnLeft();
        }
        if(facingWest()) {
            turnAround();
        }
    }
    
    public void faceNorth() {
        if(facingEast()) {
            turnLeft();
        }
        if(facingSouth()) {
            turnAround();
        }
        if(facingWest()) {
            turnRight();
        }
    }
    
    public void faceWest(){
        if(facingNorth()) {
            turnLeft();
        }
        if(facingSouth()) {
            turnRight();
        }
        if(facingEast()) {
            turnAround();
        }
    }
    
    public void exitRoom() {
        move();
        if(frontIsClear()) {
            move();
            if(frontIsClear()) {
                move();
            }
        }
        faceEast();
        
    }
    
    public boolean checkCeiling() {
        faceNorth();
        // no wall present = false 
        // wall present = true
        if(frontIsClear()){
            move();
            if(checkRightWall() && checkLeftWall()) {
                faceNorth();
                if(frontIsClear()) {
                    move();
                    if(checkRightWall() && checkLeftWall()) {
                        faceNorth();
                        if(frontIsClear()) {
                            return false;
                        }
                        else{
                            return true;
                        }
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return true;
                }
            }
            else {
                return false;
            }
        }
        else {
            return true;
        }
    }
    
    public void carpetRoom() {
        putBeeper();
        faceSouth();
        move();
        if(frontIsClear()) {
            putBeeper();
            move();
            if(frontIsClear()){
                putBeeper();
                move();
            }
        }
        faceEast();
    }
    
    public void findNextRoom() {
        enterRoom();
        if(checkLeftWall() && checkRightWall() && checkCeiling()) {
            carpetRoom();
        }
        else {
            faceSouth();
            exitRoom();
        }
    }
}

