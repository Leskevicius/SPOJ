/**
**Rokas Leskevicius
**Tenth problem to be solved on SPOJ
**From http://www.spoj.com/problems/OFFSIDE/
*/

import java.util.Scanner;
import java.util.Arrays;

class Offside {
  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    int a, d;
    int[] b, c;
    while ( true ) {
      a = Integer.parseInt( sc.next() );
      d = Integer.parseInt( sc.next() );
      if ( a == 0 && d == 0 ) {
        break;
      }
      b = new int[a];
      c = new int[d];
      for ( int i = 0; i < a; i++ ) {
        b[i] = Integer.parseInt( sc.next() );
      }
      for ( int i = 0; i < d; i++ ) {
        c[i] = Integer.parseInt( sc.next() );
      }
      Arrays.sort( b );
      Arrays.sort( c );
      int attackerDist = b[0];
      if ( c[0] > attackerDist || c[1] > attackerDist ) {
        System.out.println("Y");
      } else {
        System.out.println("N");
      }
    }
  }
}
