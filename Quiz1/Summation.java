/*
 * Summation.java - a recursive function called sum(n) that computes the sum of integers from 1 to n *
 * compile: % javac Sum.java
 *          % java Summation
 */


public class Summation{
  public static int sum(int n) {
    if(n>0)   // what if the test was n!=0 ?
      return n+sum(n-1);
    else if (n<0)
      return n+sum(n+1);
    else 	//if n is zero
      return 0;
  }

  public static void main(String[] args){
    int number=3;
    System.out.printf("Summation of %d is equal to %d\n", number, sum(number));
    number = -7;
    System.out.printf("Summation of %d is equal to %d\n", number, sum(number));
    number = 42;
    System.out.printf("Summation of %d is equal to %d\n", number, sum(number));
  }
}
