import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class oso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oso extends Actor
{
    private int tiempoDeVida;
    
    public oso() {
        tiempoDeVida = 200;
    }
    
    /**
     * Act - do whatever the oso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        if (tiempoDeVida > 0) {
            tiempoDeVida--;
        } else {
            
            getWorld().removeObject(this);
        }
    }
    
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getWidth() - 5)
        {
            turn(180);
        }
    }
    
    public void eat()
    {
        Actor alien;
        alien = getOneObjectAtOffset(0, 0, alien.class);
        if (alien != null)
        {
            arena.arthurCount.add(-2);
            Greenfoot.playSound("dano.wav");
            if (arena.arthurCount.getValue() <= 0)
            {
                getWorld().removeObject(alien);
                CrabWorld.musicfight.stop();
                Greenfoot.setWorld(new zombiwin());
                
            }
        }
        
        
        
        Actor zombi;
        zombi = getOneObjectAtOffset(0, 0, zombi.class);
        if (zombi != null)
        {
            arena.jhonCount.add(-2);
            Greenfoot.playSound("dano.wav");
            if (arena.jhonCount.getValue() <= 0)
            {
                getWorld().removeObject(zombi);
                CrabWorld.musicfight.stop();
                Greenfoot.setWorld(new alienwin());
            }
        }
    }
}
