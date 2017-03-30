/*
 * BinarySearch.java
 * finds the position of a specified value (the input "target") 
 * within a sorted array.
 *
 */ 

public class BinarySearch{

  // binarySearch()
  public static int binarySearch(int[] A, int low, int high, int target){
    int mid;
    if(low>high){
      System.out.printf("Target %d was not found, error: ",target);
      return -1;
    }  
    else{
      mid=(low+high)/2;
      //System.out.printf("Target %d was compared to %d\n",target, A[mid]);
      if(target==A[mid]){
        System.out.printf("Target %d was found at index: ",target);
        return mid;
      }
      else if(target < A[mid]){
        return binarySearch(A, low, mid-1, target);
      }
      else{ // target>A[q]
        return binarySearch(A, mid+1, high, target);
      }
    }
  }
  public static void main(String[] args) {
    int[] B = {1,2,3,4,5,6,7,8,9,10};
    System.out.println(binarySearch(B, 0, B.length-1, 7));
    System.out.println(binarySearch(B, 0, B.length-1, 2));
    System.out.println(binarySearch(B, 0, B.length-1, 11));
  }
}

