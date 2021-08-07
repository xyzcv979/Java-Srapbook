/*
*
*
*/

public class Shuffle{

  public static void shuffle(Object[] a){
    int length = a.length;
    for(int i = 0; i<length; i++){
      int r = StdRandom.uniform(i+1);
      exchange(a,i,r);
    }
  }
  private static void exchange(Object[] a, int i, int min){
   /* Implement this */ 
  }
}
