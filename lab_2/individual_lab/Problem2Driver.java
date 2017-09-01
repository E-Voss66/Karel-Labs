package lab_2.individual_lab;

/**
   @Author:
      Date:
   Teacher: Appel
       Lab: Problem Set 3
      Misc: Karel plants a garden in a cross-shape
  */
import kareltherobot.*;
import java.awt.Color;

public class Problem2Driver implements Directions
{
    public static void main(String args[])  {
        Problem2 karel = new Problem2(7, 2, South, 16);
        Problem2 eor = new Problem2(7, 6, South, -1);
        Problem2 lore = new Problem2(7, 10, South, -1);
        Problem2 lubbers = new Problem2(7, 14, South, -1);
        Problem2 oli = new Problem2(7, 18, South, -1);
        karel.setH();
        eor.setE();
        lore.setL1();
        lubbers.setL1();
        oli.setO();
        karel.turnOff();
    } 

    static {
        World.reset(); 
        World.readWorld("worlds/hello.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}