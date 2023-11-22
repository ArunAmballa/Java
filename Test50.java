import java.util.ArrayList;
import java.util.List;

public class Test50 
{
    public static void main(String[] args) 
    {
        ArrayList list=new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add("Arun");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);


        List arr=new ArrayList();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(1, 300);
        arr.addAll(list);
        System.out.println(arr);
        System.out.println(arr.isEmpty()); 
        System.out.println(arr.contains(200)); 

    }
    
}
