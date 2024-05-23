package fundamental;

import java.util.Scanner;

public class Gcd {
        static Long[] lcmAndGcd(Long A , Long B) {
            long lcm = 1;
            long gcd = 1;

            // Handle the case when one of the numbers is zero
            if (A == 0) {
                gcd = B;
            } else if (B == 0) {
                gcd = A;
            } else {
                for (int i = 1; i <= Math.min(A, B); i++) {
                    if (A % i == 0 && B % i == 0) {
                        gcd = i;
                    }
                }
                lcm = (A * B) / gcd;
            }

            return new Long[]{lcm, gcd};
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value of A: ");
            long A = scanner.nextLong();
            System.out.print("Enter the value of B: ");
            long B = scanner.nextLong();

            Long[] result = lcmAndGcd(A, B);
            System.out.println("LCM: " + result[0]);
            System.out.println("GCD: " + result[1]);

            scanner.close();
        }
    }


