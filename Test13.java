class Plane{
    public void landing(){
        System.out.println("landing a plane");
    }
}
class Cargo extends Plane{
    public void landing(){
        System.out.println("Cargo is Landing");
    }
    public void takeoff(){
        System.out.println("Taking Off");
    }
}
public class Test13 {
    public static void main(String[] args) {
        Plane p=new Cargo();
        p.landing();
        // p.takeoff();  Parent Class Cannot Access Child class Special Methods.
        ((Cargo) p).takeoff(); //Down casting
    }
}
