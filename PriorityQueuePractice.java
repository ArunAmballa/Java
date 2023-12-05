import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueuePractice 
{
    public static void main(String[] args) 
    {

        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(10);
        pq.add(20);
        pq.add(5);
        System.out.println(pq);       
        System.out.println(pq.poll());
        System.out.println(pq);
        
       PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());

       pq1.add(5);
       pq1.add(10);
       System.out.println(pq1);


    }
}
