package listing6;

import listing6.sort_merger.SortMerger;
import org.junit.Test;

import java.util.Random;

public class TestSortMerger {
    @Test
    public void testSortMerger() {
        Random random = new Random();
        long[] theArray = new long[] {10,2,12,7,22,8};
//        for (int i = 0; i < theArray.length; i++) {
//            theArray[i] = random.nextInt(22);
//        }
        System.out.println("Source array: ");
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
        SortMerger sortMerger = new SortMerger(theArray);
        sortMerger.mergeSort();
        sortMerger.display();
    }

}