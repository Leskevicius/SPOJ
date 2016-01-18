/**
**Rokas Leskevicius
**Third problem to be solved on SPOJ
**From http://www.spoj.com/problems/NSTEPS/
*/

import java.util.Scanner;


public class Nsteps {

  public static void main( String[] args ) {
    Scanner scanner = new Scanner( System.in );

    int n = Integer.parseInt( scanner.next() );
    int x, y;
    for ( int i = 0; i < n; i++ ) {
      x = Integer.parseInt( scanner.next() );
      y = Integer.parseInt( scanner.next() );
      printStepValue( x, y );
    }

  }

  public static void printStepValue( final int x, final int y ) {
    if ( x - y == 0 || x - y == 2) {
      System.out.println( x + y );
    } else {
      System.out.println( "No number" );
    }
  }

}
