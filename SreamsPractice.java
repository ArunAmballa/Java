import java.util.ArrayList;
import java.util.stream.Stream;

public class SreamsPractice 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(10);
        arr.add(11);
        arr.add(20);
        arr.add(21);
        arr.add(30);
        arr.add(31);

        arr.stream()
        .sorted()
        .filter(x->x%2==0)
        .map(x->x*2)
        .forEach(x->System.out.println(x));

        
    }
}
