class Animal{
    public void eat(){
        System.out.println("Animal Eating.....");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("Dog Eating");
    }
}
class Forest{
    public void check(Animal ref){
        ref.eat();
    }
}
public class Test14 {
    public static void main(String[] args) {
        Forest obj=new Forest();
        Animal a=new Animal();
        Dog d=new Dog();
        obj.check(a);
         obj.check(d);
    }
}
