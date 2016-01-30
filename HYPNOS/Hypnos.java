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
    String num = sc.next();
    System.out.println(isItHappy(num));
  }

  public static int getSquaredDigits( final String value ) {
    int newVal = 0;
    for ( int i = 0; i < value.length(); i++ ) {
      int temp = (value.charAt(i) - '0');
      newVal += Math.pow( temp, 2 );
    }
    return newVal;
  }
  public static boolean checkIfRepeating( final ArrayList<Integer> list ) {
    int checkValue = list.get(list.size()-1);
    for ( int i = list.size() - 2; i >= 0; i-- ) {
      if ( list.get(i) == checkValue ) {
        return true;
      }
    }
    return false;
  }
  public static int isItHappy( final String value ) {
    String testVal = value;
    ArrayList<Integer> seq = new ArrayList<Integer>();
    seq.add( Integer.parseInt( testVal ) );
    while ( true ) {
      int currentValue = getSquaredDigits( testVal );
      if ( currentValue == 1 ) {
        return seq.size();
      } else {
        seq.add( currentValue );
        testVal = new Integer( currentValue ).toString();
      }
      if ( checkIfRepeating( seq ) ) {
        return -1;
      }
    }
  }
}
