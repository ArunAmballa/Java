@FunctionalInterface
interface Calc
{
    void add();
}
public class Practice5 
{
    public static void main(String[] args) 
    {
        Calc obj=new Calc()
        {
            public void add()
            {
                System.out.println("Show Method ");
            }

        };

        obj.add();
    }
}
