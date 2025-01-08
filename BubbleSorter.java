public class BubbleSorter implements IntSorter {
  
  private int[] array = null;
  private int moves = 0;
  private long startTime = 0;
  private long endTime = 0;
  
  public void init(int[] a) {
    array = a;
    moves = 0;
  }
  
  public void sort() {
    startTime = System.nanoTime();
    boolean swapNeeded = false;
    for(int i = 0; i < array.length - 1; i++) {
      for(int k = 0; k < array.length - 1 - i; k++) {
        // Check pair order
        if(array[k] > array[k + 1]) {
          // Swap if value on left is greater than right
          int temp = array[k];
          array[k] = array[k + 1];
          array[k + 1] = temp;
          // A move was made
          moves++;
          swapNeeded = true;
        }
      }
      // End sorting if it's sorted already
      if(!swapNeeded) {
        break;
      }
    }
    endTime = System.nanoTime();
  }
  
  public int getMoves() {
    return moves;
  }
  
  public long getSortTime() {
    return endTime - startTime;
  }
  
  public void printArray() {
    System.out.print("[");
    for(int i = 0; i < array.length; i++) {
      if(i + 1 != array.length) {
        System.out.print(array[i] + ", ");
      } else {
        System.out.println(array[i] + "]");
      }
    }
  }
}