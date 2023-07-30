import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class zombiwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class zombiwin extends World
{
    
    /**
     * Constructor for objects of class zombiwin.
     * 
     */
    public zombiwin()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        playagain playagain = new playagain();
        addObject(playagain,419,286);
        menuopt menuopt = new menuopt();
        addObject(menuopt,481,356);
        menuopt.setLocation(492,274);
        playagain.setLocation(347,348);
        menuopt.setLocation(250,445);
        playagain.setLocation(397,340);
        removeObject(playagain);
        menuopt.setLocation(311,503);
        menuopt.setLocation(292,493);
    }

}
