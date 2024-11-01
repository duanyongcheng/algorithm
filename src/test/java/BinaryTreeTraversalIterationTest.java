import com.barry.structure.TreeNode;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.barry.code.BinaryTreeTraversalIteration.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTraversalIterationTest {

    @Test
    public void testPreOrder() {
        // Create a simple binary tree
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Perform pre-order traversal
        preOrder(root);

        // Get the captured output and trim any trailing whitespace
        String printedOutput = outContent.toString().trim();

        // Define the expected output
        String expectedOutput = "1 2 4 5 3";

        // Assert that the printed output matches the expected output
        assertEquals(expectedOutput, printedOutput);
    }

    @Test
    void testInOrder() {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the inOrder method
        inOrder(root);

        // Restore normal System.out
        System.setOut(System.out);

        // Check if the output matches the expected in-order traversal
        assertEquals("4 2 5 1 6 3 7 ", outContent.toString());
    }

    @Test
    public void testPostOrder() {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.getRight().setLeft(new TreeNode(6));
        root.getRight().setRight(new TreeNode(7));

        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Perform post-order traversal
        postOrder(root);

        // Restore normal System.out
        System.setOut(System.out);

        // Get the captured output and trim any trailing whitespace
        String printedOutput = outContent.toString().trim();

        // Define the expected output
        String expectedOutput = "4 5 2 6 7 3 1";

        // Assert that the printed output matches the expected output
        assertEquals(expectedOutput, printedOutput);
    }

}
