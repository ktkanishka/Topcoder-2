import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static int numberNeeded(String first, String second) {
      Set<Character> set = new HashSet<Character>();
        int[] firstCount = new int[200];
        int[] secondCount = new int[200];
        for(char c : first.toCharArray()) {
            set.add(c);
            firstCount[(int)c]++;
        }
        for(char c : second.toCharArray()) {
            set.add(c);
            secondCount[(int)c]++;
        }
        int result = 0;
        for(char c : set) {
            result = result + Math.abs(firstCount[c] - secondCount[c]);
        }
        return result;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
