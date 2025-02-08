
import java.util.ArrayDeque;

public class Lec06ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // offer() is coming from Queue Interface
        // offerLast() and offerFirst() is implemented in ArrayDeque() class

        // #1: To add element at the rear
        adq.offer(23);
        adq.offer(53);
        adq.offerLast(43);
        System.out.println(adq); // [23, 53, 43]
        
        // #2: To add element at the front
        adq.offerFirst(2);
        adq.offerFirst(4);
        System.out.println(adq); // [4, 2, 23, 53, 43]

        // #3: To check front element
        System.out.println(adq.peek()); // 4
        System.out.println(adq.peekFirst()); // 4
        
        // #4: To check rear element
        System.out.println(adq.peekLast()); // 43
        
        // #5: To pop out front element
        System.out.println(adq.poll()); // 4
        System.out.println(adq.pollFirst()); // 2
        
        // #6: To pop out rear element
        System.out.println(adq.pollLast()); // 43
        System.out.println(adq); // [23, 53]
    }
}
