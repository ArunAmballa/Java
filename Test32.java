
import java.util.Scanner;

public class Test32
{
 public static void main(String[] args) 
 {
    try{
    Scanner sc=new Scanner(System.in);
    System.out.println("Connection is Established");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("Result"+num1/num2);
    int arr[]=new int[2];
    System.out.println(arr[10]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array Index Out of Bonds");
    }
    catch(ArithmeticException e)
    {
        System.out.println("Division Byb Zero");
    }
    catch(Exception e){
        System.out.println("General Exception");
    }
    
    System.out.println("connection is Revoked");
 }   
}
