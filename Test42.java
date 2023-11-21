class Car implements Runnable
{
    synchronized public void run()
    {
        try{
            System.out.println(Thread.currentThread().getName()+" Has entered Parking lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Has entered Car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Has Started Driving Car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName()+" Has returned  Home ");
        }
        catch(Exception e)
        {
            System.out.println("Problem Encountered");
        }
    }
}
public class Test42
{
    public static void main(String[] args) {
        Car obj=new Car();

    Thread t1=new Thread(obj);
    Thread t2=new Thread(obj);
    Thread t3=new Thread(obj);

    t1.setName("Child1");
    t2.setName("Child2");
    t3.setName("Child3");

    t1.start();
    t2.start();
    t3.start();
    }
}

