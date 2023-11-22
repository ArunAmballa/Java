import java.util.ArrayDeque;

public class Test52 
{
    public static void main(String[] args)
    {
        ArrayDeque arr=new ArrayDeque<>();
        arr.add(10);
        arr.add(20);
        arr.add(300);
        System.out.println(arr);
        arr.pop();
        System.out.println(arr);
    }
}
