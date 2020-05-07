package task_5_5;

import Listing5.task_5_5.FlaviyTask;
import org.junit.Test;

public class TestFlaviy {
    @Test
    public void testFl(){
        FlaviyTask flaviyTask = new FlaviyTask(1,7,3);
        flaviyTask.calculate();
    }

    @Test
    public void testFl2() {
        FlaviyTask flaviyTask = new FlaviyTask(1,15,4);
        flaviyTask.calculate();

    }
}
