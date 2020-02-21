import org.junit.Test;
import queue45.OrchestratorQueue;

import java.util.Random;

//Queues often used for modeling thread peoples, cars, airplans,
//banks operatios etc. Write program, modeling queue purchases at the checkout in the store
//on the basis class 'Queue' from program 'queue.java'.
//Programm must display content multiplay queues at once; use the method display().
//purchases service has a random duration(depending on the number of items in the cart)
//Served customers removed from queue.

public class TestQueueOrchestrator {
    @Test
    public void TestOrchestr() {
        Random random = new Random();
        OrchestratorQueue orchestratorQueue = new OrchestratorQueue(20, 5);
        for (int i = 0; i < 20; i++) {
            orchestratorQueue.addElementToQueue(random.nextInt(100));
        }
        orchestratorQueue.addElementToQueue(20);
        while (true) {
            //orchestratorQueue.showQueueFrontElm();
            orchestratorQueue.showQueueStatus();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            orchestratorQueue.addElementToQueue(random.nextInt(100));
        }
    }
}
