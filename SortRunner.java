public class SortRunner {
  
  public static void main(String[] args) {
    int[] values1 = {53,56,50,14,21,74,72,9,24,99};

    BubbleSorter bubble = new BubbleSorter();
    bubble.init(values1);
    bubble.sort();
    SOP("BubbleSorter moves: " + bubble.getMoves());
    SOP("BubbleSorter time: " + bubble.getSortTime());
    SOP("BubbleSorter result: ");
    bubble.printArray();
    bubble = null;
    
    int[] values2 = {53,56,50,14,21,74,72,9,24,99};
    SelectionSorter selection = new SelectionSorter();
    selection.init(values2);
    selection.sort();
    SOP("SelectionSorter moves: " + selection.getMoves());
    SOP("SelectionSorter time: " + selection.getSortTime());
    SOP("SelectionSorter result: ");
    selection.printArray();
    selection = null;
    
    int[] values3 = {53,56,50,14,21,74,72,9,24,99};
    MergeSorter merge = new MergeSorter();
    merge.init(values3);
    merge.sort();
    SOP("MergeSorter moves: " + merge.getMoves());
    SOP("MergeSorter time: " + merge.getSortTime());
    SOP("MergeSorter result: ");
    merge.printArray();
    merge = null;
  }
  
  public static void SOP(String message) {
    System.out.println(message);
  }
}