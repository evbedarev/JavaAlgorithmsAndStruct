package listing6.exponentiation;

public class StackExp {
    int nElm;
    int top = -1;
    private ElmExponetiation[] theArray;

    public StackExp(int nElm) {
        this.nElm = nElm;
        theArray = new ElmExponetiation[nElm];
    }

    public void push(ElmExponetiation element) {
        theArray[++top] = element;
    }

    public ElmExponetiation peek() {
        return theArray[top];
    }

    public ElmExponetiation pop() {
        if (top == -1) {
            System.out.println("Steack is empty");
            return null;
        }
        return theArray[top--];
    }
}
