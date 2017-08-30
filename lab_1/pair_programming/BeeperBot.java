package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        finish();
        
    }
    public void  turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    
    }
    public void move3() {
        move();
        move();
        move();
        
    }
    public void move2() {
        move();
        move();
    }
    public void putBeeper4() {
        putBeeper();
        putBeeper();
        putBeeper();
        putBeeper();
    }
    public void pickTurnL() {
        pickBeeper();
        turnLeft();
        
    }
    public void finish(){
        turnLeft();
        move3();
        turnLeft();
        move2();;
        pickBeeper();
        move3();
        pickTurnL();
        move3();
        pickTurnL();
        move3();
        pickBeeper();
        move2();
        putBeeper4();
        
        
    }
}

