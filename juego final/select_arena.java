import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class select_arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class select_arena extends botones
{
    private GreenfootSound click = new GreenfootSound("click.mp3");
//    private GreenfootSound musicmenu = new GreenfootSound("menu.wav");
    private GreenfootImage blanco = getImage();
    private GreenfootImage rojo = new GreenfootImage("rojo1.png");
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
            click.play();
            selec selec = (selec) getWorld();
            selec.musicmenu.stop();
            Greenfoot.setWorld(new arena());
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
