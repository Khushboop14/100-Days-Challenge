package Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of first array");
        int n = sc.nextInt();

        System.out.println("enter size of second array");
        int m = sc.nextInt();

        int arr1[] = new int[n];
        int arr2[] = new int[m];

        System.out.println("enter element of the first array: ");
        for(int i = 0 ; i < n ; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("enter element of the second array: ");
        for(int i = 0 ; i < m ; i++){
            arr2[i] = sc.nextInt();
        }
        int result = mergeArrays(arr1, arr2);

        System.out.println("First array : " + Arrays.toString(arr1));
        System.out.println("Second array : " + Arrays.toString(arr2));
    }

    private static int[] mergeArrays(int[] arr1, int[] arr2) {
                for(int i =0; i < arr1.length; i++){
                    for(int j=0; j<arr2.length; j++){
                        if(arr1.length > arr1.length){
                            arr1 = arr2[j] ;
                            j++;
                        }
                    }
                }



        return new int[]{0};
    }
}
