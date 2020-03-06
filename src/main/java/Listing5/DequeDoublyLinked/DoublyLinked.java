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
        }
        temLink.setNext(first);
        first = temLink;
    }

    public void insertLast(long dd) {
        Link tempLink = new Link(dd);
        if (isEmpty()) {
            first = tempLink;
        } else {
            last.setNext(tempLink);
            tempLink.setPrevious(last);
        }
        last = tempLink;
    }

    public Link deleteFirst() {
       Link tempLink = first;
       if (first.getNext() == null) {
           last = null;
       } else {
           first.getNext().setPrevious(null);
       }
       first = first.getNext();
       return tempLink;
    }

    public Link deleteLast() {
        Link tempLink = last;
        if (first.getNext() == null) {
            first = null;
        } else
            last.getPrevious().setNext(null);
        last = last.getPrevious();
        return tempLink;
    }

    public void insertAfter(long dPos, long dd) {
        if (isEmpty()) {
            first = new Link(dd);
            last = first;
            return;
        }
        Link current = first;
        while (current.getNext() != null) {
            if (dPos > current.getdData()) {
               break;
            } else {
                current = current.getNext();
            }
        }
        Link tempLink = new Link(dd);
        if (current == first) {
            first = tempLink;
            tempLink.setNext(current);
            current.setPrevious(tempLink);
            return;
        } else if (current == last) {
            last = tempLink;
        } else {
            tempLink.setNext(current.getNext());
            current.getNext().setPrevious(tempLink);
        }
        current.setNext(tempLink);
        tempLink.setPrevious(current);
    }

    public Link deleteKey(long key) {
        Link current = first;
        while (current.getdData() != key) {
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }
        if (current == first) {
            first = current.getNext();
        } else {
            current.getPrevious().setNext(current.getNext());
        }
        if (current == last) {
            last = current.getPrevious();
        } else {
            current.getNext().setPrevious(current.getPrevious());
        }
        return current;
    }

    public void display() {
        Link current = first;
        while (current.getNext() != null) {
            if (current == first) {
                System.out.println("First : ");
                current.displayLink();
            } else
                current.displayLink();
            current = current.getNext();
        }
        System.out.println("<===Last :" );
        last.displayLink();
    }

    public void printFirst() {
        first.displayLink();
    }

}
