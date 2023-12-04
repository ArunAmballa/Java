interface A
{
    default void show(){
        System.out.println("Show of Interface A");
    }
}
interface B
{
    default void show(){
        System.out.println("Show of Interface A");
    }
}
class Calc implements A,B
{
   
}
public class Test28 {
    
}
