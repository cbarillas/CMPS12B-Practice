/*
 * NodeTest.java
 * compile: % javac NodeTest.java
 *          % java NodeTest
 *
 */

public class NodeTest{
 
  // recursively print out items from head to tail. 
  static void printForward(Node H){
    if(H == null) return;
    else{
      System.out.print(H.item+" ");
      printForward(H.next);
    }
  }

  // recursively print out items from tail to head
  static void printBackward(Node H){
    if(H == null) return;
    else{
      printBackward(H.next);
      System.out.print(H.item+" ");
    }
  }

  // returns the product of the items in the list
  static int product(Node H){
    if(H == null) return 1;
    return H.item * product(H.next);
  }

  public static void main(String[] args){
    Node H = new Node(9);
    H.next = new Node(7);
    H.next.next = new Node(5);

    // print out linked list
    for(Node N=H; N!=null; N=N.next){
      System.out.print(N.item+" ");
    }
    System.out.println();

    
    // inserts a new node with item value 4 into position 3
    Node temp = H.next.next;
    H.next.next = new Node(4);
    H.next.next.next = temp;

    /* alternate way
    Node P = H.next;
    Node C = H.next.next;
    P.next = new Node(4);
    P = P.next;
    P.next = C;
    */

    for(Node N=H; N!=null; N=N.next){
      System.out.print(N.item+" ");
    }
    System.out.println();
    
    printForward(H);
    System.out.println();
    
    printBackward(H);
    System.out.println();

    System.out.println("product of all items in linked list: "+product(H));
  }
}
