package queue45;

public class Queue1
{
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;
    //--------------------------------------------------------------
    public Queue1(int s)          // constructor
    {
        maxSize = s;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    //--------------------------------------------------------------
    public void insert(long j)   // put item at rear of queue
    {
        if(rear == maxSize-1)         // deal with wraparound
            rear = -1;
        queArray[++rear] = j;         // increment rear and insert
        nItems++;                     // one more item
    }
    //--------------------------------------------------------------
    public long remove()         // take item from front of queue
    {
        long temp = queArray[front++]; // get value and incr front
        if(front == maxSize)           // deal with wraparound
            front = 0;
        nItems--;                      // one less item
        return temp;
    }
    //--------------------------------------------------------------
    public long peekFront()      // peek at front of queue
    {
        return queArray[front];
    }
    //--------------------------------------------------------------
    public boolean isEmpty()    // true if queue is empty
    {
        return (nItems==0);
    }
    //--------------------------------------------------------------
    public boolean isFull()     // true if queue is full
    {
        return (nItems==maxSize);
    }
    //--------------------------------------------------------------
    public int size()           // number of items in queue
    {
        return nItems;
    }
    public long getElmFromPos(int pos) {
        return queArray[pos];
    }

    public long[] displayQueue() {
        long[] dispArr = new long[nItems];
        int elmArr = 0;
        if (front < rear) {
            for (int i = front; i < rear + 1; i++) {
                dispArr[elmArr++] = queArray[i];
            }
        } else if (rear < front) {
            for (int i = front; i < maxSize; i++) {
                dispArr[elmArr++] = queArray[i];
            }
            for (int i = 0; i < rear; i++) {
                dispArr[elmArr++] = queArray[i];
            }
        } else {
            dispArr[elmArr] = queArray[rear];
        }
        return dispArr;
    }

//--------------------------------------------------------------
}  // end class Queue
////////////////////////////////////////////////////////////////

