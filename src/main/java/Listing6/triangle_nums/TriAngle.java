package Listing6.triangle_nums;

public class TriAngle {
    int triNumMax;
    int counter = 1;

    public TriAngle(int triNumMax) {
        this.triNumMax = triNumMax;
    }
    public int calculate(int triNum) {
        if (triNum == triNumMax) {
            return triNum;
        }
        triNum = calculate(triNum + counter++);
    }
}
