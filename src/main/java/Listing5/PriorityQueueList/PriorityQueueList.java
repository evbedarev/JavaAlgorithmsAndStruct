package Listing5.PriorityQueueList;

public class PriorityQueueList {
    private final SortedLinkedList linkedList = new SortedLinkedList();

    public PriorityQueueList() {
    }

    public void insert(int iElm, double dElm) {
       linkedList.insertFirst(iElm, dElm);
    }

    public Link peekMin() {
        return linkedList.deleteFirst();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    public void displayQueue() {
        linkedList.displayList();
    }

}
