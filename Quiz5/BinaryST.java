/*
 * binarySearchTree.java
 * really basic way to build a binary search tree in java
 * used to trace problem 7 on Quiz 5
 */
public class Node{
  int key;
  Node left;
  Node right;
    Node(int k){
      this.key = k;
      this.left = this.right = null;
    }
  }
  
  // Problem3.java
  public class Problem3{
    public static void main(String[] args){
    Node root = new Node(5);
    root.left = new Node(2);
    root.right = new Node(7);
    root.left.right = new Node(4);
    root.right.left = new Node(6);
    root.right.right = new Node(8);

    // insert 1 into bst
    root.left.left = new Node(1);
 
    // insert 3 into bst
    root.left.right.left = new Node(3);
 
    // delete 7 from bst
    Node temp = root.right.left;
    temp.right = root.right.right;
    temp.left = null;
    root.right = temp;	
  }
}
