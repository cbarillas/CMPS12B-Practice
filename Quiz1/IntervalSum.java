/*
* AddNumbersInBetween.java
* methods that take two non-negative integers start and end, then returns the sum
* of the integers from start to end (inclusive) if start<=end, and returns 0 if start>end.
* compile : % javac IntervalSum.java
* 	    % java IntervalSum
*/

public class IntervalSum{

  public static int sum(int start, int end) {
    if(start<=end){   
      return end + sum(start,end-1);
    }
    else{
      return 0;
    }
  }

  public static int getSum(int start, int end){
    if(start>end){
      return 0;
    } 
    else if(start==end){
      return start;
    }
    else{
      int mid = (start+end)/2;
      return getSum(start,mid)+getSum(mid+1,end);
    } 
  } 

  
  public static void main(String[] args) {
    System.out.println(sum(5,10));
    System.out.println(getSum(5,10));
}
}
