package Listing6.triangle_nums;

public class TriAngle {
    public int calculate(int triNum) {
        if (triNum == 1) {
            return triNum;
        }
        return triNum + calculate(--triNum);
    }
}
