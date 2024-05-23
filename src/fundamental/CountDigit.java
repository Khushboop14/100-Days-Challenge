package fundamental;

import java.util.Scanner;

import static java.lang.Math.log10;

public class CountDigit {
//        public static int countDigit(int num){
// ======= METHOD1 =======
//            int count = 0;
//            while (num>0){
//                num = num/10;
//                count++ ;
//            }
//            return count;

// ======= METHOD 2 =======
    public static int countDigit(int num){
                int count = (int) log10(num)+1;
            return count;
        }
        public static void main(String[] args) {
            int count = 0, n;
            System.out.println("enter number");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int digit = countDigit(n);
            System.out.println("the total number of number is: "+digit);
        }
}
