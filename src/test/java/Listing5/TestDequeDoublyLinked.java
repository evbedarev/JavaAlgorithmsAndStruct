package Listing5;

import Listing5.DequeDoublyLinked.DoublyLinked;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TestDequeDoublyLinked {
    DoublyLinked doublyLinked;
    @Before
    public void genDoublyLinked() {
        doublyLinked = new DoublyLinked();
        doublyLinked.insertFirst(21);
        doublyLinked.insertFirst(33);
        doublyLinked.insertFirst(44);
        doublyLinked.insertFirst(55);
        doublyLinked.insertFirst(66);
    }

    @Test
    public void testDoublyLinkedListInsertAfter() {
        doublyLinked.insertAfter(22, 22);
        Assert.assertTrue(doublyLinked.deleteLast().getdData() == 22); //last
        doublyLinked.insertAfter(77, 77);
        Assert.assertTrue(doublyLinked.deleteFirst().getdData() == 77); //first
        doublyLinked.insertAfter(56, 56);
        Assert.assertTrue(doublyLinked.deleteFirst().getdData() == 66);
        Assert.assertTrue(doublyLinked.deleteFirst().getdData() == 55);
        Assert.assertTrue(doublyLinked.deleteFirst().getdData() == 56); //middle
        doublyLinked.display();
    } //44,33,21


    @Test
    public void testDoublyLinkedListDeleteKey() {
        Assert.assertTrue(doublyLinked.deleteKey(33).getdData() == 33);
        Assert.assertTrue(doublyLinked.deleteKey(44).getdData() == 44);
        Assert.assertTrue(doublyLinked.deleteKey(21).getdData() == 21);
        doublyLinked.display();
//   current     Assert.assertTrue(doublyLinked.isEmpty());
    }
}
