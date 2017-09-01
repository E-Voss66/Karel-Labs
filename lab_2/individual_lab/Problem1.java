package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setPins(){
        repositionStart();
        setOne();
        repositionTurnLeft();
        setTwo();
        repositionTurnRight();
        setThree();
        repositionTurnLeft();
        setFour();
    }
    
    
    
    public void repositionStart() {
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void setOne() {
        putBeeper();
    }
    
    public void setTwo() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    
    public void setThree() {
        setTwo();
        move();
        move();
        putBeeper();
    }
    
    public void setFour() {
        setThree();
        move();
        move();
        putBeeper();
    }
    
    public void repositionTurnLeft(){
        move2();
        turnLeft();
        move();
        turnLeft();
        move3();
    }
    
    public void repositionTurnRight() {
        move2();
        turnRight();
        move();
        turnRight();
        move3();
    }
    
    public void move3() {
        
    }
    
    public void move2() {
        move();
    }
}
