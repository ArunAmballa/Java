class Calc{

    // public int add(int n1,int n2){
    //     return n1+n2;
    // }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Calc obj=new Calc();
        System.out.println(obj.add(10,20));
        System.out.println(obj.add(10,20,30));
        System.out.println(obj.add(4.5,5.5));
    }
    
}
