import org.junit.Test;
import org.junit.Assert;

public class TestStackX {
    @Test
    public void testS() {
        StackX stackX = new StackX(5);
        stackX.push(20);
        stackX.push(10);
        Assert.assertTrue(stackX.peek() == 10);
        Assert.assertTrue(stackX.pop() == 10);
        Assert.assertTrue(stackX.peek() == 20);
        Assert.assertTrue(stackX.pop() == 20);
        Assert.assertTrue(stackX.isEmpty());
    }
    @Test
    public void testSm() {
        StackX stackX = new StackX(5);
        stackX.push(20);
        stackX.push(10);
        stackX.push(30);
        Assert.assertTrue(stackX.pop() == 30);
        Assert.assertTrue(stackX.pop() == 10);
        Assert.assertTrue(stackX.pop() == 20);
        Assert.assertTrue(stackX.isEmpty());
    }
}
