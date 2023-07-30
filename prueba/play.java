import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class play extends botones
{
//    public GreenfootSound musicmenu = new GreenfootSound("menutheme.mp3");
    private GreenfootSound click = new GreenfootSound("click.mp3");
    private GreenfootImage blanco = getImage();
    private GreenfootImage rojo = new GreenfootImage("jugarb.png");
    private boolean mauseOver = false;
    /**
     * Act - do whatever the jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        mause();
 //       musicmenu.play();        
        if (Greenfoot.mouseClicked(this))
        {
            click.play();
            menu menu = (menu) getWorld();
            menu.musicmenu.stop();
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
