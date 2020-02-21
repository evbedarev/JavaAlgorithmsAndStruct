package queue45;

public class ThreadQueue extends Thread {
    private Queue1 queue1;

    public ThreadQueue(int sizeQueue) {
       queue1 = new Queue1(sizeQueue);
    }

    @Override
    public void run() {
        while (true) {
            if (queue1.size() != 0) {
                for (int i = 0; i < queue1.peekFront(); i++) {
                    sleepThread(100);
                }
                queue1.remove();
            } else {
                sleepThread(400);
            }
        }
    }
    public void sleepThread(int timeToSleep) {
        try {
            Thread.sleep(timeToSleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void insert(long elm) {
        queue1.insert(elm);
    }

    public int size() {
        return queue1.size();
    }

    public long getElmFromPos(int pos) {
        return queue1.getElmFromPos(pos);
    }
    public long peekFront() {
        return queue1.peekFront();
    }
    public long[] displayQueue() {
        return queue1.displayQueue();
    }
}


