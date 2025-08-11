import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(2,2,North,30);
		
    // examples of commands you can invoke on a Robot
    r.putBeeper();// move one step in the direction it is facing
    r.move();
    r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
	  r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
    r.turnLeft();
    r.turnLeft();
    r.turnLeft();
    r.move();
    r.putBeeper();
    r.move();
    r.putBeeper();
	r.turnLeft();
    r.turnLeft();
    r.move();
    r.move();
    r.move();
    r.move();
    r.move();
    r.turnLeft();
  }

}
