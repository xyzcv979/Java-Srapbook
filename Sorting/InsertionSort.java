  
/*
*
*
*/

public class InsertionSort{

  public static void insertionSort(Comparable[] a){
    int length = a.length;
    for(int i = 0; i<length; i++){
      for(int j = i; j>0; j--){
       if(less(a[j], a[j-1]))
         exchange(a,j,j-1);
       else
         break;
    }
  }
  private static boolean less(Comparable x, Comoparable y){
    /* Implement this */  
  }
  private static void exchange(Comparable[] a, int i, int min){
   /* Implement this */ 
  }
}
