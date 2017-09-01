package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem4 extends Problem2
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem4(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void set3() {
        across2();
        move();
        turnRight();
        set3();
        turnRight();
        move();
        across2();
        turnAround();
        move();
        move();
        turnRight();
        set3();
        turnRight();
        move();
        across2();
        move();
    }
    
    public void set2() {
        
    }
    
    public void set1() {
        
    }
}
