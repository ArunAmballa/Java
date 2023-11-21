
public class Test38 
{
    public static void main(String[] args) 
    {
        Thread thread=Thread.currentThread();

        System.out.println("Thread Name: "+thread.getName());
        System.out.println("Thread Priority: "+thread.getPriority());
    }
}
