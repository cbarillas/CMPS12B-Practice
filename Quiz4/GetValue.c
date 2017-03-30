/*
 * getValue.c
 * used to trace recursive function getValue for Quiz4 problem 5
 *
 */

#include<stdio.h>

  int getValue(int a, int b, int n){
    int x, c;
    
    printf("arrive: a = %d b = %d\n ",a, b);
    c = (a+b)/2;
    printf("c = %d\n",c);
  
    if(c*c<=n){
      x = c;
    }
    else{
      x = getValue(a, c-1, n);
    }
    
    printf("depart: a = %d b = %d\n ",a,b);
    return x;
  
  }
  int main(){
    printf("%d\n", getValue(3, 13, 5));
  }
