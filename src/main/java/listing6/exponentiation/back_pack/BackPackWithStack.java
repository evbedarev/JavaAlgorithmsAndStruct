package listing6.exponentiation.back_pack;

public class BackPackWithStack {
    int weight;
    private Item curItem;
    private int[] arrThings;
    private int address, stage, curPos;
    private StackBackPack stackBackPack;


    public BackPackWithStack(int[] arrThings, int weight) {
        this.arrThings = arrThings;
        this.weight = weight;
        stackBackPack = new StackBackPack(arrThings.length);
    }

    public void calculate() {
        stage = 1; curPos = 0; address = 0;
        stackBackPack.put(new Item(0,0,6));
        while (step() == false) {
            ;
        }
//        if (stackBackPack.peek() != null) {
//            while (stackBackPack.peek() != null) {
//                System.out.println(arrThings[stackBackPack.pop().getPos()]);
//            }
//        }

    }

    public boolean step() {
        switch (stage) {
            case 1:
                if (weight == arrThings[0]) {
                    return true;
                }
                stage = 2;
                break;
            case 2:
                curItem = stackBackPack.peek();
                if (curItem.getSum() > weight) {
                    curItem = stackBackPack.pop();
                    stackBackPack.peek().setPos(curItem.getPos());
                }
                else if (curItem.getSum() == weight) {
                    return true;
                }
                if (curItem.getPos() == arrThings.length - 1) {
                    stage = 4;
                    break;
                }
                stage = 3;
                break;
            case 3:
                curItem = stackBackPack.peek();
                stackBackPack.put(new Item(curItem.getSum() + arrThings[curItem.getPos()],
                        curItem.getPos() + 1, 4));
                stage = 2;
                break;
            case 4:
               curItem = stackBackPack.pop();
               stage = 5;
               break;
            case 5:
                if (curItem.getAddress() == 6 && curPos == arrThings.length - 1) {
                    return true;
                }
                if (curItem.getAddress() == 6) {
                   stackBackPack.put(new Item(0,++curPos, 6));
                }
                stage = curItem.getAddress();
                break;
        }
        return false;
    }
}
