class Library implements Runnable
{
    String res1="Java";
    String res2="Python";

    synchronized public void run()
    {
        try
        {
            String tName=Thread.currentThread().getName();
            Thread.sleep(2000);
            System.out.println("Resource One is Acquired by"+tName);
            Thread.sleep(2000);
            System.out.println("resource 2 is Acquired by "+tName);
            Thread.sleep(2000);
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
    }
}
public class Practice11 
{
    public static void main(String[] args) {
        
        Library obj1=new Library();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj1);

        t1.setName("Arun");
        t2.setName("Aj");
        t1.start();
        t2.start();
        }
}
