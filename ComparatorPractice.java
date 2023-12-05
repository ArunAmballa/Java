import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    public int rollno;
    public String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
    
 
}

public class ComparatorPractice 
{
    public static void main(String[] args) 
    {

        Student s1=new Student(504,"Aditya");

        Student s2=new Student(501,"Sai");

        Student s3=new Student(505,"Arun");

        Student s4=new Student(506,"Phani");

        Alpha a=new Alpha();

        ArrayList<Student> arr=new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);

        Comparator<Student> ref=new Comparator<Student>() {
            public int compare(Student obj1,Student obj2)
                {
                    if (obj1.rollno>obj2.rollno)
                    {
                        return 1;
                    }
                    else
                    {
                        return -1;
                    }
                }
        };

        System.out.println(arr);

        Collections.sort(arr,ref);

        System.out.println(arr);


        

        
    }
}
