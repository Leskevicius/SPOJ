/**
**Rokas Leskevicius
**Ninth problem to be solved on SPOJ
**From http://www.spoj.com/problems/STAMPS/
*/

import java.util.Scanner;
import java.util.Arrays;

class Stamps {
  public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    int t = Integer.parseInt( sc.next() );
    for ( int i = 0; i < t; i++ ) {
      System.out.println( "Scenario #" + ( i + 1) + ":" );
      int stampsNeeded = Integer.parseInt( sc.next() );
      int numOfLenders = Integer.parseInt( sc.next() );
      int[] data = new int[numOfLenders];
      for ( int j = 0; j < numOfLenders; j++ ) {
        data[j] = Integer.parseInt( sc.next() );
      }
      Arrays.sort( data );
      int stampsGathered = 0;
      for ( int j = data.length - 1; j >= 0; j-- ) {
        stampsGathered += data[j];
        if ( stampsGathered >= stampsNeeded ) {
          System.out.println( (data.length - j) + "\n" );
          break;
        }
      }
      if ( stampsGathered < stampsNeeded ) {
        System.out.println( "impossible\n" );
      }
    }
  }
}
