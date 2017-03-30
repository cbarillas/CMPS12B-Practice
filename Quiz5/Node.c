/*
 * Node.c
 * Node.java in C
 *
 */

  typedef struct NodeObj{
    int item;
    struct NodeObj* next;
  } NodeObj;

  typedef NodeObj* Node;

  // sumList()
  // recursive function that returns the sum of items in a singly linked list
  int sumList(Node H){
    if(H == NULL) return 0;
    return H->item + sumList(H->next);
  }

  // newNode()
  // constructor that returns a reference to a new NodeObj allocated from heap
  // memory with its item field set to x and its next field set to NULL.
  Node newNode(int x){
    Node N = malloc(sizeof(Node));
    assert(N!=NULL);
    N->item = x;
    N->next = NULL;
    return N;
  }

  // freeNode()
  // destructor that frees the heap memory associated with a Node, and sets its reference to NULL.
  void freeNode(Node* pN){
    if(pN != NULL && *pN != NULL){
      free(*pN);
      *pN = NULL;
    }
  }

  // clearList()
  // recursive function that frees all heap memory
  // associated with a linked list headed by H
  void clearList(Node H){
    if(H == NULL) return;
    clearList(H->next);
    free(&H);
    H = NULL;
  }
