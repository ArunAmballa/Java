import java.util.*;
import java.util.stream.*;
public class Test62 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(15);
        Stream<Integer> stream1=list.stream();
        Stream<Integer> stream2=stream1.sorted();
        Stream<Integer> stream3=stream2.filter(x->x%2==0);
        Stream<Integer> stream4=stream3.map(x->x*2);
        stream4.forEach(n->System.out.println(n));


        list.stream()
        .sorted()
        .filter(x->x%2==0)
        .map(x->x*2)
        .forEach(x->System.out.println(x));


        
    }
}
