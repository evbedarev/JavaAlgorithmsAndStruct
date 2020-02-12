package queue45;

public class OrchestratorQueue {
    private Queue[] arrQueue;
    private int numQueues;
    public OrchestratorQueue(int maxSize, int numQueues) {
        arrQueue = new Queue[numQueues];
        this.numQueues = numQueues;
        for (int i=0;i<maxSize; i++) {
            arrQueue[i] = new Queue(maxSize);
        }
    }
    public int findFreeQueue() {
        int count = 0,nItems = 0,numQueue = 0;
        for (int i=0; i < numQueues;i++) {
            if (count ==0) {
                nItems = arrQueue[i].size();
            }
            if (nItems > arrQueue[i].size()) {
                nItems = arrQueue[i].size();
                numQueue = i;
            }
        }
        return numQueue;
    }
}
