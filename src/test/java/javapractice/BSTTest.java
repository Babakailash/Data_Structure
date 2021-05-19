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

    @Test
    public void given13NumbersWhenAddedToABinarySearchTreeShouldReturn13() {
        BST<Integer> myBinaryTree = new BST<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        Integer size = myBinaryTree.getSize();
        myBinaryTree.printMyBinaryNode();
        Assertions.assertEquals(13, size);
    }
}
