class A
{
    public void show() throws ArithmeticException
    {
        try
        {
            int result=10/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled in Show Method");
            throw e;
        }  
        finally
        {
            System.out.println("This Finally Block Will be Executed Before Throwing an Error to Main Method");
        }

    }
}
public class Test35 
{

    public static void main(String[] args) 
    {
        try
        {
            A obj=new A();
            obj.show();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled in Main Method");
        }
    }
    
}
