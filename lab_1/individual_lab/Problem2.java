package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        figure8();
    }
    public void move2() {
        move();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void middleTB() {
        turnRight();
        move2();
        turnLeft();
    }
    public void middleBT() {
        turnLeft();
        move2();
        turnRight();
    }
    public void topHalf() {
        move2();
        turnRight();
        move2();
        turnRight();
        move2();
    }
    public void figure8()  {
        turnRight();
        move();
        turnLeft();
        move2();
        middleBT();
        topHalf();
        middleTB();
        move2();
        turnLeft();
        move();
    }
}