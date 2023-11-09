class Animal{
    protected void eat(){
        System.out.println("Eating......");
    }
}
class Dog extends Animal{
    //void eat() - You cannot reduce visibiltiy of overridden methods
    //public void eat()- You can increase the visibiltiy of Overriden Methods.
    public void eat(){
        System.out.println("Dog Eating");
    }
}
public class Test12 {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
    }
}
