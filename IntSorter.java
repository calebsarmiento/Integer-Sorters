public interface IntSorter {

  /**
   * This method should initialize your class - reset the # of moves and perform any setup necessary.
   */
  public void init(int[] a);

  /**
   * This method should sort the values from init.
   */
  public void sort();

  /**
   * This method should return the number of moves made in your sort.
   */
  public int getMoves();

  /**
   * This method should return the number of nanoseconds it took to *only* perform your sort.
   */
  public long getSortTime();
}
