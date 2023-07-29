import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 * 
 * Version: 2
 * 
 * In this version, the crab walks around the beach more or less randomly.
 */
public class alien extends Actor
{
    private GreenfootImage walking = getImage();
    private GreenfootImage shooting = new GreenfootImage("alien1.png");
    private SimpleTimer shootimer = new SimpleTimer();
    
    /** 
     * Act - do whatever the crab wants to do. This method is called whenever
     *  the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        //turnAtEdge();
    }   //moveRandom();
        
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("up"))
        {
            move(4);
            if (hitWall() == true)
            {
                move(-4);
            }
            if (hitTree() == true)
            {
                move(-4);
            }
        }
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-4);
            
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(4);
            
        }
        if (Greenfoot.isKeyDown("down"))
        {         
            move(-4);
            if (hitWall() == true)
            {
                move(4);
            }
            if (hitTree() == true)
            {
                move(4);
            }
        }
        if (Greenfoot.isKeyDown("k") && shootimer.millisElapsed() > 250)
        {
            fire();
            setImage(shooting);
            shootimer.mark();
        }
        
        if (!Greenfoot.isKeyDown("k")) 
        {
            setImage(walking);
        }
    }
        
    public void eat()
    {
        Actor Worm;
        Worm = getOneObjectAtOffset(0, 0, Worm.class);
        if (Worm != null)
        {
            if (CrabWorld.arthurCount.getValue() <= 94)
            {
                World world;
                world = getWorld();
                world.removeObject(Worm);
                Greenfoot.playSound("slurp.wav");
                CrabWorld.arthurCount.add(+6);
            }
            
            if (arena.arthurCount.getValue() <= 94)
            {
                World world;
                world = getWorld();
                world.removeObject(Worm);
                Greenfoot.playSound("slurp.wav");
                arena.arthurCount.add(+6);
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
    
    private boolean hitWall()
    {
        if (isTouching(carro.class))
        {
            
            CrabWorld.arthurCount.add(-1);
            Greenfoot.playSound("dano.wav");
            return true;
            
        }
        else
        {
            return false;
        }
    }
    
    private boolean hitTree()
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
