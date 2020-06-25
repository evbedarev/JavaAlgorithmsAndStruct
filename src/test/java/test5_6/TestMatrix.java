package test5_6;

import Listing5.task_matrix.MatrixOnList;
import org.junit.Test;

public class TestMatrix {
    @Test
    public void testMatrix() {
        MatrixOnList matrixOnList = new MatrixOnList(7,7);
        matrixOnList.printMatrix();
    }
}
