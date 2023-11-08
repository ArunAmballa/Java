class Phone{
    public void call(){
        System.out.println("Calling from Phone");
    }
}
class Human{
    public void eat(){
        Phone p=new Phone();
        p.call();
        System.out.println("Human Can Eat");
    }
}
public class Test9 {
    public static void main(String[] args) {
        Human obj=new Human();
        obj.eat();
    }
}
