class Alien{
    private int age;
    Alien(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class Construct {
    public static void main(String[] args) {
        Alien a =new Alien(20);
        System.out.println(a.getAge());
    }
}
