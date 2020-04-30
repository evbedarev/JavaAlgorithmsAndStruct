package cyclical_list;

import Listing5.cyclical_list.CyclicalList;
import org.junit.Test;

public class TestCyclicalList {
    @Test
    public void tstCycle() {
        CyclicalList cyclicalList = new CyclicalList();
        cyclicalList.insert(25);
        cyclicalList.insert(26);
        cyclicalList.insert(27);
        cyclicalList.insert(28);
        cyclicalList.insert(29);
        cyclicalList.insert(30);
        cyclicalList.printList();
    }
}
