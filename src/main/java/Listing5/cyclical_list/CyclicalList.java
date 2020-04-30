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
    public double find(double dData) {
        Link tmp = current;
        while (current.getNext() != tmp) {
            current = current.getNext();
            if (current.getdData() == dData) {
                return dData;
            }
        }
        return Double.parseDouble(null);
    }

    public void printList() {
        Link tmp = current;
        while (current.getNext() != tmp) {
            System.out.println(current.toString());
            current = current.getNext();
        }
    }
}
