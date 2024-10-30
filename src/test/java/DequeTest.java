import com.barry.structure.Deque;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {

    @Test
    public void testDequeOperations() {
        Deque deque = new Deque(5);

        // Test initial state
        assertTrue(deque.isEmpty());
        assertEquals(0, deque.size());

        // Test offerLatest
        assertTrue(deque.offerLatest(1));
        assertTrue(deque.offerLatest(2));
        assertTrue(deque.offerLatest(3));
        assertEquals(3, deque.size());

        // Test peekLatest and popLast
        assertEquals(3, deque.peekLatest());
        assertEquals(3, deque.popLast());
        assertEquals(2, deque.size());

        // Test offerFirst
        assertTrue(deque.offerFirst(4));
        assertTrue(deque.offerFirst(5));
        assertEquals(4, deque.size());

        // Test peekFirst and popFirst
        assertEquals(5, deque.peekFirst());
        assertEquals(5, deque.popFirst());
        assertEquals(3, deque.size());

        // Test full deque
        assertTrue(deque.offerLatest(6));
        assertTrue(deque.offerLatest(7));
        assertFalse(deque.offerLatest(8)); // Should return false as deque is now full
        assertEquals(5, deque.size());

        // Test emptying the deque
        assertEquals(4, deque.popFirst());
        assertEquals(1, deque.popFirst());
        assertEquals(2, deque.popFirst());
        assertEquals(7, deque.popLast());
        assertEquals(6, deque.popLast());
        assertEquals(0, deque.size());
        assertTrue(deque.isEmpty());

        // Test exception when popping from empty deque
        assertThrows(RuntimeException.class, deque::popFirst);
        assertThrows(RuntimeException.class, deque::popLast);
        assertThrows(RuntimeException.class, deque::peekFirst);
        assertThrows(RuntimeException.class, deque::peekLatest);
    }
}
