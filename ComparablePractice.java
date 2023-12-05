import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
    public int eid;
    public String name;
    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + "]";
    }
    public Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }  
    @Override
    public int compareTo(Employee obj1)
    {
        if (this.eid>obj1.eid)
        {
            return 1;
        }
        else{
            return -1;
        }
            }
}
public class ComparablePractice 
{

    public static void main(String[] args) 
    {
        Employee emp1=new Employee(505, "Arun");
        Employee emp2=new Employee(504, "Adi");

        ArrayList<Employee> arr=new ArrayList<>();
        arr.add(emp1);
        arr.add(emp2);
        System.out.println(arr);

        Collections.sort(arr);

        System.out.println(arr);


        
    }
    
}
