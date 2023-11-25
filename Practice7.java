// Exception Handling in java

// Object Class is Parent Class of all Classes
// Throwable classs extends Object Class
// Exception Class and Error Class Extends Throwable.

class Calculator
{
    public void divide() throws ArithmeticException
    {
        try{
            int n1=10;
            int n2=0;
            System.out.println(n1/n2);
        }
        
        catch(ArithmeticException e)
        {
            System.out.println("You Cannot Divide By Zero");
            throw e;
        }
        catch(Exception e)
        {
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Cleaning Resources in Divide Method");
        }
        
    }

}
public class Practice7 
{
    public static void main(String[] args) 
    {
        Calculator obj=new Calculator();
        try{
            obj.divide();
        }catch(Exception e)
        {
            System.out.println("Exception Handled in Main Method");
        }
    }
}
