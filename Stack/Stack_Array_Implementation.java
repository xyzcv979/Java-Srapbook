/*
* Stack_Array_Implementation.java
*
* Stack using an array
* Benefits: amortized time. Over time, better runtime than linkedlist implementation
* Tradeoffs: Might not be good when fast operations need to be guranteed due to having to resize at random intervals
*
*/

public class Stack_Array_Implementation{
  private Object[] array;
  private int stackCount;
  
  public Stack_Array_Implementation(){
    array = new Object[1];
    stackCount = 1;
  }
  public boolean isEmpty(){
    return array.length == 0 ? true : false; 
  }
  public void push(Object item){
    // Resizing array if it hits threshold
    if(stackCount == array.length)
      resize(array.length * 2);
    array[stackCount++] = item;
  }
  
  private void resize(int capacity){
    int[] copy = new int[capacity];
    for(int i = 0; i<array.length; i++){
      copy[i] = array[i]; 
    }
    array = copy;
  }
  
  public Object pop(){
    if(stackCount == 0)
      return null;
    
    Object temp = array[--stackCount];
    
    // shrinking array, saving space
    if(stackCount > 0 && stackCount == array.length / 4)  
      resize(array.length / 2);
    
    return temp;
  }
  
  public Object peek(){
    return array[stackCount-1];
  }
 
}
