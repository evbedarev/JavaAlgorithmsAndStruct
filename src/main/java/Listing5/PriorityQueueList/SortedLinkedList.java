package Listing5.PriorityQueueList;

public class SortedLinkedList {
    private Link first;
    public SortedLinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iElm, double dElm) {
        if (first == null) {
            first = new Link(iElm, dElm);
            first.setNext(null);
        } else {
            Link tmpLink = first;
            first = new Link(iElm, dElm);
            first.setNext(tmpLink);
            sort();
        }
    }

    public void sort() {
        Link current = first;
        Link tmpLink = first;
        while (current.getNext() != null) {
            if (tmpLink.getiPrior() > current.getNext().getiPrior()) {
                current = current.getNext();
            } else {
              break;
            }
        }
        if ( current != first) {
            first = tmpLink.getNext();
            tmpLink.setNext(current.getNext());
            current.setNext(tmpLink);
        }
    }

    public Link deleteFirst() {
        Link tmpLink = first;
        first = first.getNext();
        return tmpLink;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
    }
}
