import java.util.Scanner;

public class Searcharray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many elements you want to store in the array:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements:- ");
        for(int i=0;i<n;i++)
             arr[i]=sc.nextInt();
        System.out.println("Enter the element you want to search in the array:- ");
        int key=sc.nextInt();
        int flag=0;
        System.out.println("Searching for the element.....");
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                flag=1;
                System.out.println("Element found at "+i+" index.");
                break;
            }

        }
        if(flag==0)
            System.out.println("Element is not present in the array!");

    }
}
