/*
 * IntegerListTest.java
 * A test client for the IntegerList ADT
 *
 */


public class IntegerListTest{

  static void swap(IntegerList L, int i, int j) {
    int x = L.get(i); 
    int y = L.get(j); 

    L.remove(i); 
    L.add(i, y);  
    L.remove(j);
    L.add(j, x);
  }

  static int search(IntegerList L, int x){
    int length = L.size();
    while(L.get(length) != x){
      if(length <= 1){
        return 0;
      }
      else{
        length--;
      }
    } 
    return length;
  }

  static void reverseLoop(IntegerList L){
    int last = L.size();
    int first = 1;
    while(first<last){
      swap(L, first, last);
      first++;
      last--;
    }
  }

  static void reverseRecursion(IntegerList L){
    if(L.size() == 0) return;
    
    int head = L.get(1);
    L.remove(1);
    reverseRecursion(L);
    L.add(L.size()+1, head);    
  }

  static void reverseRecursion2(IntegerList L, int start, int end){
    if(start >= end) return;

    swap(L,start,end);
    reverseRecursion2(L, start+1, end-1);
  }

  static int max(IntegerList L){
    int max = L.get(1);
    for (int i = 1; i<= L.size(); i++){
      if (L.get(i) > max) max = L.get(i);
    } 
    return max;
  }


  public static void main(String[] args){
    IntegerList A = new IntegerList();
    IntegerList B = new IntegerList();
    IntegerList C = new IntegerList();
    int i, j;
    int target;

    for(i=1; i<=10; i++){
      j = i*i;
      A.add(i, j);
    }
    for(i=1; i<=10; i++){
      j = 2*i;
      B.add(i, j);
    }
    for(i=1; i<=10; i++){
      j = -2*i+1;
      C.add(i, j);
    }

    System.out.println("List A: "+A);
    swap(A,1,10);
    target = 25;
    System.out.print("Swap element at index 1 with element at index 10\nModified List A: "+A);
    System.out.print("Element "+target+" is at index: "+search(A,target)+"\n");
    reverseLoop(A);
    System.out.print("Modified List A reversed using a loop is: "+A);
    System.out.println("The maximum element of this list is: "+max(A)+"\n");
    
    System.out.println("List B: "+B);
    target = 16;
    System.out.println("Element "+target+" is at index: "+search(B,target));
    reverseRecursion(B);
    System.out.println("B reversed using recursion is: "+B);



    System.out.println("List C: "+C);
    target = -8;
    System.out.println("Element "+target+" is at index: "+search(C,target));
    reverseRecursion2(C,1,10);
    System.out.print("C reversed using second recursion method is: "+C);
    System.out.println("The maximum element of this list is: "+max(C));
   }

}
