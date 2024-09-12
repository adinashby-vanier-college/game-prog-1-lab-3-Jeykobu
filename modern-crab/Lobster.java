// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        transform();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("fart-with-reverb.wav");
            
        }
    }

    /**
     * 
     */
    public void transform()
    {
        Actor worm = getOneIntersectingObject(worm.class);
        if (worm != null) {
            World world = getWorld();
            int xLocation = worm.getX();
            int yLocation = worm.getY();
            world.removeObject(worm);
            Actor Lobster =  new  Lobster();
            world.addObject(Lobster, xLocation, yLocation);
        }
    }
}
