/**
**Rokas Leskevicius
**First problem to be solved on SPOJ
*/

//Scanner to read the input from console
//Should use redirection with a file containing the values
import java.util.Scanner;

public class Test {
  //program should print out all ints until it reaches 42
  public static final int end = 42;

  public static void main( String[] args ) {
    System.out.println("Welcome Rokai.");
    Scanner scanner = new Scanner(System.in);
    int input;
    while ( scanner.hasNextInt() ) {
      input = scanner.nextInt();
      if ( input == end )
        break;
      System.out.println(input);
    }
  }
}
