package Listing5;

import Listing5.PriorityQueueList.PriorityQueueList;
import Listing5.PriorityQueueList.SortedLinkedList;
import org.junit.Test;
import org.junit.Assert;
public class TestSortedLinkedList {

    @Test
    public void TestLinkedList() {
       SortedLinkedList sortedLinkedList = new SortedLinkedList();
       sortedLinkedList.insertFirst(55, 25);
       sortedLinkedList.insertFirst(2, 25);
       sortedLinkedList.insertFirst(89, 25);
       sortedLinkedList.insertFirst(4, 25);
       sortedLinkedList.insertFirst(5, 25);
       sortedLinkedList.displayList();
    }

    @Test
    public void testPriorityTestList() {
        PriorityQueueList priorityQueueList = new PriorityQueueList();
        priorityQueueList.insert(2,552);
        priorityQueueList.insert(22,553);
        priorityQueueList.insert(11,554);
        priorityQueueList.insert(4,555);
        priorityQueueList.insert(9,556);
        priorityQueueList.insert(1,557);
        priorityQueueList.insert(99,558);
        Assert.assertTrue(priorityQueueList.peekMin().getiPrior() == 1);
        priorityQueueList.insert(123, 123);
        priorityQueueList.displayQueue();
        Assert.assertTrue(priorityQueueList.peekMin().getiPrior() == 2);
    }

    @Test
    public void testPriQueueListDeletingAllElments() {
        PriorityQueueList priorityQueueList = new PriorityQueueList();
        priorityQueueList.insert(2,552);
        priorityQueueList.insert(22,553);
        priorityQueueList.peekMin();
        priorityQueueList.peekMin();
        priorityQueueList.insert(3,333);
        priorityQueueList.insert(33,333);
        priorityQueueList.displayQueue();
    }
}
