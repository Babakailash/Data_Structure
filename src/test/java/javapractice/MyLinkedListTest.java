package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {
    @Test
    public void given4NumbersWhenSortedAscendingOrderPassLinkedListResult(){
         MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
         MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
         MyNode<Integer> myThirdNode = new MyNode<Integer>(40);
         MyNode<Integer> myFourthNode = new MyNode<Integer>(70);
         MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
         myLinkedList.sortedLinkedList(myFirstNode);
         myLinkedList.sortedLinkedList(mySecondNode);
         myLinkedList.sortedLinkedList(myThirdNode);
         myLinkedList.sortedLinkedList(myFourthNode);
         System.out.println("Size of LinkedList: "+myLinkedList.getSize());
       //  myLinkedList.sortedLinkedList();
         myLinkedList.printMyNode();

         boolean result = myLinkedList.head.getNext().equals(myThirdNode) &&
                          myLinkedList.tail.equals(myFourthNode);

         Assertions.assertEquals(result,true);
    }

}
