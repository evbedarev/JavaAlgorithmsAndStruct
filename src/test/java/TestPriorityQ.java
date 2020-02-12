import org.junit.Test;
import org.junit.Assert;

public class TestPriorityQ {
    @Test
    public void testPriQ() {
        PriorityQ priorityQ = new PriorityQ(5);
        priorityQ.insert(20);
        priorityQ.insert(50);
        priorityQ.insert(49);
        priorityQ.insert(22);
        priorityQ.insert(11);
        priorityQ.printArray();
        System.out.println("minimum priority " + priorityQ.peekMin());
    }
}
