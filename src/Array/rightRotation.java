package Array;
import java.util.Scanner;

public class rightRotation {

   public static boolean leftRotation(int[] arr, int k){
        int temp = arr[0];
        for(int i = 1; i<=k ;i++){
            for(int j=0; j <arr.length-1;j++){
                arr[j]= arr[j+1];
            }
            arr[arr.length-1] = temp;
        }

       return false;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of arrays");
        int n = sc.nextInt();
        System.out.println("enter elements of arrays");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("rotate by k");
        int k = sc.nextInt();
        System.out.println(leftRotation(arr,k));
    }
}
