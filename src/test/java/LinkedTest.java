import com.barry.link.DoublyLinkedList;
import com.barry.link.SingleLinkedList;
import com.barry.model.DoubleNode;
import com.barry.model.Node;
import org.junit.jupiter.api.Test;

public class LinkedTest {

    @Test
    public void testSingle() {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(new Node<>(1));
        singleLinkedList.add(new Node<>(2));
        singleLinkedList.add(new Node<>(3));
        singleLinkedList.add(new Node<>(4));
        singleLinkedList.add(new Node<>(5));
        singleLinkedList.print();
        singleLinkedList.reverse();
        singleLinkedList.print();
    }

    @Test
    public void testDouble(){
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();
        doublyLinkedList.add(new DoubleNode<>(1));
        doublyLinkedList.add(new DoubleNode<>(2));
        doublyLinkedList.add(new DoubleNode<>(3));
        doublyLinkedList.add(new DoubleNode<>(4));
        doublyLinkedList.add(new DoubleNode<>(5));
        doublyLinkedList.print();
        doublyLinkedList.reverse();
        doublyLinkedList.print();
    }
}
