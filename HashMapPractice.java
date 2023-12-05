import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hs=new HashMap<>();

        hs.put(505, "Arun");
        hs.put(504,"Aditya");

        System.out.println(hs);

        System.out.println(hs.get(505));
        System.out.println(hs.remove(504));
        System.out.println(hs);
        System.out.println(hs.containsKey(504));
        System.out.println(hs.containsValue("Arun"));

       

    }
}
