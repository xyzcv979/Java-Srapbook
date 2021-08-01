/*
*
*
*/

public class QueueLinkedList{
  
  private Node first, last;
    
  private class Node{
    Object val;
    Node next;
  }
  
  public boolean isEmpty(){
    return first == null; 
  }
  
  public void enqueue(Object obj){
    Node oldLast = last;
    last = new Node();
    last.val = obj;
    last.next = null;
    if(isEmpty())
      first = last;
    else
      oldLast.next = last;
  }
  
  public Object dequeue(){
    Object oldFirst = first.val;
    first = first.next;
    if(isEmpty())
      last = null;
    return oldFirst;
  }
  
  
}
