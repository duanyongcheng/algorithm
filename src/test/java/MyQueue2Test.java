import com.barry.structure.MyQueue2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MyQueue2Test {
    private MyQueue2 queue;

    @BeforeEach
    void setUp() {
        queue = new MyQueue2(5);
    }

    @Test
    public void testIsEmptyAndSize() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());

        queue.push(1);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
    }

    @Test
    public void testPushAndPop() {
        queue.push(1);
        queue.push(2);
        queue.push(3);

        assertEquals(1, queue.pop());
        assertEquals(2, queue.pop());
        assertEquals(1, queue.size());
    }

    @Test
    public void testPeek() {
        queue.push(1);
        queue.push(2);

        assertEquals(1, queue.peek());
        assertEquals(2, queue.size());
        assertEquals(1, queue.peek());
    }

    @Test
    public void testEmptyPop() {
        assertThrows(RuntimeException.class, () -> queue.pop());
    }

    @Test
    public void testEmptyPeek() {
        assertThrows(RuntimeException.class, () -> queue.peek());
    }

    @Test
    public void testPushPopSequence() {
        queue.push(1);
        queue.push(2);
        assertEquals(1, queue.pop());
        queue.push(3);
        assertEquals(2, queue.pop());
        assertEquals(3, queue.pop());
        assertTrue(queue.isEmpty());
    }
}
