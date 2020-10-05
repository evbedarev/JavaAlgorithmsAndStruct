package listing6.exponentiation.back_pack;

public class Item {

    private int sum;
    private int pos;
    private int address;

    public Item(int sum, int pos, int address) {
        this.sum = sum;
        this.pos = pos;
        this.address = address;
    }

    public int getSum() {
        return sum;
    }

    public int getPos() {
        return pos;
    }

    public int getAddress() {
        return address;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
