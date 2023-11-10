abstract   class Computer{
    abstract public void compute();
    abstract public void gaming();
    public void show(){
        System.out.println("Showing a Movie");
    }
}
abstract class Laptop extends Computer{
    public void compute(){
        System.out.println("Computing");
    }
}
class Phone extends Laptop{
    public void gaming(){
        System.out.println("Gaming");
    }
}

public class Test15 {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.compute();
        p.gaming();
        p.show();
    }
}
