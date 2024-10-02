
import java.util.Arrays;

public class ArraySortDescending {

    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {42, 15, 8, 23, 4};

        // Printing the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array in descending order
        Arrays.sort(numbers); // No Comparator needed for descending order

        // Reversing the array to achieve descending order
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }

        // Printing the sorted array
        System.out.println("Sorted array (descending): " + Arrays.toString(numbers));
    }
}
