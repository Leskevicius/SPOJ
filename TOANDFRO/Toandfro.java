/**
**Rokas Leskevicius
**Fourth problem to be solved on SPOJ
**From http://www.spoj.com/problems/TOANDFRO/
*/

import java.util.Scanner;

public class Toandfro {
  public static void main( String[] args ) {
    Scanner sc = new Scanner( System.in );
    int columns;
    String message;
    String result;
    while ( true ) {
      columns = Integer.parseInt( sc.next() );
      //exitting case
      if ( columns == 0 ) {
        break;
      }
      message = sc.next();
      result = decrypt( message, columns );
      System.out.println(result);

    }
  }

  /**
  **Decrypts the message by placing the string in 2d char array, and printing it the going side to side downward
  */
  public static String decrypt( String message, int columns ) {
    int rows = message.length() / columns;
    char[][] msg = new char[columns][rows];
    int charPointer = 0;
    for ( int row = 0; row < rows; row++ ) {
      if ( row % 2 == 1 ) {
        for( int column = columns - 1; column >= 0; column-- ) {
          msg[column ][row] = message.charAt(charPointer++);
        }
      } else {
        for ( int column = 0; column < columns; column++ ) {
          // System.out.println( "Col: " + (column - displacement) + "Row: " + row );
          msg[column ][row] = message.charAt(charPointer++);
        }
      }
    }
    String result = "";
    for( int i = 0; i < columns; i++ ) {
      for (int j = 0; j < rows; j++ ) {
        result = result + msg[i][j];
      }
    }
    return result;
  }
}
