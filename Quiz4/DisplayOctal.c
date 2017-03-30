/*
 * displayOctal.c
 * used to trace recursive function displayOctal for Quiz4 problem 5
 *
 */

#include<stdio.h>

  void displayOctal(int n){
    if(n>0){
      if(n/8>0){
        displayOctal(n/8);
      }
      printf("%d",n%8);
    }
  }

  void main(){
	  displayOctal(100);
  }
	
