import java.util.LinkedList;
import java.util.Queue;

public class Lec03LinkedListUsingQueue {
    public static void main(String[] args) {
        // Queue is an interface which can be implemented using array, linked list
        // or a priority queue
        Queue<Integer> q = new LinkedList<>();
        
        // #1: To add element
        q.offer(1); // Returns true or false depending on whether the job is done or not
        q.offer(3);
        q.offer(2);
        q.offer(5);
        System.out.println(q); // [1, 3, 2, 5]
        // We can also use the add() to insert an element but it throws an exception in case
        // task is not successfull, whereas offer just return true or false
        
        // #2: To remove element
        q.poll(); // Returns that element
        System.out.println(q); // [3, 2, 5]
        // remove() does the same job, but throws an exception in case queue is empty

        // #3: To check the front element
        System.out.println(q.peek()); // 3
        // Returns null in case the queue is empty
        // element() does the same thing but throws an exception in case queue is empty
    }
}
