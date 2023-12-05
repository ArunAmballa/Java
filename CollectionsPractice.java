import java.util.ArrayList;
import java.util.Collections;
public class CollectionsPractice 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(90);
        arr.add(30);
        arr.add(40);
        System.out.println(Collections.min(arr)); 
        System.out.println(Collections.max(arr));
        Collections.sort(arr);
        System.out.println(arr);
         
    }
}
