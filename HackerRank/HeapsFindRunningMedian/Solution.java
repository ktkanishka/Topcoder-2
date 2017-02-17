import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * Created by manoharprabhu on 2/18/2017.
 */
public class MedianFind {
    private static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
    private static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();

        while((n--) > 0) {
            int num = scanner.nextInt();
            insert(num);
            printMedian();
        }
    }

    private static void printMedian() {
        if(maxHeap.size() == minHeap.size()) {
            int n1 = maxHeap.peek();
            int n2 = minHeap.peek();
            System.out.printf("%.1f\n",((float)(n1 + n2) / 2));
        } else {
            if(maxHeap.size() > minHeap.size()) {
                System.out.printf("%.1f\n",(float)maxHeap.peek());
            } else {
                System.out.printf("%.1f\n",(float)minHeap.peek());
            }
        }
    }

    private static void insert(int num) {
        if(maxHeap.peek() != null && maxHeap.peek() < num) {
            minHeap.add(num);
        } else {
            maxHeap.add(num);
        }

        if(Math.abs(maxHeap.size() - minHeap.size()) >= 2) {
            if(maxHeap.size() > minHeap.size()) {
                minHeap.add(maxHeap.poll());
            } else {
                maxHeap.add(minHeap.poll());
            }
        }
    }
}
