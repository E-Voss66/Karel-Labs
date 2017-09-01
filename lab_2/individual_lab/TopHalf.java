package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class TopHalf extends Problem1
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public TopHalf(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    
    public void setTopPins() {
        repositionTurnRight();
        setThree();
        repositionTurnLeft();
        setTwo();
        repositionTurnRight();
        setOne();
    }
    
    public void move2() {
        
    }
    
    public void move3() {
        move();
    }
}
