class A{
    static int a;
    static{
        a=10;
        System.out.println("Static Block");
    }
    int x;
    {
        x=11;
        System.out.println("Java Instance Initialization Block");
    }
    public A(){
        System.out.println("Constructor of Class A");
    }
    public static void display(){
        System.out.println("Static Method of class A");
    }
}
public class Test20 {
    public static void main(String[] args) {
        A.display();
        A obj=new A();
        obj.display();
    }


    
}
