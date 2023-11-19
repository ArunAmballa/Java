import java.util.Scanner;

class A
{
    public void show() throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        try{
            System.out.println(n1/n2);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Exception of A");
        }
        
    }
}
public class Test33 
{
   public static void main(String[] args) 
   {
    A obj=new A();
    
    try{
            obj.show();
            System.out.println("Main execution Completed");
    }
    catch(Exception e)
    {
        System.out.println("Handling Exception of Main");
    }
   }

}
