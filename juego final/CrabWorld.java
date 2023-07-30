import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    public static Counter arthurCount = new Counter();
    public static CopyOfCounter jhonCount = new CopyOfCounter();
    private SimpleTimer contador = new SimpleTimer();
    public static GreenfootSound musicfight = new GreenfootSound("fighttheme.mp3");
    private int timer;
    private int hola;
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
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
        
//        while(hola < 3){
//            build car = new car();
//            addObject(car, Greenfoot.getRandomNumber(200+100),Greenfoot.getRandomNumber(200+100));
//            car.setLocation(Greenfoot.getRandomNumber(370+100), Greenfoot.getRandomNumber(370+100));
//            build edificio = new edificio();
//            addObject(edificio, Greenfoot.getRandomNumber(200+100),Greenfoot.getRandomNumber(200+100));
 //           edificio.setLocation(Greenfoot.getRandomNumber(200+300), Greenfoot.getRandomNumber(200+100));
 //           hola+=1;
//        }
        
        
        }
        
    public void act()
    {
        
    while (Greenfoot.getRandomNumber(900) < 3) {
        Worm Worm = new Worm();
        addObject(Worm,Greenfoot.getRandomNumber(540),Greenfoot.getRandomNumber(500));
 
    }
    
    while (Greenfoot.getRandomNumber(100) < 3) {
        int carril = Greenfoot.getRandomNumber(3);
        
        if(carril == 1){
            carro carro = new carro();
            addObject(carro, 40,210); 
        }
        
        if(carril == 2){
            carro carro = new carro();
            addObject(carro, 40, 350); 
        }
        
    }
    
    }   
    
}

