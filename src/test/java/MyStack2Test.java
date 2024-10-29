import com.barry.structure.MyStack2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStack2Test {

    private MyStack2 stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack2();
    }

    @Test
    public void testPushAndPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.peek());
        assertEquals(2, stack.peek());  // Peek should not remove the element
        assertEquals(2, stack.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testSize() {
        assertEquals(0, stack.size());
        stack.push(1);
        assertEquals(1, stack.size());
        stack.push(2);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.pop());
    }

    @Test
    public void testPeekEmptyStack() {
        assertThrows(RuntimeException.class, () -> stack.peek());
    }
}

