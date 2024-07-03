package Array;

import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicate {

    public static int removeDuplicate(int[] array){
        Arrays.sort(array);
        System.out.println(array);
        int temp = 1;
        for(int i = 0; i < array.length-1;i++){
            if (array[temp] != array[i]) {
                    temp++;
                    array[temp] = array[i+2];
                }
            }

        return 0;

        }
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

        int[] res = RemoveDuplicate.removeDuplicate(arr);
        System.out.println(res);
    }
}
