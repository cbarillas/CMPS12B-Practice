/*
 * search.c
 * implements function search() and diff()
 *
 */ 

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

  // search()
  // returns the leftmost index in s at which the target c appears
  // returns -1 if no such index exists
  int search(char *s, char c){
    int i=0;
    while(s[i] != '\0'){
      if (s[i] == c){
        return i;
      }
      i++;
    }
    return -1;
  }

  // diff()
  // returns the difference string consisting of all chars in A that are not in B
  char* diff(char *A, char *B){
    int len = strlen(A);
    char *C = calloc(len,sizeof(char));
    int j=0;
    for(int i=0; i<=len; i++){
      if(search((char *)B, A[i])==-1){
        C[j] = A[i];
        j++;
      } 
    }
    return C;
  }
  

  int main(void){
    char str[] = "Bird Up";
    char string1[] = "Compare";
    char string2[] = "Contrast";
    char *temp = diff(string1, string2); 
	  
    printf("For string '%s', character 'r' was found at index: %d\n",str,search(str, 'r'));
    printf("For string '%s', character 'l' was found at index: %d\n",str,search(str, 'l'));
    
    printf("Characters in %s that are not in %s: %s\n", string1, string2, temp);
	  
    free(temp);
	  
    return(EXIT_SUCCESS);

  }
