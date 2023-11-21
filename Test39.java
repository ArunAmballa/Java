class Music implements Runnable
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
class Browsing implements Runnable
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
public class Test39 
{
    public static void main(String[] args) 
    {
        Music obj=new Music();
        Browsing obj1=new Browsing();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();
    }
    
}
