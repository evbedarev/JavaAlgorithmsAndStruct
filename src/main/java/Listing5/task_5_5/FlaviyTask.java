package Listing5.task_5_5;

import Listing5.cyclical_list.CyclicalList;

public class FlaviyTask {
    private int begins, step;
    private CyclicalList cLinst = new CyclicalList();

    public FlaviyTask(int begins, int numPositions, int step) {
        this.step = step;
        this.begins = begins - 1;
        for (int i = 0; i < numPositions; i++) {
            cLinst.insert(i);
        }
    }

    public void calculate() {
        cLinst.step();
        cLinst.printList();
        while (cLinst.hasNext()) {
            for (int i = begins; i <= step; i++) {
                cLinst.step();
            }
            System.out.println("position: " + (cLinst.remove() + 1));
        }
        System.out.println("position: " + (cLinst.remove() + 1));

    }

}
