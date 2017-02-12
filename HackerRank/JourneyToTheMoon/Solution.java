import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by manoharprabhu on 2/8/2017.
 */
public class JourneyToMoon {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n,l;
        n = scanner.nextInt();
        Map<Integer, List<Integer>> traverseMap = new HashMap<Integer, List<Integer>>();
        List<Long> groupCount = new ArrayList<Long>();
        int[] visited = new int[n];
        l = scanner.nextInt();
        for(int i = 0 ; i < l; i++) {
            int pair1, pair2;
            pair1 = scanner.nextInt();
            pair2 = scanner.nextInt();

            if(!traverseMap.containsKey(pair1)) {
                traverseMap.put(pair1, new ArrayList<Integer>());
            }
            if(!traverseMap.containsKey(pair2)) {
                traverseMap.put(pair2, new ArrayList<Integer>());
            }

            traverseMap.get(pair1).add(pair2);
            traverseMap.get(pair2).add(pair1);
        }

        int count;
        for(int current = 0; current <= n - 1; current++) {
            count = 0;
            Queue<Integer> queue = new LinkedList<Integer>();
            queue.add(current);
            while(!queue.isEmpty()) {
                int item = queue.poll();
                if(visited[item] == 0) {
                    visited[item] = 1;
                    count++;
                    if(traverseMap.get(item) != null)
                        queue.addAll(traverseMap.get(item));
                }
            }

            groupCount.add((long)count);
        }

        long result = 0L;
        long np = n;
        for(long item : groupCount){
            result += item * (np -= item);
        }
        System.out.println(result);
    }
}
