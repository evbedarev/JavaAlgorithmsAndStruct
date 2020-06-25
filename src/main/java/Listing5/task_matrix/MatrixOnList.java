package Listing5.task_matrix;

public class MatrixOnList {
   private int height;
   private int width;
   private Link current;
   private Link zero;

    public MatrixOnList(int height, int width) {
        this.height = height;
        this.width = width;
        initMatrix();
    }

    public void initMatrix() {
        Link row = new Link(0);
        int num = 1;
        for (int j=0; j < height; j++) {
            current = row;
            for (int i = 0; i < width; i++) {
                Link nLink = new Link(num++);
                if (j == 0 && zero == null) {
                    row = zero = nLink;
                    current = nLink;
                } else if (j == 0) {
                    current.setRight(nLink);
                    current = nLink;
                } else {
                    current.setDown(nLink);
                    current = current.getRight();
                }
            }
            if (j != 0) {
                current = row;
                for (int i = 0; i < width; i++) {
                    if (current.getRight() != null)
                        current.getDown().setRight(current.getRight().getDown());
                    current = current.getRight();
                }
                row = row.getDown();
            }
        }
    }

    public void printMatrix() {
        current = zero;
        Link row = zero;
        for (int j=0; j < height; j++) {
            current = row;
            for (int i = 0; i < width; i++) {
                System.out.print(current.getaDouble() + " ");
                current = current.getRight();
            }
            row = row.getDown();
            System.out.println("");
        }
//        System.out.println(current.toString());
    }
}
