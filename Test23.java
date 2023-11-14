class Student
{
    int marks;
    String name;
}
public class Test23 {
    public static void main(String[] args) {
        Student []studentarray=new Student[3];
        studentarray[0]=new Student();
        studentarray[1]=new Student();
        studentarray[2]=new Student();
        studentarray[0].marks=100;
        studentarray[0].name="arun";
        System.out.println(studentarray[0].name);
    }
}
