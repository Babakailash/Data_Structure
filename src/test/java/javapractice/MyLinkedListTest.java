package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedShouldAddedToTop(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(70);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(56);
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.add(myFirstNode);
         myLinkedList.add(mySecondNode);
         myLinkedList.add(myThirdNode);
         myLinkedList.printMyNode();
         boolean result = myLinkedList.head.equals(myThirdNode) &&
                          myLinkedList.head.getNext().equals(mySecondNode) &&
                          myLinkedList.tail.equals(myFirstNode);
         Assertions.assertTrue(result);
    }

}
