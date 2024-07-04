package Array;
import java.util.Scanner;
import java.util.Arrays;
public class LinearSearch {

        public static int lSearch(int[] nums, int target) {
            for(int i=0; i< nums.length; i++){
                if(nums[i] == target){
                    return i;
                }
            }
            return -1;
        }

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int i = 0;
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    int target = sc.nextInt();
    int result = lSearch(arr , target);
    System.out.println(result);
}
}

