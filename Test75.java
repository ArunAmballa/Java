import java.util.ArrayList;

class Human{

}
class Student extends Human{

}
public class Test75 
{
    public static void main(String[] args) 
    {
        ArrayList<Human> arr=new ArrayList<>();
        Student s=new Student();
        arr.add(s);
        

        ArrayList<Student> arr1=new ArrayList<>();
        Human obj=new Human();
        arr1.add(obj);

        
    }
}
