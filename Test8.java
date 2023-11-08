class Calcu{
    public int add(int a,int b){
        return a+b;
    }
}
public class Test8 {
    public static void main(String[] args) {
        Calcu obj=new Calcu();
        System.out.println(obj.add(1,2));
    }
}
