import java.util.Stack;

public class Lec02Stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        // #1: To push element
        st.push(4);
        st.push(2);
        st.push(5);
        st.push(7);
        System.out.println(st); // [4, 2, 5, 7]
        
        // #2: To peek top element
        System.out.println(st.peek()); // 7
        
        // #3: To pop out topmost elements
        st.pop(); // Returns that element
        System.out.println(st); // [4, 2, 5]
        System.out.println(st.peek()); // 5
    }
}
