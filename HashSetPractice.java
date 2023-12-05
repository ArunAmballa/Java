import java.util.HashSet;

public class HashSetPractice 
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(10);
        hs.add(10);
        System.out.println(hs);
        System.out.println(hs.contains(10));
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove(10));
        System.out.println(hs);
    }
    
}
