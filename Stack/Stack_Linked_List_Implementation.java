/*
* Stack_Linked_List_Implementation.java
*
* Creating a stack using a LinkedList
* Benefits: Constant time operations
* Tradeoffs: Extra space due to object Nodes
*
*/

public class Stack_Linked_List_Implementation{
  
  private Node head = null;
  
  private class Node{
    Object val;
    Node next;
    
  }
  
  public boolean isEmpty(){
    return head.val == null; 
  }  
  
  public Node pop(){
    if(head == null)
      return null;
    Node temp = head;
    head = head.next;
    return temp;
  }
    
    
  public void push(Object val){
    Node newNode = new Node();
    newNode.val = val;
    newNode.next = head;
    head = newNode;
  }
    
    
  public Node peek(){
    if(head == null)
      return null;
    return head; 
  }
  
  
}
