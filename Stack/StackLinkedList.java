/*
* Stack_Linked_List_Implementation.java
*
* Creating a stack using a LinkedList, with iterable properties
* Benefits: Constant time operations
* Tradeoffs: Extra space due to object Nodes
*
*/

import java.util.Iterable;

public class StackLinkedList<Item> implements Iterable<Item>{
  
  private Node head = null;
  
  public Iterator<Item> iterator(){
    return new ListIterator(); 
  }
  
  private class ListIterator implements Iterator<Item>{
    private Node curr = head;
    
    public boolean hasNext(){
      return curr.next != null; 
    }
    public Item next(){
      Item item = curr.val;
      curr = curr.next;
      return item;
    }
  }
  
  private class Node{
    Item val;
    Node next;
    
  }
  
  public boolean isEmpty(){
    return head.val == null; 
  }  
  
  public Item pop(){
    if(head == null)
      return null;
    Node temp = head;
    head = head.next;
    return temp.val;
  }
    
    
  public void push(Item val){
    Node newNode = new Node();
    newNode.val = val;
    newNode.next = head;
    head = newNode;
  }
    
    
  public Item peek(){
    if(head == null)
      return null;
    return head.val; 
  }
  
  
}
