/*
 * Fibonacci.java - implements the Fibonacci function F(n)=F(n−1)+F(n−2) for n ≥ 2
 * compile: % javac Fibonacci.java
 *          % java Fibonacci
 */

public class Fibonacci{

  public static int fib(int n){
    // F(0)=0, F(1)=1 are base conditions.
    if(n<=0){
      return 0;
    }
    else if(n==1){
      return 1;
    }
    else{
      return fib(n-1)+fib(n-2);
    }
  }

  public static void main(String [] args){
    int n = 16;
    System.out.printf("F(%d) is: %d\n",n, fib(n));
    n = 8;
    System.out.printf("F(%d) is: %d\n",n, fib(n));
    n = 1;
    System.out.printf("F(%d) is: %d\n",n, fib(n));
    n = -2;
    System.out.printf("F(%d) is: %d\n",n, fib(n));

  }
}
