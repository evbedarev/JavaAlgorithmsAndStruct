package listing6.sort_merger;

public class SortMerger {
    private long[] theArray;
    private int nElements;

    public SortMerger(long[] theArray) {
        this.theArray = theArray;
        nElements = theArray.length;
    }

    public void mergeSort() {
        long[] workSpace = new long[nElements];
        System.arraycopy(theArray, 0, workSpace, 0, theArray.length);
        recMergeSort(workSpace, 0, nElements -1);
    }
    public void display() {
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + " ");
        }
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        }
        int mid = (lowerBound + upperBound)/2;
        recMergeSort(workSpace, lowerBound, mid);
        recMergeSort(workSpace, mid + 1, upperBound);
        merger(workSpace,lowerBound, mid + 1,upperBound);
    }
    private void displayArr(long[] arr, int lowerBound, int hightBound) {
        for (int i = lowerBound; i <= hightBound; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    private void merger(long[] workSpace, int lowerPtr, int hightPtr, int upperBound) {
        int j = lowerPtr;
        int lowerBound = lowerPtr;
        int mid = hightPtr - 1;
        while (lowerPtr <= mid && hightPtr <= upperBound) {
            if (workSpace[lowerPtr] <= theArray[hightPtr]) {
                workSpace[j++] = theArray[lowerPtr++];
            } else {
                workSpace[j++] = theArray[hightPtr++];
            }
        }
        while (lowerPtr <= mid)
            workSpace[j++] = theArray[lowerPtr++];

        while (hightPtr <= upperBound)
            workSpace[j++] = theArray[hightPtr++];
        for (int i = 0; i < j - lowerBound; i++) {
            theArray[lowerBound+i] = workSpace[lowerBound + i];
        }
    }


}
