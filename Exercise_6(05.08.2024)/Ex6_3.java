import java.util.LinkedList;
import java.util.Queue;

public class Ex6_3 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Print the Queue
        System.out.println("Initial Queue: " + queue);

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        // Remove the front element (dequeues it)
        String removedElement = queue.poll();
        System.out.println("Removed element (poll): " + removedElement);

        // Print the Queue after polling
        System.out.println("Queue after poll: " + queue);

        // Check if the Queue contains an element
        boolean containsSecond = queue.contains("Second");
        System.out.println("Queue contains 'Second'? " + containsSecond);

        // Get the size of the Queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size);

        // Check if the Queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is Queue empty? " + isEmpty);

        // Clear all elements from the Queue
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}
