class Human
{
    static int age;
    static int number;
    int id;
    {
        id=0001;
    }
    static
    {
        age=10;
        number=12456;
    }
    public static void show()
    {
        System.out.println("Static Method of Parent Class");
    }
}
class Animals extends Human
{
    
    public static void show()
    {
        System.out.println("Static Method of Child Class");
    }
}
public class Practice3 
{
    public static void main(String[] args) 
    {
        Animals obj=new Animals();
        obj.show();
    }
    
}
