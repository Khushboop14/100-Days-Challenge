package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ReverseOfList{
    public static void main(String[] args) {
        // Use Scanner for input
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Read numbers until a negative number is encountered
        while(true) {
            int num = sc.nextInt();
            if(num < 0) {
                break;
            }
            arrayList.add(num);
        }

        // Print the ArrayList in reverse order
        for(int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
