import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Employee
{
	String name;
	int id;
	int age;
	
	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " " + id + " " + age;
	}

}
public class Test57
{
    public static void main(String[] args) 
    {
        Employee obj1=new Employee("arun",505,26);
		Employee obj2=new Employee("Aditya",504,25);
		Employee obj3=new Employee("Phani",506,27);
		
		ArrayList list=new ArrayList();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		System.out.println(list);

        Comparator<Employee> ref= (Employee emp1,Employee emp2)->
        {
            if(emp1.id>emp2.id)
            {
                return 1;
            }
            else
            {
                return -1;
            }

        };
        Collections.sort(list,ref);
        System.out.println(list);

    }
}

