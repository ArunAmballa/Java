interface A 
{
    void show();
}
public class Test29 
{
    public static void main(String[] args) 
    {
        // A obj=new A() {
        //     public void show()
        //     {
        //         System.out.println("Showing....");
        //     }
        // };
        // obj.show();

        A obj=()->{System.out.println("Showing");};

        obj.show();
    }
}
