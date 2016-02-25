
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 4, 2, Direction.NORTH);
        new Wall(Ajay, 4, 2, Direction.WEST);
        new Wall(Ajay, 3, 3, Direction.NORTH);
        new Wall(Ajay, 3, 3, Direction.WEST);
        new Wall(Ajay, 2, 4, Direction.NORTH);
        new Wall(Ajay, 2, 4, Direction.WEST);
        new Wall(Ajay, 2, 5, Direction.NORTH);
        new Wall(Ajay, 2, 5, Direction.EAST);
        new Wall(Ajay, 3, 6, Direction.NORTH);
        new Wall(Ajay, 3, 6, Direction.EAST);
        new Wall(Ajay, 4, 7, Direction.EAST);
        new Wall(Ajay, 4, 7, Direction.NORTH);
        new Thing(Ajay, 4, 1);
        new Thing(Ajay, 3, 2);
        new Thing(Ajay, 2, 3);
        new Thing(Ajay, 1, 4);
        Robot Craig = new Robot(Ajay, 4, 0, Direction.EAST);
        
        Craig.move();
        Craig.turnLeft();
        Craig.pickThing();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.pickThing();
        Craig.turnLeft();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.turnLeft();
        Craig.pickThing();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.pickThing();
        Craig.move();
        Craig.putThing();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.putThing();
        Craig.turnLeft();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.putThing();
        Craig.turnLeft();
        Craig.move();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.turnLeft();
        Craig.move();
        Craig.putThing();
        Craig.turnLeft();
        Craig.move();
        
    }
}
