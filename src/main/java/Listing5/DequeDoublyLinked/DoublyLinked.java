package Listing5.DequeDoublyLinked;

public class DoublyLinked {
    private Link first;
    private Link last;

    public DoublyLinked() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        Link temLink = new Link(dd);
        if (isEmpty()) {
            last = temLink;
        } else {
            first.setPrevious(temLink);
            temLink.setNext(first);
        }
        first = temLink;
    }

}
