import java.util.Stack;

public class Ex6_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");

        System.out.println("Initial Stack: " + stack);

        // Peek at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element (peek): " + topElement);

        // Pop the top element (removes it from the Stack)
        String removedElement = stack.pop();
        System.out.println("Removed element (pop): " + removedElement);

        // Print the Stack after popping
        System.out.println("Stack after pop: " + stack);

        // Search for an element (returns the position from the top)
        int position = stack.search("First");
        System.out.println("Position of 'First' from the top: " + position);

        // Check if the Stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is Stack empty? " + isEmpty);

        // Get the size of the Stack
        int size = stack.size();
        System.out.println("Size of Stack: " + size);

        // Clear all elements from the Stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
