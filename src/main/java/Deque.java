public class Deque {
    private int nItems;
    private int maxSize;
    private long[] arrayQueue;
    private int front;
    private int rear;

    public Deque(int size) {
        maxSize = size;
        arrayQueue = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insertLeft(long item) {
        if (rear == maxSize-1)         // deal with wraparound
            rear = -1;
        if ((rear + 1 == maxSize - 1) && (front == maxSize - 1)) {
            front = 0;
            nItems--;
        }
        if ((rear + 1 == front) && (nItems != 0)) {
            front++;
            nItems--;
        }
        arrayQueue[++rear] = item;         // increment rear and insert
        nItems++;                 // one more item
    }
    public void insertRight(long item) {
        if  (front == 0) {
            front = maxSize;
        }
        if ((front-1 == 0) && (rear == 0)) {
            rear = maxSize - 1;
            nItems--;
        }
        if (front-1 == rear) {
            rear--;
            nItems--;
        }
        arrayQueue[--front] = item;
        nItems++;
    }
    public void removeLeft() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return;
        }
        nItems--;
        arrayQueue[rear] = 0;
        if ((rear == 0) && (front == maxSize - 1)) {
            rear = maxSize - 1;
            front--;
            return;
        }
        if (rear == 0) {
            rear = maxSize - 1;
            return;
        }
        rear--;
    }
    public void removeRight() {
        if (nItems == 0) {
            System.out.println("Queue is empty");
            return;
        }
        if ((front == maxSize - 1) && (rear == 0) && (nItems == 2)) {
            front = 0;
        }
        nItems--;
        arrayQueue[front] = 0;
        if ((front == maxSize - 1) && (rear == maxSize - 1)) {
            rear = 0;
            front++;
        }
    }
    public void printPos() {
        System.out.println("rear is: " + rear + ",front is: " + front);
    }
    public void linePrintQueue() {
        for (int i = 0; i < arrayQueue.length; i++) {
            System.out.printf("element " + i + ": " + arrayQueue[i] + "|");
        }
        System.out.println();
    }
    public boolean isFull() {
        System.out.println("MaxSize is : " + maxSize);
        System.out.println("number items in arrays is: " + nItems);
        return nItems == maxSize;
    }
    public int getFront() {
        return front;
    }
    public int getRear() {
        return rear;
    }
}


