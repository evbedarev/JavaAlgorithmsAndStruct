package Listing5;

import Listing5.DequeDoublyLinked.DoublyLinked;
import org.junit.Test;

public class TestDequeDoublyLinked {
    @Test
    public void testDoublyLinkedList() {
        DoublyLinked doublyLinked = new DoublyLinked();
        doublyLinked.insertFirst(21);
        doublyLinked.insertFirst(33);
        doublyLinked.insertFirst(44);
        doublyLinked.insertFirst(55);
        doublyLinked.insertFirst(66);
        doublyLinked.insertAfter(22, 49);
        doublyLinked.display();
    }
}
