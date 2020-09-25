package listing6.exponentiation;

public class ExponentiationStack {
    long theAnswer;
    int baseCode = 1;
    int x, y;
    int factor = 1;
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
                baseCode = 2;
                break;
            case 2:
                if (y == 1) {
                    theAnswer = x * factor;
                    return true;
                } else {
                    baseCode = 3;
                    break;
                }
            case 3:
                if (y % 2 != 0 && y != 1) {
                    factor = factor * x;
                }
                x = x * x; y = y/2;
                baseCode = 2;
                break;

        }
        return false;
    }
}
