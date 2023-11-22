import java.util.LinkedList;

public class Test51 
{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(40);
        ll.addFirst(1000);
        ll.addLast(10000);
        System.out.println(ll);


        LinkedList list2=new LinkedList<>();
        list2.addAll(ll);
        System.out.println(list2.peek());
        System.out.println(list2.peekLast());
        System.out.println(list2.peekFirst());
    }
    

    
}
