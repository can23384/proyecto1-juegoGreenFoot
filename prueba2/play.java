import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends botones
{
//    private GreenfootSound musicmenu = new GreenfootSound("menu.wav");
    private GreenfootImage blanco = getImage();
    private GreenfootImage rojo = new GreenfootImage("play.png");
    private boolean mauseOver = false;
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mause();
//        musicmenu.play();        
        if (Greenfoot.mouseClicked(this))
        {
 //           musicmenu.stop();
            Greenfoot.setWorld(new selec());
        }
    }
    
    public void mause()
    {
        if (Greenfoot.mouseMoved(null))
        {
            mauseOver = Greenfoot.mouseMoved(this);
        }
        
        if(mauseOver){
            setImage(rojo);
        }
        else
        {
            setImage(blanco);
        }
    }
}
