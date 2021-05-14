package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    public void given3NumbersWhenLinkedShouldPassedListTest(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
         myFirstNode.setNext(mySecondNode);
         mySecondNode.setNext(myThirdNode);
         boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                          mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);
    }

}
