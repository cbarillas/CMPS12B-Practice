/*
 * pointerExample2.c
 * 
 *
 */

#include<stdio.h>
#include<stdlib.h>

  int main(void){
    int * A = calloc(4, sizeof(int));
    int B[] = {13, 52, 24, 35};
    int *p, *q;
    p = A;
    q = &B[3];
    while(q >= B){
       //printf("q= %p\n",q);
       *p = *q;
       //printf("p = %p\n",p);
       p++;
       q--;
    }
    p--;
    q++;
  
    printf("%d, %d, %d, %d\n", *A, *B, *p, *q);
    printf("%d, %d, %d, %d\n", *A, *(A+1), *(A+2), *(A+3) );
 
    A = B;
    printf("%d, %d, %d, %d\n", A[0], A[1], A[2], A[3] );
    return(EXIT_SUCCESS);
  }
