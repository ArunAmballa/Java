import java.util.ArrayList;
import java.sql.*;
public class Test76 
{
    public static void main(String[] args) 
    {
        int age=10;
        Integer a=new Integer(12);

        Integer b=Integer.valueOf(12);
        System.out.println(a);
        System.out.println(b);

        Float f=Float.valueOf(13.5f);
        System.out.println(f);

        int c=b;
        System.out.println(c); 

        Integer k=12;
        System.out.println(k);  
        
        
        ArrayList arr=new ArrayList();
        arr.add(10);

        int m=(int) arr.get(0);
        System.out.println(m);

        
    }
}
