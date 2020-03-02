package queue45;

public class OrchestratorQueue {
    private ThreadQueue[] arrQueue;
    private int numQueues;

    public OrchestratorQueue(int maxSize, int numQueues) {
        arrQueue = new ThreadQueue[numQueues];
        this.numQueues = numQueues;
        for (int i=0;i<numQueues; i++) {
            arrQueue[i] = new ThreadQueue(maxSize);
            arrQueue[i].start();
        }
    }

    public void addElementToQueue(int elm) {
        int mostFreeQueue = findFreeQueue();
        arrQueue[mostFreeQueue].insert((long) elm);
    }

    public int findFreeQueue() {
        int nItems = 0,numQueue = 0;
        for (int i=0; i < numQueues;i++) {
            if (i==0) {
                nItems = arrQueue[i].size();
            }
            if (nItems > arrQueue[i].size()) {
                nItems = arrQueue[i].size();
                numQueue = i;
            }
        }
        return numQueue;
    }

    public void showQueueStatus() {
       StringBuilder sb = new StringBuilder();
       int maxSize[] = findMaxSizeQueue();
       printHeader();
       for (int j = 0; j < maxSize[0]; j++) {
           sb.delete(0,sb.length());
           for (int i=0; i < numQueues;i++) {
               if (arrQueue[i].size() > j) {
                   sb.append(arrQueue[i].displayQueue()[j]).append(" ");
               }
           }
           System.out.println(sb);
       }
    }

    public void showQueueFrontElm() {
        StringBuilder sb = new StringBuilder();
        int maxSize[] = findMaxSizeQueue();
        printHeader();
        sb.delete(0,sb.length());
        for (int i=0; i < numQueues;i++) {
                sb.append(arrQueue[i].peekFront()).append(" ");
        }
        System.out.println(sb);
    }

    public void printHeader() {
        StringBuilder sb = new StringBuilder();
        int maxSize[] = findMaxSizeQueue();
        System.out.println("========================");
        for (int i=0; i<numQueues; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        System.out.println("========================");
    }

    public int[] findMaxSizeQueue() {
        int maxSize[] = new int[2];
        for (int i=0; i<numQueues; i++) {
            if (i==0) {
               maxSize[0] = arrQueue[i].size();
               maxSize[1] = i;
            }
            if (maxSize[0] < arrQueue[i].size()) {
                maxSize[0] = arrQueue[i].size();
                maxSize[1] = i;
            }
        }
        return maxSize;
    }
}
