/**
**Rokas Leskevicius
**Eleventh problem to be solved on SPOJ
**From http://www.spoj.com/problems/HYPNOS/
*/

import java.util.Scanner;
import java.util.ArrayList;

class Hypnos {
  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    ArrayList<Integer> seq = new ArrayList<Integer>();
    String num = sc.next();

    System.out.println(getSquaredDigits(num));
  }

  public static int getSquaredDigits( final String value ) {
    int newVal = 0;
    for ( int i = 0; i < value.length(); i++ ) {
      int temp = (value.charAt(i) - '0');
      newVal += Math.pow( temp, 2 );
    }
    return newVal;
  }
  public static bool checkIfRepeating( final ArrayList<Integer> list ) {

  }
}
