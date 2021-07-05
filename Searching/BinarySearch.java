/*
* Binary Search
*
* log(n) time
*
* Created by: Alexander Ng
* Date: July 05, 2021
* Source: Algorithms 1, ROBERT SEDGEWICK | KEVIN WAYNE, Princeton University
*
*/
public class BinarySearch{
    public static int binarySearch(int[] a, int key){
        // low, high pointers in array
        int low = 0;
        int high = a.length-1;

        while(low <= high){

            int mid = low + (high - low) / 2;
            // 3-way compare
            if(key < a[mid])
                high = mid - 1;
            else if(key> a[mid])
                low = mid + 1;
            // return mid if they're equal
            else
                return mid;
        }

        return -1;
    }
}
