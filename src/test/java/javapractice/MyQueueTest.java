package javapractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersInQueueShouldHaveWithFirstAddedNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueu(myFirstNode);
        myQueue.enqueu(mySecondNode);
        myQueue.enqueu(myThirdNode);
        myQueue.printQueue();

        boolean result = myFirstNode.getNext().equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void abilityToUseDequeueOperationPerform() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode =new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueu(myFirstNode);
        myQueue.enqueu(mySecondNode);
        myQueue.enqueu(myThirdNode);

        INode dequeu = myQueue.dequeu();
        myQueue.printQueue();
        Assertions.assertEquals(myFirstNode,dequeu);
    }

}
