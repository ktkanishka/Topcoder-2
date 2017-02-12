import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t,ladders,snakes;
        t = scanner.nextInt();
        while((t--) > 0) {
            Map<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();
            Map<Integer, Integer> snakeMap = new HashMap<Integer, Integer>();
            int[] visited = new int[105];
            int[] distance = new int[105];
            Arrays.fill(distance, -1);
            ladders = scanner.nextInt();
            for(int i=0; i<ladders; i++){
                ladderMap.put(scanner.nextInt(),scanner.nextInt());
            }
            snakes = scanner.nextInt();
            for(int i=0; i<snakes; i++){
                snakeMap.put(scanner.nextInt(),scanner.nextInt());
            }
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(1);
            visited[1] = 1;
            distance[1] = 0;
            while(!queue.isEmpty()) {
                int item = queue.poll();
                for(int i=1; i<=6; i++) {
                    int next = item + i;
                    if(next > 100) {
                        continue;
                    }
                    if(ladderMap.containsKey(next)) {
                        next = ladderMap.get(next);
                    }
                    if(snakeMap.containsKey(next)) {
                        next = snakeMap.get(next);
                    }
                    if(visited[next] == 0) {
                        visited[next] = 1;
                        queue.add(next);
                        distance[next] = distance[item] + 1;
                    }
                }
            }
            System.out.println(distance[100]);
        }
    }
}