package listing6;

import listing6.exponentiation.back_pack.BackPackTask;
import org.junit.Test;

public class TestBackPack {
    @Test
    public void testBackPack() {
        BackPackTask backPackTask = new BackPackTask(20, new int[] {27,3,5, 7,10,5,2});
        System.out.println(backPackTask.calculate());
    }
}
