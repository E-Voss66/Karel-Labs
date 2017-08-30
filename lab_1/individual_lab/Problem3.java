package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  E. Voss
 */
public class Problem3 extends Robot
{
   public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
   public void giveCarlBeeper() {
        moveToCarl();
        putDownBeepers();
        returnToPositionK();//This method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
        
    }
    
   public void pickAndMoveBeeper() {
        pickUpBeepers();
        changePosition();
        dropBeepers();
        returnToPositionC();//This method is for carl to pick up the beeper from karel and move it two blocks north
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
   public void move3() {
       move();
       move();
       move();
    }
   public void turnAround() {
       turnLeft();
       turnLeft();
    }
   public void moveToCarl() {
       turnRight();
       move3();
             
    }
   public void putDownBeepers() {
       putBeeper();
    }
   public void returnToPositionK() {
       turnAround();
       move3();
       turnRight();
    }
   public void pickUpBeepers() {
       pickBeeper();
    }
   public void changePosition() {
       turnLeft();
       move();
       move();
   }
   public void dropBeepers() {
       putBeeper();
    }
   public void returnToPositionC() {
       turnAround();
       move();
       move();
       turnLeft();
    }
}