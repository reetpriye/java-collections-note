
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lec05PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Since PriorityQueue also implements the Queue interface
        // We can use methods that we used for LinkedList using Queue

        // #1: To add an element
        minHeap.offer(5);
        minHeap.offer(4);
        minHeap.offer(2);
        minHeap.offer(1);
        System.out.println(minHeap); // [1, 2, 4, 5]
        
        // #2: To remove the top most element
        minHeap.poll();
        System.out.println(minHeap); // [2, 4, 5]

        // #3: To create a max heap -> Pass in comparator to the constructor
        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(5);
        maxHeap.offer(4);
        maxHeap.offer(2);
        maxHeap.offer(1);
        System.out.println(maxHeap); // [5, 4, 2, 1]
        maxHeap.poll();
        System.out.println(maxHeap); // [4, 1, 2]
    }
}
