class Alien{
    private int age;
    
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
public class Encaps {
    public static void main(String[] args) {
        Alien a=new Alien();
        a.setAge(20);
        System.out.println(a.getAge());
    }
}
