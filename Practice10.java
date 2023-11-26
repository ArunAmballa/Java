class Music implements Runnable
{
    public void run()
    {
        System.out.println("Playing Music");
    }
}
class Typing implements Runnable
{
    public void run()
    {
        System.out.println("I am Typing as well");
    }
}
class Youtube extends Thread
{
    public void run()
    {
        System.out.println("Watching Youtube as well");
    }
}
public class Practice10 
{
    public static void main(String[] args) throws InterruptedException
    {
        Music obj=new Music();
        Typing obj1=new Typing();
        Youtube obj2=new Youtube();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);
        t1.setName("Music Thread");
        t2.setName("Typin Thread");
        obj2.setName("YouTube Thread");
        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        System.out.println(t2.isAlive());
        obj2.start();
        obj2.join();
        System.out.println("Last Line of Main Thread");
    }
}
