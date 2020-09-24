package listing6;

import listing6.exponentiation.Exponentiation;
import listing6.exponentiation.ExponentiationStack;
import org.junit.Test;

public class TestExponentiation {
    @Test
    public void testExp() {
        Exponentiation exponentiation = new Exponentiation();
        long begin = System.currentTimeMillis();
        System.out.println(exponentiation.calc(2,44));
        long end = System.currentTimeMillis();
        System.out.println("Time= " + (end - begin));
    }

    @Test
    public void  testExpStack() {
        ExponentiationStack exponentiationStack = new ExponentiationStack(2,9);
        System.out.println(exponentiationStack.calculate());
    }

    @Test
    public void testModInt() {
        int i = 9;
        while (i != 1) {
            System.out.println(i%2);
            System.out.println(i);
            i = i/2;
        }
    }
}
