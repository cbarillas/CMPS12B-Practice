/*
* DisplayOctal.java - converts any integer to any base and displays the result
* compile: % javac DisplayOctal.java
* 	   % java DisplayOctal
*
*/

class DisplayOctal{
  public static void displayOctal(int n){
    if(n>0){
      if(n/8>0){
        displayOctal(n/8);
      }
      System.out.print(n%8);
    }
  }

  public static String integerToString(int n, int b){
    String str="";
    if(n>0){
      if(n/b>0){
        str += integerToString(n/b,b);
      } 
      return str + n%b;
    }
    return str;
  }

  public static void main(String[] args) {

    int n = 42;
    int base = 8;
    System.out.printf("displayOctal():\nThe number %d in base %d is: ", n, base);
    displayOctal(n); 
    System.out.println();

    base = 2;
    System.out.printf("integerToString():\nThe number %d in base %d is: ", n, base);
    System.out.print(integerToString(n,base));
    System.out.println();

    base = 16;
    System.out.printf("integerToString():\nThe number %d in base %d is: ", n, base);
    System.out.print(integerToString(n,base));
    System.out.println();

  }
}
