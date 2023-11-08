class Animal{
    private int age;
    private String name;

    public void setAge(int age){
        age=age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class Test5 {
    public static void main(String[] args) {
        Animal obj=new Animal();
        obj.setAge(20);
        obj.setName("Dog");
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
