import java.util.Arrays;

public class Lec10ArraysClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // #1: Find an element using binary search
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is: " + index);

        // #2: For sorting
        Integer[] numbers2 = {10, 2, 32, 12, 15, 76, 17, 48, 79};
        Arrays.sort(numbers2);
        for(int i: numbers2) {
            System.out.print(i + " "); // 2 10 12 15 17 32 48 76 79
        }
        System.out.println();
        // It generally sorts using quick sort
        // But if number of elements >= 8192
        // It uses parallel sort
        
        // #3: Fill values
        Arrays.fill(numbers2, 12);
        for(int i: numbers2) {
            System.out.print(i + " "); // 12 12 12 12 12 12 12 12 12
        }

    }
}
