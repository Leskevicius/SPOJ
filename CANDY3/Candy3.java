/**
**Rokas Leskevicius
**Seventh problem to be solved on SPOJ
**From http://www.spoj.com/problems/CANDY3/
*/

import java.util.Scanner;

public class Candy3 {

  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    int t, n;
    t = Integer.parseInt( sc.next() );
    for ( int i = 0; i < t; i++ ) {
      n = Integer.parseInt( sc.next() );
      int[] candy = new int[n];
      for ( int j = 0; j < n; j++ ) {
        candy[j] = Integer.parseInt( sc.next() );
      }
      int total = sum( candy );
      if ( total % n == 0 ) {
        System.out.println( "YES" );
      } else {
        System.out.println( "No" );
      }
    }
  }

  public static int sum( int[] candy ) {
    int result = 0;
    for( int i = 0; i < candy.length; i++ ) {
      result += candy[i];
    }
    return result;
  }
}
