import java.util.HashSet;
import java.util.Set;

public class Lec07Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        // Set Interface -> EnumSet, HashSet, LinkedHashSet, TreeSet
        // Set<Integer> linkedSet = new LinkedHashSet<>(); -> Order is maintained
        // Set<Integer> treeSet = new TreeSet<>(); -> Sorted order -> Log(N) complexity
        
        // #1: To add an element
        set.add(23);
        set.add(23);
        set.add(1);
        set.add(24);
        set.add(1);
        System.out.println(set); // [1, 23, 24]

        // #2: To remove an element
        set.remove(23);
        System.out.println(set); // [1, 24]

        // #3: To check whether an element exists or not
        System.out.println(set.contains(24)); // true

        // #4: To check whether set is empty or not
        System.out.println(set.isEmpty()); // false

        // #5: To check size of the set
        System.out.println(set.size()); // 2

        // #6: To clear set
        set.clear();
        System.out.println(set); // []
    }
}
