package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenAddedToLinkedShouldAddedToLast(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.add(myFirstNode);
         myLinkedList.append(mySecondNode);
         myLinkedList.append(myThirdNode);
         myLinkedList.printMyNode();
         boolean result = myLinkedList.head.equals(myFirstNode) &&
                          myLinkedList.head.getNext().equals(mySecondNode) &&
                          myLinkedList.tail.equals(myThirdNode);
         Assertions.assertTrue(result);
    }

}
