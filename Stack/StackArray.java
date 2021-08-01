/*
* Stack_Array_Implementation.java
*
* Stack using an array
* Benefits: amortized time. Over time, better runtime than linkedlist implementation
* Tradeoffs: Might not be good when fast operations need to be guranteed due to having to resize at random intervals
*
*/

import java.util.Iterable;

public class StackArray<Item> implements Iterable<Item>{
  private Item[] array;
  private int stackCount;
  
  public Iterator<Item> iterator(){
    return new ArrayIterator(); 
  }
  
  private class ArrayIterator implements Iterator<Item>{
    private index = stackCount;
    
    public boolean hasNext(){
      return index > 0; 
    }
    public Item next(){
      return array[--index];
    }
  }
  
  public StackArray(){
    array = new Item[1];
    stackCount = 1;
  }
  
  public boolean isEmpty(){
    return array.length == 0 ? true : false; 
  }
  
  public void push(Item item){
    // Resizing array if it hits threshold
    if(stackCount == array.length)
      resize(array.length * 2);
    array[stackCount++] = item;
  }
  
  private void resize(int capacity){
    Item[] copy = (Item[]) new Object[capacity];  // Java doesn't allow generic arrays. Need to cast to generic
    for(int i = 0; i<array.length; i++){
      copy[i] = array[i]; 
    }
    array = copy;
  }
  
  public Item pop(){
    if(stackCount == 0)
      return null;
    Item temp = array[--stackCount];
    // shrinking array, saving space
    if(stackCount > 0 && stackCount == array.length / 4)  
      resize(array.length / 2);
    return temp;
  }
  
  public Item peek(){
    return array[stackCount-1];
  }
 
}
