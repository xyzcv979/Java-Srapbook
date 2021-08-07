/*
*
*
*/

public class SelectionSort{

  public static void selectionSort(Comparable[] a){
    int length = a.length;
    for(int i = 0; i<length; i++){
      int min = i;
      for(int j = 1; j<length;j++){
       if(less(a[min],a[j]))
         min = j;
      exchange(a,i,min);
    }
  }
  private static boolean less(Comparable x, Comoparable y){
    /* Implement this */  
  }
  private static void exchange(Comparable[] a, int i, int min){
   /* Implement this */ 
  }
}
