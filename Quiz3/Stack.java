/*
 * Stack.java
 * functions push() and pop() for the Java implementation of an integer stack
 */ 
public class Stack{
  private class Node{
    int item;
    Node next;
      Node(int item){
        this.item = item;
        this.next = null;
      }
  }
  private Node top;
  private int numItems;
 
  public Stack(){
    top = null; 
    numItems = 0;
  }
  
  // push() 
  // inserts a new item onto the top of the stack by inserting
  // a new Node at the head of the list
  void push(int x){
    Node N = new Node(x);
    N.next = top;
    top = N;
    numItems++;
  }

  //  pop() 
  //  deletes the top item, and returns its value
  int pop(){
    int returnValue = top.item;
    top = top.next;
    return returnValue;
  }
  // other Stack methods would follow
}
