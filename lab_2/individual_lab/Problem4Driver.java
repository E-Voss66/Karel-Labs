package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 4
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem4Driver implements Directions
{
    public static void main(String args[])  {
        Problem4 karel = new Problem4(5, 2, East, -1);
        karel.set3();
        karel.turnOff();        
        Problem4 carl = new Problem4(5, 2, East, -1);
        carl.set2();
        Problem4 jon = new Problem4(5, 3, South, -1);
        jon.set1();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(5);  
        World.setVisible(true);
    }
}