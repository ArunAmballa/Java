class A{
    public void show(){
        System.out.println("Show Method of A");
    }
    @Override
    public String toString(){
        return "Hello Arun";
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("Show Method of B");
    }
}
public class Test11 {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
        System.out.println(obj);
    }
}
