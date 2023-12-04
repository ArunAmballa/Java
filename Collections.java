import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections 
{
    public static void main(String[] args) 
    {
        ArrayList arr=new ArrayList();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add("Arun");
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        System.out.println(arr.contains("Arun"));
        int a=(int)arr.get(0);
        System.out.println(a);
        arr.add(1, 100);
        System.out.println(arr);

        arr.remove((Object) 100);
        System.out.println(arr);
        arr.set(1,1000);
        System.out.println(arr);

        for (int i=0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }

        arr.forEach((x)->{System.out.println(x);});


        for (Object obj:arr)
        {
            System.out.println(obj);
        }
        
        ArrayList arr1=new ArrayList();

        arr1.add(111);

        arr.addAll(arr1);
        System.out.println(arr);

    }
}
