public class SelectionSorter implements IntSorter {
  
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
    for(int i = 0; i < array.length; i++) {
      int lowest = array[i];
      int swapIndex = i;
      for(int k = (i + 1); k < array.length; k++) {
        // If value is less than current lowest, it's the new lowest
        if(array[k] < lowest) {
          lowest = array[k];
          swapIndex = k;
          moves++;
        }
      }
      // Swapping first lowest with new low
      array[swapIndex] = array[i];
      array[i] = lowest;
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