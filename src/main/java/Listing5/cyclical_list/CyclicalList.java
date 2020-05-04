package Listing5.cyclical_list;

public class CyclicalList {
    private Link current;

    public void insert(double dData) {
        Link tmpLink = new Link(dData);
        if (current != null && current.getNext() == null){
            current.setNext(tmpLink);
            tmpLink.setNext(current);
        } else if (current != null) {
            tmpLink.setNext(current.getNext());
            current.setNext(tmpLink);
        }
        current = tmpLink;
    }

    public void step() {
        current = current.getNext();
    }

    public double getCurrent() {
       return current.getdData();
    }

    /*Cursor stand before sought element */
    public boolean find(double dData) {
        Link tmp = current;
        while (current.getNext() != tmp) {
            current = current.getNext();
            if (current.getNext().getdData() == dData) {
                return true;
            }
        }
        return false;
    }

    public double remove() {
        Link tmp = current;
        while (current.getNext() != tmp ) {
            current = current.getNext();
        }
        tmp = current.getNext().getNext();
        double result = current.getNext().getdData();
        current.setNext(tmp);
        return result;
    }

    public void printList() {
        Link tmp = current;
        while (current.getNext() != tmp) {
            System.out.println(current.toString());
            current = current.getNext();
        }
        System.out.println(current.toString());
    }
}
