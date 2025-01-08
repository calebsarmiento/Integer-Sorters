public class MergeSorter implements IntSorter {
  
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
    mergeSort(array);
    endTime = System.nanoTime();
  }
  
  private void mergeSort(int[] a) {
    int length = a.length;
    // Array is a single item or empty (base case)
    if(length <= 1) {
      return;
    }
    
    int middle = length / 2;
    
    // Split initial array in half
    int[] leftArray = new int[middle];
    int[] rightArray = new int[length - middle];
    
    for(int i = 0, k = 0; i < length; i++) {
      if(i < middle) {
        leftArray[i] = a[i];
      } else {
        rightArray[k] = a[i];
        k++;
      }
    }
    // Recursive
    mergeSort(leftArray);
    mergeSort(rightArray);
    merge(leftArray, rightArray, a);
  }
  
  private void merge(int[] leftArray, int[] rightArray, int[] a) {
    int leftSize = a.length / 2;
    int rightSize = a.length - leftSize;
    
    int original = 0;
    int left = 0;
    int right = 0;
    
    // Decide to merge or not
    while(left < leftSize && right < rightSize) {
      if(leftArray[left] < rightArray[right]) {
        a[original] = leftArray[left];
        original++;
        left++;
        moves++;
      } else {
        a[original] = rightArray[right];
        original++;
        right++;
        moves++;
      }
    }
    
    // Add any remainders who have no partner to compare to
    while(left < leftSize) {
      a[original] = leftArray[left];
      original++;
      left++;
      moves++;
    }
    while(right < rightSize) {
      a[original] = rightArray[right];
      original++;
      right++;
      moves++;
    }
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