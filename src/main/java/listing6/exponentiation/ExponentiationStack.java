package listing6.exponentiation;

public class ExponentiationStack {
    long theAnswer;
    int baseCode = 1;
    int x, y;
    ElmExponetiation thisElement;
    StackExp stackExp = new StackExp(1000);

    public ExponentiationStack(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long calculate() {
        while (step() == false) {
        }
        return theAnswer;
    }
    public boolean step() {
        switch (baseCode) {
            case 1:
                thisElement = new ElmExponetiation(x,y, 6);
                baseCode = 2;
                break;
            case 2:
                if (thisElement.getY() == 1) {
                    theAnswer = thisElement.getX();
                    return true;
                } else {
                    baseCode = 3;
                    break;
                }
            case 3:
                x = x * x; y = y/2;
                System.out.println(y % 2);
                System.out.println(y);
                if (y % 2 !=0 && y != 1)
                    x = x * x;
                thisElement = new ElmExponetiation(x, y, 4);
                baseCode = 2;
                break;

        }
        return false;
    }
}
