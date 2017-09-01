package lab_2.individual_lab;

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

    public void setH(){
        down5();
        repositionH1();
        across2();
        repositionH2();
        down5();
    }
    
    public void setE() {
        down5();
        repositionE();
        finishE();
    }
    
    public void setL1() {
        down5();
        turnLeft();
        move();
        across2();
    }
    
    public void setO() {
        down5();
        turnLeft();
        move();
        across2();
        turnLeft();
        set3();
        move();
        putBeeper();
        turnLeft();
        move();
        across2();
    }
    
    public void down5() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
    
    public void across2(){
        putBeeper();
        move();
        putBeeper();
    }
    
    public void repositionH1() {
        turnAround();
        move();
        move();
        turnRight();
        move();
    }
    
    public void repositionH2() {
        turnLeft();
        move();
        move();
        turnAround();
    }
    
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    
    public void turnRight() {
        turnAround();
        turnLeft();
    }
    
    public void repositionE() {
        turnAround();
        move4();
        turnRight();
        move();
        move();
        turnAround();
    }
    
    public void move4(){
        move();
        move();
        move();
        move();
    }
    
    public void finishE() {
        makeC();
        makeC();
    }
    
    public void makeC() {
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
    }
    
    public void set3() {
        move();
        putBeeper();
        move();
        putBeeper();
        move();
        putBeeper();
    }
}
