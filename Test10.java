class A{
    int a=10;
}
class B extends A{
    public void show(){
        System.out.println(super.a);
    }
}
public class Test10 {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
