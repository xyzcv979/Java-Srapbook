/*
*
* Faster than insertion sort
*/

public class ShellSort{

  public static void shellSort(Comparable[] a){
    int length = a.length;
    int h = 1;
    while(h < length / 3)
      h = 3 * h + 1 // 1, 4, 13, 40, 121,...  (3x + 1 implementation)
     
    while(h >= 1){
     for(int i = h; i < length; i++){
      for(int j = i; j >= h && less(a[j],a[j-h]; j-=h){
        exchange(a,j,j-h);
      }
     }
     h = h/3;
    }
  }
  private static boolean less(Comparable x, Comoparable y){
    /* Implement this */  
  }
  private static void exchange(Comparable[] a, int i, int min){
   /* Implement this */ 
  }
}
