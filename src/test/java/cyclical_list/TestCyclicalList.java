package cyclical_list;

import Listing5.cyclical_list.CyclicalList;
import org.junit.Before;
import org.junit.Test;

public class TestCyclicalList {
    CyclicalList cyclicalList = new CyclicalList();
    @Before
    public void before() {
        cyclicalList.insert(25);
        cyclicalList.insert(26);
        cyclicalList.insert(27);
        cyclicalList.insert(28);
        cyclicalList.insert(29);
        cyclicalList.insert(30);

    }
    @Test
    public void tstCycle() {
        cyclicalList.printList();
    }
    @Test
    public void testRemove() {
        System.out.println("Test remove");
        cyclicalList.find(27);
        cyclicalList.remove();
        cyclicalList.printList();
    }

}
