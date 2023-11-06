class Alien{
    private int age;

    public Alien()
    {
        this(20);
    }
    public Alien(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

}
public class Test1 {
   public static void main(String[] args) {
    Alien a =new Alien();
    System.out.println(a.getAge());
   }
}
