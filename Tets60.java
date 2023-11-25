import java.util.ArrayList;

class Human
{

}
class Employee extends Human
{
    private String name;
    private int age;

    public Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String toString()
    {
        return name+" "+age;
    }
}
public class Tets60 
{
    public static void main(String[] args) 
    {
        Employee obj=new Employee("Arun", 25);
        Employee obj1=new Employee("Aditya", 26);

        ArrayList<Human> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        // list.add(10); This is Not Allowed Since Arraylist is of Type Employee

        System.out.println(list);
    }
}
