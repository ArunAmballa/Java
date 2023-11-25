import java.util.ArrayList;

public class Test59 
{
    public static void main(String[] args) 
    {
        int []arr=new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        
        ArrayList list1=new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(24);
        list1.add("Arun");

        for(int i=0;i<list1.size();i++)
        {
            System.out.println(list1.get(i));
        }

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(24);

        // list.add("arun") This will give Compile Time Error
        System.out.println(list.get(0));



    }
    
}
