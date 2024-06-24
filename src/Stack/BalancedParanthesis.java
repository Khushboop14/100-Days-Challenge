package Stack;

import java.util.Stack;
import java.util.Scanner;

public class BalancedParanthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        sc.nextLine(); // Consume the newline character after integer input

        while(testcase > 0){
            String paranthesis = sc.nextLine();
            if (isBalanced(paranthesis)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            testcase--;
        }
    }

    public static boolean isBalanced(String paranthesis) {
        Stack<Character> stack = new Stack<>();

        for (char ch : paranthesis.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
