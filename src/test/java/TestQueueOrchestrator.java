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
        OrchestratorQueue orchestratorQueue = new OrchestratorQueue(20, 3);
        orchestratorQueue.addElementToQueue(20);
        orchestratorQueue.addElementToQueue(10);
        orchestratorQueue.addElementToQueue(5);
        orchestratorQueue.addElementToQueue(50);
        orchestratorQueue.addElementToQueue(60);
        orchestratorQueue.addElementToQueue(52);
        orchestratorQueue.addElementToQueue(70);
        orchestratorQueue.addElementToQueue(82);
        while (true) {
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
