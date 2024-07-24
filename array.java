import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("How many elements you want to store in the array:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter "+n+" number:- ");
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Elements present in the array:- " );
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);}
    }
}
