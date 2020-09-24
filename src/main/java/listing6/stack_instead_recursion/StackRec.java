package listing6.stack_instead_recursion;

public class StackRec {
    private int nElements;
    private Params[] stackR;
    int top = 0;
    int nElm = 0;

    public StackRec(int nElements) {
        this.nElements = nElements;
        stackR = new Params[nElements];
    }
    public void push(Params params) {
        stackR[++top] = params;
    }
    public Params peek() {
        return stackR[top];
    }
    public Params pop() {
        if (top == -1)  {
            System.out.println("Stack empty");
            return null;
        }
        return stackR[top--];
    }
}
