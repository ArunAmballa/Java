import java.util.ArrayList;

public class Test70 
{
      public static void main(String[] args) 
      {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(23);
        list.add(11);
        list.add(24);
        list.add(15);
        list.add(20);

        Integer sum=list.stream()
                        .filter(x->x%2==0).map(x->x*2).reduce(0,(c,e) -> c+e);
        System.out.println(sum);
        
      }
}
