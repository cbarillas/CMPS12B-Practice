/*
 * DictionaryClient.c
 * Test client for the Binary Search Tree
 *
 */


#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"Dictionary.h"

  int main(int argc, char* argv[]){
    Dictionary A = newDictionary();
    insert(A, 3);
    insert(A, 11);
    insert(A, 9);
    insert(A, 12);
    insert(A, 2);
    insert(A, 6);
    insert(A, 5);
    insert(A, 8);
    insert(A, 10);
   
    printDictionary(stdout, A);
   

    delete(A, 10);
    delete(A, 9);
    delete(A, 3);
   
    printf("\nafter deleting 10, 9, 3:\n");
    printDictionary(stdout,A);
  
    freeDictionary(&A);

    return(EXIT_SUCCESS);
  }
