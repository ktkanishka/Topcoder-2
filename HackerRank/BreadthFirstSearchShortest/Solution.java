import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,e,t;
        t = scanner.nextInt();
        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        
        int[] visited = new int[1001];
        int[] distance = new int[1001];
        Queue<Integer> queue = new LinkedList<Integer>();
        while((t--) > 0) {
            graph.clear();
            
            n = scanner.nextInt();
            e = scanner.nextInt();
            for(int i=0; i<n; i++) {
                graph.put(i, new ArrayList<Integer>());
            }
            for(int i=0; i<e; i++){
                int n1 = scanner.nextInt() - 1;
                int n2 = scanner.nextInt() - 1;
                
                graph.get(n1).add(n2);
                graph.get(n2).add(n1);
                
            }
            
            int startNode = scanner.nextInt() - 1;
            
            Arrays.fill(visited, 0);
            Arrays.fill(distance, -1);
            queue.clear();
            
            distance[startNode] = 0;
            queue.add(startNode);
            visited[startNode] = 1;
            
            while(!queue.isEmpty()) {
                int item = queue.poll();
                    for(int child : graph.get(item)) {
                        if(visited[child] == 0) {
                            queue.add(child);
                            visited[child] = 1;
                            distance[child] = distance[item] + 6;
                        }
                    }
            }
            
            for(int i=0; i<n; i++) {
                if(distance[i] != 0) {
                    System.out.print(distance[i] + " ");
                }
            }
            System.out.println();
        }
    }
}