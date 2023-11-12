class A{
    public void show(){
        System.out.println("Show Method of A");
    }

    class B{
        public void show(){
            System.out.println("in B Show");
        }
    }
    static class C{
        public void show(){
            System.out.println("Show of Class C");
        }
    }
}
public class Test21 {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.show();

        A.C obj2=new A.C();
        obj2.show();
 
    }
}
