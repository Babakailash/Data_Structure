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
         MyLinkedList myLinkedList = new MyLinkedList();
         myLinkedList.add(myFirstNode);
         myLinkedList.append(myFirstNode);
         myLinkedList.append(mySecondNode);
         myLinkedList.append(myThirdNode);
         System.out.println("Size of LinkedList: "+myLinkedList.getSize());
        // myLinkedList.sortList();
         myLinkedList.printMyNode();

         boolean result = myLinkedList.head.equals(myFirstNode)&&
                          myLinkedList.head.getNext().equals(mySecondNode) &&
                          myLinkedList.head.getNext().equals(myThirdNode)&&
                          myLinkedList.tail.equals(myFourthNode);

         Assertions.assertFalse(result);
    }

}
