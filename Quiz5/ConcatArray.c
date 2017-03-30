/*
 * concatArray.c
 * cat() takes two arrays, allocates sufficient heap memory to store the concatenation of the
 * two arrays, copies the contents of arrays s1 and s2 into newly alocated array then returns
 * a pointer to the new char array
 *
 */

#include<stdio.h>
#include<stdlib.h>
#include<assert.h>

// function prototype
char* cat(char* s1, char* s2);

  void main(){
    char k[] = "Hello";
    char v[] = "World!";
    printf("%s\n", cat(k,v));
  } 

  char* cat(char* s1, char* s2){
    int size1 = 0;
    int size2 = 0;
 
    while(s1[size1] != '\0'){size1++;}
    while(s2[size2] != '\0'){size2++;}

    int length = size1+size2;

    char* ptr = calloc(length+1,sizeof(char));
    assert(ptr!=NULL);

    for(int i = 0; i < size1; i++){
      ptr[i] = s1[i];
    }
    for(int j =0; j < size2; j++){
      ptr[j+size1] = s2[j];
    }
    
    return ptr;
}
