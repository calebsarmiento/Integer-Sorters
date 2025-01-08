public class InsertionSorter implements IntSorter {

  private int[] array = null;
  private int moves = 0;
  private long startTime = 0;
  private long endTime = 0;

  public void init(int[] a) {
    this.array = a;
    moves = 0;
  }

  public void sort() {
    startTime = System.nanoTime();
    for (int i = 1; i < array.length; i++) {
      for (int k = i; k > 0 && array[k] < array[k - 1]; k--) {
        swap(array, k, k - 1);
      }
    }
    endTime = System.nanoTime();
  }
  
  private void swap(int[] values, int p1, int p2) {
    int temp = values[p1];
    values[p1] = values[p2];
    values[p2] = temp;
    moves++;
  }

  public long getSortTime() {
    return endTime - startTime;
  }

  public int getMoves() {
    return moves;
  }
}
