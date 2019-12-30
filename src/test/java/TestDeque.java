import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;

public class TestDeque {
    @Test
    public void testInsertLR() {
        Deque nDeque = new Deque(5);
        nDeque.insertLeft(10);
        nDeque.insertLeft(20);
        nDeque.insertRight(30);
        nDeque.insertRight(40);
        nDeque.insertLeft(50);
        nDeque.insertLeft(60);
        Assert.assertTrue(nDeque.getFront() == 4);
        Assert.assertTrue(nDeque.getRear() == 3);
        Assert.assertTrue(nDeque.isFull());
        nDeque.insertLeft(70);
        Assert.assertTrue(nDeque.getFront() == 0);
        Assert.assertTrue(nDeque.getRear() == 4);
        nDeque.insertRight(80);
        Assert.assertTrue(nDeque.getFront() == 4);
        Assert.assertTrue(nDeque.getRear() == 3);

    }
    @Test
    public void testRemoveLeft() {
        System.out.println("test for removing");
        Deque nDeque = new Deque(5);
        nDeque.insertLeft(10);
        nDeque.insertRight(30);
        nDeque.insertRight(40);
        nDeque.removeLeft();
        nDeque.removeLeft();
        printDeQueueInf(nDeque);
        nDeque.removeLeft();
        printDeQueueInf(nDeque);
        nDeque.insertLeft(10);
        nDeque.insertLeft(20);
        printDeQueueInf(nDeque);
        nDeque.insertLeft(30);
        printDeQueueInf(nDeque);
    }
    public void printDeQueueInf(Deque deque) {
       deque.printPos();
       deque.linePrintQueue();
       deque.isFull();
    }
}
