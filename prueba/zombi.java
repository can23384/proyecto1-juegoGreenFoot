import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */
public class zombi extends Actor
{
    private GreenfootImage walk = getImage();
    private GreenfootImage shoot = new GreenfootImage("zombi.png");
    private SimpleTimer shotimer = new SimpleTimer();
    
    
    
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        CrabWorld.musicfight.play();
        moveAndTurn();
        eat();
        //turnAtEdge();
    }   //moveRandom();
        
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("w"))
        {
            move(4);
            if (chocar() == true)
            {
                move(-4);
            }
        }

        if (Greenfoot.isKeyDown("a"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("s"))
        {         
            move(-4);
            if (chocar() == true)
            {
                move(4);
            }
            
        }
        if (Greenfoot.isKeyDown("t") && shotimer.millisElapsed() > 250)
        {
            fire();
            setImage(shoot);
            shotimer.mark();
        }
        
        if (!Greenfoot.isKeyDown("t")) 
        {
            setImage(walk);
        }
    }    
    
    public void eat()
    {
        Actor Worm;
        Worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (Worm != null)
        {
            if (CrabWorld.jhonCount.getValue() <= 94)
            {
                World world;
                world = getWorld();
                world.removeObject(Worm);
                Greenfoot.playSound("slurp.wav");
                CrabWorld.jhonCount.add(+6);
            }
        }
        //lookForWorm();     
    }
    
    private void fire()
    {
        Blob blob = new Blob();
        getWorld().addObject(blob, getX(), getY());
        blob.setRotation(getRotation());
        blob.move(35);
    }
    
    private boolean chocar()
    {
        if (isTouching(build.class))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
    
    
