class Library implements Runnable
{
    String res1="Java";
    String res2="DSA";
    String res3="Spring Boot";
    public void run()
    {
        String tName=Thread.currentThread().getName();

        if("Student1".equals(tName))
        {
            try
            {
            Thread.sleep(2000);
            synchronized(res1)
            {
                System.out.println("Student1 have Acquired"+res1);
                Thread.sleep(2000);
                synchronized(res2)
                {
                    System.out.println("Student1 have Acquired"+res2);
                    Thread.sleep(2000);
                    synchronized(res3)
                    {
                        System.out.println("Student1 have Acquired"+res3);
                    }
                }
                
            }
            }
            catch(Exception e)
            {
                System.out.println("Some Problem Occured");
            }
        }
        else
        {
            try
            {
            Thread.sleep(2000);
            synchronized(res3)
            {
                System.out.println("Student2 have Acquired"+res3);
                Thread.sleep(2000);
                synchronized(res2)
                {
                    System.out.println("Student2 have Acquired"+res2);
                    Thread.sleep(2000);
                    synchronized(res1)
                    {
                        System.out.println("Student2 have Acquired"+res1);
                    }
                }
                
            }
            }
            catch(Exception e)
            {
                System.out.println("Some Problem Occured");
            }
        }

        

    }

}
public class Test45
{
    public static void main(String[] args) 
    {
        Library obj=new Library();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);

        t1.setName("Student1");
        t2.setName("Student2");

        t1.start();
        t2.start();
        
    }
    
}
