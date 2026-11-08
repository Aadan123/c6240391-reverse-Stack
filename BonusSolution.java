import java.util.Arrays;

public class BonusSolution {

    /**
     * Reverses only the first k elements of the array using ArrayStack.
     * The remaining elements keep their original order.
     */
    public static int[] reverseFirstK(int[] numbers, int k) {
        if (numbers == null) {
            throw new IllegalArgumentException("Input array cannot be null.");
        }
        if (k < 0 || k > numbers.length) {
            throw new IllegalArgumentException("K must be between 0 and the array length.");
        }

        ArrayStack stack = new ArrayStack(2);

        // Push only the first k elements.
        for (int i = 0; i < k; i++) {
            stack.push(numbers[i]);
        }

        int[] result = Arrays.copyOf(numbers, numbers.length);

        // Pop them back into the first k positions in reverse order.
        int index = 0;
        while (!stack.isEmpty()) {
            result[index] = stack.pop();
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 3;

        int[] result = reverseFirstK(numbers, k);

        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("K = " + k);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
