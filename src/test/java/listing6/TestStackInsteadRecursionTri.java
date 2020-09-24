package listing6;

import listing6.stack_instead_recursion.TriAngleStack;
import org.junit.Test;

public class TestStackInsteadRecursionTri {
    @Test
    public void test() {
        TriAngleStack triAngleStack = new TriAngleStack();
        System.out.println(triAngleStack.triAngleCalc(100));
    }
}
