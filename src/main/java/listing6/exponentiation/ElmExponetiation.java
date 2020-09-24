package listing6.exponentiation;

public class ElmExponetiation {
    private long x;
    private long y;
    private int returnAddress;

    public ElmExponetiation(long x, long y, int returnAddress) {
        this.x = x;
        this.y = y;
        this.returnAddress = returnAddress;
    }
    public void setReturnAddress(int returnAddress) {
        this.returnAddress = returnAddress;
    }

    public int getReturnAddress() {
        return returnAddress;
    }
    public void setX(long x) {
        this.x = x;
    }

    public void setY(long y) {
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

}
