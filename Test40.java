class Music extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Playing Music");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
}
class Browsing extends Thread
{
    public void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Browsing Web");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Test40
{
    public static void main(String[] args) 
    {
        Music obj=new Music();
        Browsing obj1=new Browsing();
        obj.start();
        obj1.start(); 
    }
    
}
