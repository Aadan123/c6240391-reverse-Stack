import java.util.Arrays;

public class Solution {

    /**
     * Reverses an integer array using the array-based stack.
     */
    public static int[] reverseArray(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }

        ArrayStack stack = new ArrayStack(2);

        // Push all numbers onto the stack.
        for (int number : numbers) {
            stack.push(number);
        }

        // Pop elements into a new array.
        int[] reversed = new int[numbers.length];
        int index = 0;
        while (!stack.isEmpty()) {
            reversed[index] = stack.pop();
            index++;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int[] result = reverseArray(numbers);

        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Reversed: " + Arrays.toString(result));
    }
}
