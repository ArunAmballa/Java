// Final Class
// Final Method
// Final Variable 
class Calc
{
    final int data=10;

    public final int add(int n1,int n2)
    {
        return n1+n2;
    }
}
class CalcPro extends Calc
{
    // public final int add(int n1,int n2)
    // {
    //     return n1+n2;
    // }
}
public class Practice2 
{
    public static void main(String[] args) 
    {
        CalcPro obj=new CalcPro();
        System.out.println(obj.data);
    }
}
