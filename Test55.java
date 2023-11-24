import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test55 
{
    public static void main(String[] args) 
    {
        ArrayList list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
            // list.add(200); It will Keeep on Adding 200 at the End
        }

        Iterator itr=list.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
            // list.add(200); This will Lead to Concurrent Modification exception
        }

        CopyOnWriteArrayList list1=new CopyOnWriteArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator itr1=list1.iterator();

        while(itr1.hasNext())
        
        {
            System.out.println(itr1.next());
            list1.add(445);
        }


        
    }
}
