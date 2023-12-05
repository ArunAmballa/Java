import java.util.ArrayDeque;

public class DequePractice 
{
    public static void main(String[] args) 
    {
        ArrayDeque<Integer> d=new ArrayDeque<>();
        d.add(10);
        d.add(20);
        System.out.println(d);

        d.offer(30);
        d.offerFirst(5);
        d.offerLast(25);

        System.out.println(d);

        d.pollFirst();
        d.pollLast();
        System.out.println(d);
    }
}
