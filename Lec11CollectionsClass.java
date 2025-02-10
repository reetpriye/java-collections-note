import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lec11CollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(9);
        list.add(75);
        list.add(9);

        // #1: To find the minimum element
        System.out.println("Min element: " + Collections.min(list));
        
        // #2: To find the maximum element
        System.out.println("Max element: " + Collections.max(list));
        
        // #3: To find the frequency of an element
        System.out.println("Frequency of 9: " + Collections.frequency(list, 9));
        
        // #4: To sort the list in the ascending order
        Collections.sort(list);
        System.out.println(list); // [9, 9, 9, 12, 29, 34, 75, 76]
        
        // #5: To sort the list in the descending order
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list); // [76, 75, 34, 29, 12, 9, 9, 9]
    
        // #6: To sort object of an class
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Reet", 1));
        studentList.add(new Student("Preet", 2));
        studentList.add(new Student("Manish", 3));
        studentList.add(new Student("Shivam", 4));
        studentList.add(new Student("Rohit", 5));

        // To do the comparison the class must extend the comparable interface
        // and implement compareTo method
        Collections.sort(studentList);
        System.out.println(studentList);
        // [[name=Reet, rollNo=1], [name=Preet, rollNo=2], [name=Manish, rollNo=3], [name=Shivam, rollNo=4], [name=Rohit, rollNo=5]]

        // Second way will be to pass in an anonymous object of Comparator
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        // Using lambda function
        Collections.sort(studentList, (Student o1, Student o2) -> o1.name.compareTo(o2.name));

        System.out.println(studentList);
        // [[name=Manish, rollNo=3], [name=Preet, rollNo=2], [name=Reet, rollNo=1], [name=Rohit, rollNo=5], [name=Shivam, rollNo=4]]
    }
}
