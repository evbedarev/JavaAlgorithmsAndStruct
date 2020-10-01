package listing6.exponentiation.back_pack;

public class BackPackTask {
    int weight;
    int[] someThings;

    public BackPackTask(int weight, int[] someThings) {
        this.weight = weight;
        this.someThings = someThings;
    }
    public int calculate() {
        return putThings(weight, 0);
    }

    private int putThings(int weight, int indexElm) {
        int weightThings = weight;
        int answer = 0;
        System.out.println(indexElm);
        if (weightThings - someThings[indexElm] == 0) {
            System.out.println("Put in back thing weight = " + someThings[indexElm]);
            return someThings[indexElm];
        }
        for (int i=indexElm; i < someThings.length - 1; i++) {
            if (weightThings - someThings[i] > 0) {
                answer = putThings(weightThings - someThings[i], i + 1);
            }
            if (answer > 0) {
                System.out.println("Put in back thing weight = " + someThings[i]);
                return answer + someThings[i];
            }
        }
        return -1;
    }
}
