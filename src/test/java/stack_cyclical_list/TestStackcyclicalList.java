package stack_cyclical_list;

import Listing5.stack_cyclical_list.StackOnCyclicalList;
import org.junit.Assert;
import org.junit.Test;

public class TestStackcyclicalList {
    @Test
    public void test() {
        StackOnCyclicalList stack = new StackOnCyclicalList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Assert.assertTrue(stack.pop() == 6);
        Assert.assertTrue(stack.pop() == 5);
        stack.push(7);
        stack.push(8);
        Assert.assertTrue(stack.peek() == 8);
    }
}
