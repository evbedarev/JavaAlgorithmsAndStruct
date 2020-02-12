// priorityQ.java
// demonstrates priority queue
// to run this program: C>java PriorityQApp
////////////////////////////////////////////////////////////////
class PriorityQ
   {
   // array in sorted order, from max at 0 to min at size-1
   private int maxSize;
   private long[] queArray;
   private int nItems;
//-------------------------------------------------------------
   public PriorityQ(int s)          // constructor
      {
      maxSize = s;
      queArray = new long[maxSize];
      nItems = 0;
      }
//-------------------------------------------------------------
   public void insert(long item) {    // insert item
      if (nItems != maxSize) {
         queArray[nItems++] = item;         // insert at 0
      } else {
         System.out.println("max size of Queue");
      }
   }  // end insert()
//-------------------------------------------------------------
   public long remove()             // remove minimum item
      { return queArray[--nItems]; }
//-------------------------------------------------------------
   public long peekMin() {
      long val = 0;
      int i = 0;
      for (int j=0; j < nItems; j++) {
         if (i == 0) {
            val = queArray[j];
         } else {
             if (val > queArray[j]) {
                val = queArray[j];
             }
         }
         i++;
      }
      return val;
   }            // peek at minimum item
//-------------------------------------------------------------
   public boolean isEmpty()         // true if queue is empty
      { return (nItems==0); }
//-------------------------------------------------------------
   public boolean isFull()          // true if queue is full
      { return (nItems == maxSize); }
//-------------------------------------------------------------
      public void printArray() {
         for (int j=0; j<nItems;j++) {
            System.out.println(queArray[j]);
         }
      }
   }  // end class PriorityQ
////////////////////////////////////////////////////////////////

//   public void insert(long item)    // insert item
//      {
//      int j;
//
//      if(nItems==0)                         // if no items,
//         queArray[nItems++] = item;         // insert at 0
//      else                                // if items,
//         {
//         for(j=nItems-1; j>=0; j--)         // start at end,
//            {
//            if( item > queArray[j] )      // if new item larger,
//               queArray[j+1] = queArray[j]; // shift upward
//            else                          // if smaller,
//               break;                     // done shifting
//            }  // end for
//         queArray[j+1] = item;            // insert it
//         nItems++;
//         }  // end else (nItems > 0)
//      }  // end insert()

