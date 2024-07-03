package Array;
import java.util.Scanner;

public class ContainsDuplicate {

    public static boolean checkDuplicate(int[] num){
        for(int i = 0; i < num.length; i++){
                if( num[i] == num[i+1]){
                    return true;
                }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of element in array: ");
        int i = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter element in array: ");
        for(; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        //  System.out.println("given array elements are : "+ arr[i]);

        boolean res = ContainsDuplicate.checkDuplicate(arr);
        System.out.println(res);
    }
}
