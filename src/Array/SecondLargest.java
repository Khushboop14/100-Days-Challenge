package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    private static int secondlargest(int[] arr, int n) {
        Arrays.sort(arr);
        int i = arr[n-2];
            if(arr[i] != arr[i+1]){
                System.out.println(arr[i]);
            }
        return arr[i-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[]  = new int[n];
        for(int i  =0; i<= n-1;i++){
              arr[i] = sc.nextInt();
        }
        System.out.println("elements are: ");
        for(int i =0 ; i<= n-1;i++){
            System.out.print(+ arr[i]+"\t");
        }
          secondlargest(arr, n);
    }

}


