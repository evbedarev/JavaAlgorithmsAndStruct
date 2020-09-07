package listing6.triangle_nums;

public class TriAngle {
    public int calculate(int triNum) {
        if (triNum == 1) {
            return triNum;
        }
        return triNum + calculate(--triNum);
    }
    public int calculateFactorial(int factNum) {
        if (factNum == 1) {
            return factNum;
        }
        return factNum*calculateFactorial(--factNum);
    }
}
