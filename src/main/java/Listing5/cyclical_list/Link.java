package Listing5.cyclical_list;

public class Link {
    private double dData;
    private Link next;

    public double getdData() {
        return dData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public Link(double dData) {
        this.dData = dData;
    }
    @Override
    public String toString() {
       return "Link dData=" + dData + " next Link dData=" + getNext().dData;
    }
}
