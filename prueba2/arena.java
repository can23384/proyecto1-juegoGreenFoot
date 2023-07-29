import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arena extends World
{
    public static Counter arthurCount = new Counter();
    public static Counter jhonCount = new Counter();
    
    private int hola;
    /**
     * Constructor for objects of class arena.
     * 
     */
    public arena()
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
        
        
        while(hola < 5){
            build car = new car();
            addObject(car, Greenfoot.getRandomNumber(200+100),Greenfoot.getRandomNumber(200+100));
            car.setLocation(Greenfoot.getRandomNumber(370+100), Greenfoot.getRandomNumber(370+100));
            hola+=1;
        }
    }
    
    public void act(){
        while (Greenfoot.getRandomNumber(100) < 3) {
        Worm Worm = new Worm();
        addObject(Worm,Greenfoot.getRandomNumber(540),Greenfoot.getRandomNumber(500));
 
    }
    
        while (Greenfoot.getRandomNumber(100) < 3) {
            oso oso = new oso();
            addObject(oso,Greenfoot.getRandomNumber(540),Greenfoot.getRandomNumber(500));
     
        }
    }
}
