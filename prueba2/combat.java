import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class combat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class combat extends World
{
    public static Counter arthurCount = new Counter();
    public static Counter jhonCount = new Counter();
    /**
     * Constructor for objects of class combat.
     * 
     */
    public combat()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(560, 560, 1); 
        prepare();
    }
    
    private void prepare()
    {
//        Greenfoot.playSound("fanfare.wav");
        alien alien = new alien();
        addObject(alien,130,388);
        zombi zombi = new zombi();
        addObject(zombi,191,175);

        //        Counter counter = new Counter();
        addObject(arthurCount,44,19);
        arthurCount.setLocation(470,520);
        arthurCount.setValue(100);

        //        CopyOfCounter copyOfCounter = new CopyOfCounter();
        addObject(jhonCount,470,21);
        jhonCount.setLocation(80,20);
        jhonCount.setValue(100);

        zombi.setLocation(200,154);
        zombi.setLocation(260,107);

        zombi.setLocation(282,55);
        alien.setLocation(282,508); 
    }
}
