import org.junit.Test;
import queue45.Queue1;

public class TestQueue {
    @Test
    public void TestQueue() {
        Queue1 queue1 = new Queue1(6);
        queue1.insert(20);
        queue1.insert(10);
        queue1.insert(30);
        System.out.println(queue1.peekFront());
    }
}
