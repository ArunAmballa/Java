import java.util.Scanner;

public class Array {
    public static void main(String[] args) 
    {
        int []arr=new int[2];
        arr[0]=1;
        arr[1]=2;

        int []arr1={1,2,34,5,6};
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        int [][]shapes={{1,2,3},{12,2,3}};
        int [][]array=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println("Enter Marks");
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j]);
                
            }
        }

        int [][]l=new int[3][];
        l[0]=new int[4];
        l[1]=new int[2];
        l[2]=new int[4];

    }
}
   