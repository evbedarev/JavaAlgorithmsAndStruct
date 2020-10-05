package listing6;

import listing6.exponentiation.back_pack.BackPackTask;
import listing6.exponentiation.back_pack.BackPackWithStack;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class TestBackPack {
    int[] array = new int[1000];
    Random random = new Random();

    @Before
    public void beforeTask() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(300);
        }

    }
    @Test
    public void testBackPack() {
        long begin = System.currentTimeMillis();
//        BackPackTask backPackTask = new BackPackTask(20, new int[] {27,3,5, 7,10,5,2});
        BackPackWithStack backPackWithStack = new BackPackWithStack(array, 20000);
        backPackWithStack.calculate();
//        System.out.println(backPackTask.calculate());
        long end = System.currentTimeMillis();
        System.out.println("exp time is: " + (end - begin));
    }
    @Test
    public void testStackBP() {

        long begin = System.currentTimeMillis();
//        BackPackWithStack backPackWithStack = new BackPackWithStack(new int[] {27,3,5, 7,10,5,2}, 20);
        BackPackWithStack backPackWithStack = new BackPackWithStack(array, 20000);
        backPackWithStack.calculate();
        long end = System.currentTimeMillis();
        System.out.println("stack time is: " + (end - begin));
    }
}
