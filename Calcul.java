class Calci extends Calcu{
    public int sub(int a,int b){
        return a-b;
    }
}
public class Calcul {
    public static void main(String[] args) {
        Calci obj=new Calci();
        System.out.println("add "+obj.add(1, 04));
        System.out.println(obj.sub(20,10));
    }
    
}
