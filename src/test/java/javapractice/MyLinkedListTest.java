package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenInsertingAfterPassLinkedListResult(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
         MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.append(myFirstNode);
         myLinkedList.append(mySecondNode);
         myLinkedList.append(myFourthNode);
         myLinkedList.insertAfter(mySecondNode,myThirdNode);

         myLinkedList.printMyNode();
         boolean result = myLinkedList.head.equals(myFirstNode) &&
                          myLinkedList.tail.equals(myFourthNode);
         Assertions.assertTrue(result);
    }

}
