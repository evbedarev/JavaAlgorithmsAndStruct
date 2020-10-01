package listing6;

import listing6.triangle_nums.TriAngle;
import org.junit.Test;

public class TestTriAngle {
    @Test
    public void testTriAngle() {
        long beginTime = System.currentTimeMillis();
        TriAngle triAngle = new TriAngle();
        System.out.println(triAngle.calculate(10));
        long endTime = System.currentTimeMillis();
        System.out.println("It took time = " + (endTime - beginTime) + " ms");
    }
    @Test
    public void testFactorial() {
        TriAngle triAngle = new TriAngle();
        System.out.println(triAngle.calculateFactorial(9));

    }
}
