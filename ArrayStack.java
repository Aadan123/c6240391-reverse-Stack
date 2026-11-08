/**
 * Array-based stack for integer values.
 * Starts with capacity 2 and doubles whenever the array becomes full.
 */
public class ArrayStack {
    private int[] elements;
    private int top;

    public ArrayStack() {
        this(2);
    }

    public ArrayStack(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive.");
        }
        elements = new int[initialCapacity];
        top = 0;
    }

    public void push(int value) {
        if (top == elements.length) {
            expandCapacity();
        }
        elements[top] = value;
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        top--;
        return elements[top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    private void expandCapacity() {
        int[] larger = new int[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            larger[i] = elements[i];
        }
        elements = larger;
    }
}
