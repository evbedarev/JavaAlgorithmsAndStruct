package Listing5.DequeDoublyLinked;

public class Link {
    private int iPrior;
    private double dData;
    private Link next;
    private Link previous;

    public Link(int iPrior, double dData) {
        this.iPrior = iPrior;
        this.dData = dData;
    }

    public int getiPrior() {
        return iPrior;
    }

    public void setiPrior(int iPrior) {
        this.iPrior = iPrior;
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
        System.out.println( "{" + iPrior + ", " + dData + "} " );
    }
}

