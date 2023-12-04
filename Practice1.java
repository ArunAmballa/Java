import java.lang.String;

class A
{
    int age=10;
    public void show()
    {
        System.out.println("Showing Method of class A");
    }
    
}
class B extends A
{
    public void show()
    {
        System.out.println("Showing of Class B");
        System.out.println(super.age);
    }
}
class C extends B
{

}
public class Practice1 
{
    public static void main(String[] args) {
        C obj=new C();
        obj.show();
    }
    
}
