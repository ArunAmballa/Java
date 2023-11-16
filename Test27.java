interface A
{
   void show();
}
interface B
{
    void show();
}
class Calc implements A,B
{
    @Override
    public void show()
    {
        System.out.println("Show Method of Calc Class");
    }
}
public class Test27 
{
    public static void main(String[] args) 
    {
        Calc obj=new Calc();
        obj.show();
    }
    
}
