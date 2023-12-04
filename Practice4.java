interface Calc
{
    int a=10;
    void add();
    void mul();
    default void show()
    {
        System.out.println("Show Method of Calc interface");
    }
    public static void display()
    {
        System.out.println("Stattic Method of Interface");
    }
}
interface CalcPro
{
    int a=10;
    void add();
    void mul();
    // default void show()
    // {
    //     System.out.println("Show Method of Calc interface");
    // }
}
class A implements Calc,CalcPro
{
    @Override
    public void add()
    {
        System.out.println("Adding");
    }

    @Override
    public void mul()
    {
        System.out.println("Multiplyig");
    }
}
public class Practice4 
{
    public static void main(String[] args) {
        
        A obj=new A();
        obj.add();
        obj.mul();
        obj.show();
        Calc.display();
        System.out.println(Calc.a);

    }
}
