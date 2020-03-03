package Listing5.DequeDoublyLinked;

public class Link {
    private double dData;
    private Link next;
    private Link previous;

    public Link(double dData) {
        this.dData = dData;
    }

    public double getdData() {
        return dData;
    }

    public void setdData(double dData) {
        this.dData = dData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public void setPrevious(Link previous) {
        this.previous = previous;
    }

    public void displayLink() {
        System.out.println( "{" + dData + "} " );
    }
}

