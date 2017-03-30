/*
 * SumArray.java
 * 3 recursive java methods that determines 
 * the sum of the integers in an array arr[0,..,n-1]
 * 
 */ 
import java.util.Arrays;
public class SumArray{

  // Recur on arr[0...n-2], add the result to arr[n-1], then return the sum
  public static int sumArray(int[] arr, int i){
    if(i==0){
      return arr[0];
    }
    else{
      return arr[i]+ sumArray(arr,i-1);
    }
  }

  // Recur on arr[1...n-1], add the result to arr[0], then return the sum
  public static int sumArrayAlt(int[] arr, int i){
    if(i==arr.length-1){
      return arr[arr.length-1];
    }
    else{ 
      return arr[i]+sumArrayAlt(arr,i+1);
    }
  }

  // Split arr[0...n-1] into two subarrays of length (approximately) n/2, recur on the two subarrays, add
  // the results and return the sum
  public static int sumArraySplit(int[] arr, int low, int high){
    if(low>high){
      return 0;
    }
    else if(low==high){
      return arr[low];
    }
    else{
      int mid = (low+high)/2;
      return sumArraySplit(arr,low,mid)+sumArraySplit(arr,mid+1,high);
    }
  }


  public static void main(String[] args){
    int[] A = {1,2,3,4,5};
    System.out.println(Arrays.toString(A));
    System.out.printf("result after calling sumArray() = %d\n", sumArray(A, A.length-1));
    System.out.printf("result after calling sumArrayAlt() = %d\n", sumArrayAlt(A, 0));
    System.out.printf("result after calling sumArraySplit() = %d\n", sumArraySplit(A, 0, A.length-1));
  }

}
