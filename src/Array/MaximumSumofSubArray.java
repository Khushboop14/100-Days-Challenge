package Array;

import java.util.Scanner;

public class MaximumSumofSubArray {

    // Brute Force Solution O(n^3)
    private static int bruteSol(int[] arr, int n) {
        int maximum = Integer.MIN_VALUE; // maximum sum
        for(int i = 0; i < n; i++ ){
            for(int j = i; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum = sum + arr[k];
                }
                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;
    }

    // Better Solution O(n^2)
    private static int betterSol(int[] arr, int n) {
        int maximum = Integer.MIN_VALUE; // maximum sum
        for(int i = 0; i < n; i++ ){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum = sum + arr[j];
                maximum = Math.max(maximum, sum);
            }
        }
        return maximum;
    }

    // Optimal Solution O(n)
    public static int optimalSol(int[] arr, int n){
        int maximum = Integer.MIN_VALUE; // maximum sum
        int sum = 0; // store sum
        for(int i = 0; i < n; i++ ){
            sum = sum + arr[i];
            if(sum > maximum){
                maximum = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int brute = bruteSol(array, n);
        int better = betterSol(array, n);
        int optimal = optimalSol(array, n);

        System.out.println("BruteForce Solution: " + brute);
        System.out.println("Better Solution: " + better);
        System.out.println("Optimal Solution: " + optimal);
    }
}
