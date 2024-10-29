import com.barry.structure.CircularQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularQueueTest {

    @Test
    public void testCircularQueue() {
        CircularQueue queue = new CircularQueue(5);

        // Test initial state
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Test pull operation
        queue.pull(1);
        queue.pull(2);
        queue.pull(3);

        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());

        // Test peek operation
        assertEquals(1, queue.peek());

        // Test pop operation
        assertEquals(1, queue.pop());
        assertEquals(2, queue.size());

        // Test circular behavior
        queue.pull(4);
        queue.pull(5);

        // Queue is now full
        assertThrows(RuntimeException.class, () -> queue.pull(6));

        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());

        // Test wrapping around
        queue.pull(6);
        queue.pull(7);

        assertEquals(4, queue.peek());
        assertEquals(4, queue.size());

        // Pop all remaining elements
        assertEquals(4, queue.pop());
        assertEquals(5, queue.pop());
        assertEquals(6, queue.pop());
        assertEquals(7, queue.pop());

        // Queue should be empty now
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        // Test popping from empty queue
        assertThrows(RuntimeException.class, queue::pop);
        assertThrows(RuntimeException.class, queue::peek);
    }
}
