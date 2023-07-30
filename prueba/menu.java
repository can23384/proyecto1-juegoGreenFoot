import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu extends World
{
    public GreenfootSound musicmenu = new GreenfootSound("menutheme.mp3");
    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        
        prepare();
    }
    
    private void prepare(){

        play play = new play();
        addObject(play,294,421);
    }
    
    public void act(){
         musicmenu.play(); 
        
    }
    
}