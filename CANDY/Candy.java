/**
**Rokas Leskevicius
**Fifth problem to be solved on SPOJ
**From http://www.spoj.com/problems/CANDY/
*/

import java.util.Scanner;

public class Candy {

  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    int n;
    while (true) {
      n = Integer.parseInt( sc.next() );
      if (n == -1) {
        break;
      }
      int packets[] = new int[n];
      for( int i = 0; i < n; i++ ) {
        packets[i] = Integer.parseInt( sc.next() );
      }
      System.out.println( numOfMoves(packets) );
    }
  }

  public static int numOfMoves( int[] packets ) {
    int sum = sum( packets );
    if ( sum % packets.length != 0 ) {
      return -1;
    }
    int moves = 0;
    int amountPer = sum / packets.length;
    for ( int i = 0; i < packets.length; i++ ) {
      if ( packets[i] - amountPer > 0 ) {
        moves += packets[i] - amountPer;
      }
    }
    return moves;
  }

  public static int sum( int[] packets ) {
    int result = 0;
    for( int i = 0; i < packets.length; i++ ) {
      result += packets[i];
    }
    return result;
  }
}
