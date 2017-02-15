import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String word = in.next();
            if(map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        String ransom[] = new String[n];
        boolean possible = true;
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String word = in.next();
            if(!map.containsKey(word)) {
                possible = false;
                break;
            }
            map.put(word, map.get(word) - 1);
            if(map.get(word) <= 0) {
                map.remove(word);
            }
        }
        
        if(possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
