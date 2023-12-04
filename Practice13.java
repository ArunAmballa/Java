// Collections API
// Iterbale interface
// Collection interface
// List interfcae 
// Queue interface 
// Set interface




import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;


class Sorting implements Comparator
{
    

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        if(o1>o2)
        {
            return 1;
        }
        else{
            return -1;
        }
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
}
public class Practice13 
{
    public static void main(String[] args) 
    {
        HashSet hs=new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(10);
        hs.remove(10);
        System.out.println(hs);
        System.out.println(hs.isEmpty());

        ArrayList arr=new ArrayList();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        System.out.println(arr.get(1));
        Iterator itr=arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Sorting c=new Sorting();
        System.out.println("Sorted Array"+ arr.sort(c););
        
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        System.out.println(ll);

        TreeSet ts=new TreeSet<>();
        ts.add(10);
        ts.add(2);
        System.out.println(ts);

        ArrayDeque ad=new ArrayDeque<>();


        




    }
}
