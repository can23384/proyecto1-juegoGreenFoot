import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends Actor
{
    
    /**
     * Act - do whatever the bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        move(20);
        eat();
        borrar();
        
    }
    
    public void eat()
    {
        Actor alien;
        Actor Blob;
        Blob = getOneObjectAtOffset(0, 0, Blob.class);
        alien = getOneObjectAtOffset(0, 0, alien.class);
        if (alien != null)
        {
            CrabWorld.arthurCount.add(-2);
            Greenfoot.playSound("dano.wav");
            getWorld().removeObject(Blob);
            if (CrabWorld.arthurCount.getValue() == 0)
            {
                getWorld().removeObject(alien);
                CrabWorld.musicfight.stop();
            }
        }
        
        Actor zombi;
        zombi = getOneObjectAtOffset(0, 0, zombi.class);
        if (zombi != null)
        {
            CrabWorld.jhonCount.add(-2);
            Greenfoot.playSound("dano.wav");
            if (CrabWorld.jhonCount.getValue() == 0)
            {
                getWorld().removeObject(zombi);
                CrabWorld.musicfight.stop();
//                Greenfoot.setWorld(new WinWordA());
            }
        }
    }
    
    public void borrar()
    {
        Actor build = getOneIntersectingObject(build.class);
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            getWorld().removeObject(this);
        }
        else if (getY() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            getWorld().removeObject(this);
        }
        else if (build != null)
        {
            getWorld().removeObject(this);
        }
    }

}
