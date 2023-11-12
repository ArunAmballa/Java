class A{
    public void display(){
        System.out.println("Show of A");
    }
}
public class Test22 {

    public static void main(String[] args) {
        A obj=new A()
        {
            public void display(){
                System.out.println("Over riding Show of A");
            }
        };
        obj.display();
    }
    
}
