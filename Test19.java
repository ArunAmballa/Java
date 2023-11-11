class A{
    public static void display(){
        System.out.println("Display Method of Parent Class");
    }
}
class B extends A{
    //@Override
    public static void display(){
        System.out.println("Display Method of Child Class");
    }
}
public class Test19 {
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}
