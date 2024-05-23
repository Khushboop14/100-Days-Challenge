package fundamental;
import java.lang.System;
import java.util.Scanner;

public class leap {
    //================way1===================================

//   public static void main (String[] args){
//       Scanner sc = new Scanner(System.in);
//       System.out.println("enter year");
//       int year = sc.nextInt();
//       if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
//        System.out.println(year + "year is leap year");
//       else
//           System.out.println(year+ "year is not leap year");

//================way2===================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter year");
        int year = sc.nextInt();

        boolean isLeapyear = leapYear(year);
        if (isLeapyear)
            System.out.println(year + "is a leap year");
        else
            System.out.println(year + "year is not leap year");
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)));
    }


       }