import java.util.Scanner;

public class Test31 
{
 public static void main(String[] args) 
 {
    Scanner sc=new Scanner(System.in);
    System.out.println("Connection is Established");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    try{
        System.out.println("Result"+num1/num2);
    }
    catch(Exception e){
        System.out.println("You Cannot Divide with Zero"+e);
    }
    
    System.out.println("connection is Revoked");
 }   
}
