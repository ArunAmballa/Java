class A 
{
    public void show()
    {
        System.out.println("Show Method of A");
    }
}
class B extends A
{
    @Override
    public void show()
    {
        System.out.println("Show Method of Class B");
    }
}
public class Test64 
{
    public static void main(String[] args) 
    {
        B obj=new B();
        obj.show();
        
    }
    
}
