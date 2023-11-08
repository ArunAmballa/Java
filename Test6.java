class Calc extends Object{
    
    public Calc(){
        this(20);
        System.out.println("Default Constructor");
    }
    public Calc(int a){
        super();
        System.out.println("Parameterized Constructor");
    }
}
public class Test6 {
    public static void main(String[] args) {

        Calc obj=new Calc();
        
        
    }
}
