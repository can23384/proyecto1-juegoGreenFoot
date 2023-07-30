import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class selec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class selec extends World
{
    public GreenfootSound musicmenu = new GreenfootSound("menutheme.mp3");
    /**
     * Constructor for objects of class selec.
     * 
     */
    public selec()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        select_arena select_arena = new select_arena();
        addObject(select_arena,150,190);
        select_calle select_calle = new select_calle();
        addObject(select_calle,348,193);
        select_combat select_combat = new select_combat();
        addObject(select_combat,150,190);
        
        select_calle.setLocation(103,395);
        select_arena.setLocation(290,395);
        select_combat.setLocation(470,395);
    }
    
    public void act(){
         musicmenu.play(); 
        
    }
}
