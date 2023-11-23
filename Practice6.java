interface Bike
{
    void ride();
}
public class Practice6 
{
    public static void main(String[] args) 
    {
        Bike obj=()->{System.out.println("Riding Bike");};
        obj.ride();
    }
    
}
