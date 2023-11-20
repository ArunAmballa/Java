class A
{
    public int show() throws ArithmeticException
    {
        try
        {
            return 10;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled in Show Method");
            throw e;
        } 
        finally
        {
            return 1000;
        } 

    }
}
public class Test36
{

    public static void main(String[] args) 
    {
        try
        {
            A obj=new A();
            int res=obj.show();
            System.out.println(res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Handled in Main Method");
        }
    }
    
}

