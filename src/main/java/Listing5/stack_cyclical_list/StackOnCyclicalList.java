package Listing5.stack_cyclical_list;

import Listing5.cyclical_list.CyclicalList;

public class StackOnCyclicalList {
    CyclicalList cyclicalList = new CyclicalList();
    public void push(double dData) {
        cyclicalList.insert(dData);
    }

    public double pop() {
        return cyclicalList.remove();
    }

    public double peek() {
        return cyclicalList.getCurrent();
    }
}
