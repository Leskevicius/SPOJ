/**
**Rokas Leskevicius
**Second problem to be solved on SPOJ
**From http://www.spoj.com/problems/ADDREV/
*/

import java.util.Scanner;

public class AddRev {

  public static void main( String[] args ) {
    Scanner scanner = new Scanner( System.in );
    int n = scanner.nextInt();
    int a, b;
    for ( int i = 0; i < n; i++ ) {
      a = reverse( scanner.nextInt() );
      b = reverse( scanner.nextInt() );
      System.out.println( reverse( a + b ) );
    }
  }
/**
**This method takes in an integer, reverses it, and returns it as an int
*/
  public static int reverse( int num ) {
    String number = Integer.toString( num );
    //get an array of chars from string representation of the number passed into the method
    char[] arrayOfChars = number.toCharArray();
    int j = number.length() - 1;
    //move around the digits so it is reversed
    for ( int i = 0; i < number.length() / 2; i++ ) {
      char temp = arrayOfChars[i];
      arrayOfChars[i] = arrayOfChars[j];
      arrayOfChars[j] = temp;
      j--;
    }
    //change the array of chars into an int
    num = Integer.parseInt( new String( arrayOfChars ) );
    return num;
  }
}
