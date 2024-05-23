package fundamental;
import java.util.Scanner;
public class Palindrom{
        public static boolean isPalindrome(int x) {

            if (x<0){
                return false;
            }
            int orignal = x;
            int rev = 0;
            int lastD ;
            while(x != 0){
                lastD = x%10;
                rev = rev*10 + lastD;
                x = x/10;

            }
            return (rev == orignal);
        }

    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean p = isPalindrome(x) ;
        System.out.println(p);
    }
}


