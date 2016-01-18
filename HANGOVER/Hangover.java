/**
**Rokas Leskevicius
**Eigth problem to be solved on SPOJ
**From http://www.spoj.com/problems/HANGOVER/
*/

import java.util.Scanner;

class Hangover {
  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    while ( true ) {
      double c = Double.parseDouble( sc.next() );
      if ( c == 0.0 ) {
        break;
      }
      System.out.println( numOfCards( c ) + " card(s)");
    }
  }
  public static int numOfCards( double c ) {
    double i = 1.0;
    double sum = 0.0;
    while ( true ) {
      sum += 1 / ( 1 + i );
      if ( c <= sum ) {
        return (int) i;
      }
      i += 1.0;
    }
  }
}
