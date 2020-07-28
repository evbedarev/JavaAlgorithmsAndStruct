package Listing6;

import Listing6.triangle_nums.TriAngle;
import org.junit.Test;

public class TestTriAngle {
    @Test
    public void testTriAngle() {
        long beginTime = System.currentTimeMillis();
        TriAngle triAngle = new TriAngle();
        System.out.println(triAngle.calculate(500));
        long endTime = System.currentTimeMillis();
        System.out.println("It took time = " + (endTime - beginTime) + " ms");
    }
}
