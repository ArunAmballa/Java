enum Result
    {
        PASS,FAIL,NR;

        int marks;

        Result()
        {
            System.out.println("Constructor of Enum");
        }

        void setMarks(int marks)
        {
            this.marks=marks;
        }
        int getMarks()
        {
            return marks;
        }
    }
public class Test63 
{
    
    public static void main(String[] args) 
    {
        Result m=Result.PASS;
        System.out.println(m);
        Result.PASS.setMarks(40);
        int m1=Result.PASS.getMarks();
        System.out.println(m1); 

    }
}
 