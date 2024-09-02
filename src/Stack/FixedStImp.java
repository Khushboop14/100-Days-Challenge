package Stack;
import java.util.Scanner;

public class FixedStImp {
    static final int max = 10;
    static int top = -1;
    static void  push(int n, int[] array){
        if(top < max-1) {
            top++;
            array[top] = n;
            System.out.println("push: "+ n);
        }
        else{
            System.out.println("StackOverFlow");
        }
    }
    static void pop(int[] array){
        if(top >= 0){
            int poppedEle= array[top];
            System.out.println("poped element: "+poppedEle);
        }
        else{
            System.out.println("StackUnderFlow");
        }

    }
    static int size(){
       System.out.println("size of array: "+ (top+1));
      return(top+1);
    }
    static int top(int[]array){
        System.out.println("top: "+top);
        return array[top];
    }
    static void display(int[] array){
        int i = 0;
        while(i <= top){
            if(top>0)
                System.out.println(array[i]);
            else
                System.out.println("Stack is empty");
        }
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[max];
        int n;
        while(true) {
            System.out.println("\n 1. push\n 2. pop\n 3. size\n 4.top\n 5.display\n 6.exist ");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("enter element to push");
                     n = sc.nextInt();
                     push(n, array);
                     break;
                case 2:
                    pop(array);
                    break;
                case 3:
                    size();
                    break;
                case 4:
                    top(array);
                    break;
                case 5:
                    display(array);
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
   }
}


