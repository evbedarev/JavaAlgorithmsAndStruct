package listing6.stack_instead_recursion;

public class TriAngleStack {
    private int num;
    private int codePart;
    private int theAnswer;
    private Params theseParam;
    private StackRec stackRec;
    public int triAngleCalc(int num) {
        stackRec = new StackRec(1000);
        this.num = num;
        codePart = 1;
        while (getValue() == false) {
            ;
        }
        return theAnswer;
    }
    public boolean  getValue() {
        switch (codePart) {
            case 1:
                theseParam = new Params(num, 6);
                stackRec.push(theseParam);
                codePart = 2;
                break;
            case 2:
                theseParam = stackRec.peek();
                if (theseParam.n == 1) {
                    theAnswer = 1;
                    codePart = 5;
                } else {
                    codePart = 3;
                }
                break;
            case 3:
                Params newParam = new Params(theseParam.n - 1 , 4);
                stackRec.push(newParam);
                codePart = 2;
                break;
            case 4:
                theseParam = stackRec.peek();
                theAnswer = theAnswer + theseParam.n;
                codePart = 5;
                break;
            case 5:
                theseParam = stackRec.peek();
                codePart = theseParam.returnAddress;
                stackRec.pop();
                break;
            case 6:
                return true;
        }
        return false;
    }
}
