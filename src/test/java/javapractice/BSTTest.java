package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BSTTest {
    @Test
    public void given3NumbersWhenAddedToABinarySearchTreeShouldReturn3() {
        BST<Integer> myBinaryTree = new BST<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        Integer size = myBinaryTree.getSize();
        myBinaryTree.printMyBinaryNode();
        Assertions.assertEquals(3, size);
    }
}
