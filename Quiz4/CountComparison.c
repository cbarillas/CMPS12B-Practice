/*
 * countComparisons.c
 * function will return an int giving the number of elements
 * in A that are less than A[i]
 *
 *
 */ 

#include<stdio.h>
#include<string.h>

  // n = length of A
  // i = specifying an index to A
  int countComparisons(int* A, int n, int i){
    int size=0;

    for(int j =0; j<=n-1; j++){
      if(A[j] < A[i]) size++;
    }
    return size;
  }

  int main(){
    int temp;
    int i;
    int arr[] = {0,7,10,4,5,11,14,17,3,1,-1};
    int *A = arr;

    printf("Our array: ");
    for(i=0;i<11;i++){
      if(i < 10)
        printf("%d, ",A[i]);
      else 
        printf("%d\n",A[i]);
    }

    temp = countComparisons(A, 11, 5);
    printf("Number of elements smaller than %d in our array is: %d\n", A[5], temp);
    return 0;
  }

