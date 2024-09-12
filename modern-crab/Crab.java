// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * 
 */
public class Crab extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the Crab wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(3);
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor worm = getOneIntersectingObject(worm.class);
        if (worm != null) {
            World world = getWorld();
            world.removeObject(worm);
            Greenfoot.playSound("eating.wav");
            
        }
    }
}
