import java.lang.annotation.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD,ElementType.CONSTRUCTOR,ElementType.TYPE})
@interface Game
{

}
@Game
class Cricket
{
    @Game
    Cricket()
    {
        System.out.println("Playing Cricket");
    }
}
public class Test69 
{
    public static void main(String[] args) 
    {
        Cricket obj=new Cricket();
    
    }
}
