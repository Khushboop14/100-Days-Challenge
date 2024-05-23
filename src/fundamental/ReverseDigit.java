package fundamental;
import javax.sound.sampled.ReverbType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseDigit {
    public static int ReverseMethod(int n){
//         *************** WAY-1 **************
        int rev = 0;
        int lastD;
        //to handle -ve values.
        while(n != 0){
            lastD = n%10;
            rev = rev*10+lastD;
            n = n/10;
        }
        return rev;

//         *************** WAY-2(ARRAYLIST) **************
//        //converts the integer n into string
//        String numString = String.valueOf(num);
//        //create arrayList to store the digits
//        ArrayList<Character> reverseDigit = new ArrayList<Character>();
//
//        //add each digit to arraylist as a char using a while loop
//        int i = 0;
//        while(numString.length() > i){
//            char Digit = numString.charAt(i);
//            reverseDigit.add(Digit);
//            i++;
//        }
//        //reverse the arraylist
//        Collections.reverse(reverseDigit);
//
//        //re-convert the reversed integer from arraylist
//        StringBuilder reverseNumString = new StringBuilder();
//        for(char lastDigit: reverseDigit){
//            reverseNumString.append(reverseDigit);
//        }
//        return reverseNumString;

  }


  public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to reverse:");
        int n = sc.nextInt();
       // ArrayList<Integer> reverse = Reverse(n);
      int rev = ReverseMethod(n);
        System.out.println("reverse: "+ rev);
    }
}
