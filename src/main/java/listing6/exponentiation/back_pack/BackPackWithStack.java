package listing6.exponentiation.back_pack;

public class BackPackWithStack {
    int numElm, startAt = 0;
    int[] arrThings;
    int weight,sum;
    private int stage;


    public BackPackWithStack(int[] arrThings, int weight) {
        this.arrThings = arrThings;
        this.weight = weight;
    }

    public void calculate() {
        stage = 1;
        sum = arrThings[0];
        while (step() == false) {
            ;
        }

    }

    public boolean step() {
        switch (stage) {
            case 1:
                if (sum + arrThings[numElm + 1] == weight) {
                    stage = 4;
                }
                if (sum + arrThings[numElm + 1] > weight)
                    stage = 2;
                else
                    sum = sum + arrThings[++numElm];
                break;
            case 2:
                if (numElm == arrThings.length - 1)
                    stage = 3;
                else
                    stage = 1;
                break;
            case 3:
                sum = arrThings[++startAt];
                numElm = startAt;

        }
        return false;
    }
}
