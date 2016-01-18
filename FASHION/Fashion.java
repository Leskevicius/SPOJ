/**
**Rokas Leskevicius
**Sixth problem to be solved on SPOJ
**From http://www.spoj.com/problems/FASHION/
*/

import java.util.Scanner;

class Fashion {
  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    int t, n;
    t = Integer.parseInt( sc.next() );
    for( int i = 0; i < t; i++ ) {
      n = Integer.parseInt( sc.next() );
      int[] a = new int[n];
      int[] b = new int[n];
      for( int j = 0; j < n; j++ ) {
        a[j] = Integer.parseInt( sc.next() );
      }
      for( int j = 0; j < n; j++ ) {
        b[j] = Integer.parseInt( sc.next() );
      }
      int hottness = 0;
      for( int j = 0; j < n; j++ ) {
        hottness += ( a[j] * b[j] );
      }
      System.out.println( hottness );
    }
  }
}
