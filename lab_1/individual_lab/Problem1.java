package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        pickAllBeepers();
        placeAllBeepers();
        moveFinal();
    }
    public void move2(){
        move();
        move();
    
    }
    public void move3(){
        move();
        move();
        move();
    }
    public void turnAround(){
        turnLeft();
        turnLeft();
        
    }
    public void pickAllBeepers() {
        move2();
        turnLeft();
        move2();
        pickBeeper();
        turnAround();
        move();
        pickBeeper();
        move2();
        pickBeeper();
        move();
        pickBeeper();
        turnAround();
        
    }
    public void placeAllBeepers() {
        move2();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move3();
        putBeeper();
        move();
        putBeeper();
        
    }
    public void moveFinal() {
        turnAround();
        move2();
        turnLeft();
        move2();
        turnAround();
        
    }
}