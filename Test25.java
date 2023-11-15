public class Test25 {
    public static void main(String[] args) {
        
        String s1="arun";
        String s2="arun";
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);

        String s11=new String("arun");
        String s22=new String("arun");

        System.out.println(s11.equals(s22));
        System.out.println(s11==s22);
    }
}
