import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lec04LinkedListUsingList {
    public static void main(String[] args) {
        List<String> students = new LinkedList<>();
        // As ArrayList and LinkedList both implements List interface
        // We can use those methods on linked list as well

        // #1. To add element
        students.add("Shivam");
        students.add("Reet");
        System.out.println(students); // [Shivam, Reet]
        // -> IMP: Able to print elements Because it invokes toString() method that is attached to every java classes
        
        // #2: To add an element at an index -> O(N) complexity
        students.add(1, "Preet");
        System.out.println(students); // [Shivam, Preet, Reet]

        // #3: To append another list
        List<String> students2 = new LinkedList<>();
        students2.add("Zake");
        System.out.println(students2); // [Zake]
        students.addAll(students2);
        System.out.println(students); // [Shivam, Preet, Reet, Zake]
    
        // #4: To get an element
        System.out.println(students.get(3)); // Zake
        
        // #5: To remove an element -> O(N) compelxity
        // If we are passing int value it will remove that index element
        students.remove(1);
        System.out.println(students); // [Shivam, Reet, Zake]
        // If we are passing the type then it will find that element and then remove it
        students.remove(String.valueOf("Zake"));
        System.out.println(students); // [Shivam, Reet]

        // #6: To clear list
        students.clear();
        System.out.println(students); // []

        // #7: To replace an element
        List<String> newStudents = new LinkedList<>();
        newStudents.add("Reet");
        newStudents.add("Preet");
        newStudents.add("Zil");
        newStudents.add("Tara");

        System.out.println(newStudents); // [Reet, Preet, Zil, Tara]

        // #8: Check if an element exists or not -> O(N) complexity
        boolean isZilPresent = newStudents.contains("Zil");
        System.out.println(isZilPresent); // true

        // #8. To iterate
        for(int i=0; i<newStudents.size(); i++) {
            System.out.println("The element is: " + newStudents.get(i));
        }
        // For each loop
        for(String student: newStudents) {
            System.out.println("For each:" + student);
        }
        // Iterator of type String
        Iterator<String> it = newStudents.iterator();
        while(it.hasNext()) {
            System.out.println("Iterator: " + it.next());
        }
    }
}
