public class StackX extends Deque {

    public StackX(int size) {
        super(size);
    }

    public void push(long j) {
        insertLeft(j);
    }

    public long pop() {
       long item = getItem(getRear());
       removeLeft();
       return item;
    }
    public long peek() {
        return getItem(getRear());
    }
}
