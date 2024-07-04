package Array;

import java.util.Scanner;

public class BinarySearch {

        public static int bSearch(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
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
        int result = bSearch(arr , target);
        System.out.println(result);
    }
}


