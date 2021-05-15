package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given3NumbersWhenDeletingLastAmongThemShouldPassLinkedListResult(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyNode<Integer> myFourthNode = new MyNode<Integer>(88);
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.add(myFirstNode);
         myLinkedList.append(myThirdNode);
         myLinkedList.insert(myFirstNode,mySecondNode);
         //myLinkedList.pop(myFirstNode);
        // myLinkedList.popLast(myThirdNode);
         myLinkedList.search(mySecondNode);
         myLinkedList.printMyNode();
         boolean result = myLinkedList.search(mySecondNode);
         Assertions.assertTrue(result);
    }

}
