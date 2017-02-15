import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '(' || c =='[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.empty()) {
                    return false;
                }
                char opening = stack.pop();
                if(c == ')' && opening != '(') {
                    return false;
                }
                if(c == ']' && opening != '[') {
                    return false;
                }
                if(c == '}' && opening != '{') {
                    return false;
                }
            }
        }
        if(!stack.empty()) {
            return false;
        }
        return true;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
