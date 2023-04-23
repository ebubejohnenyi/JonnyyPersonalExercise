import java.util.Scanner;

public class LargestAndSmallestNumber {
    // TODO:  STILL FEELING I NEED TO WORK ON THIS, OR THIS IS NOT RIGHT.
         public static void main(String[] args) {
          LargestAndSmallestNumber checkLargeOrSmall = new LargestAndSmallestNumber();
          Scanner largeOrSmallNumber = new Scanner(System.in);

          int startLoop = 2;
          int endLoop = 10;
          boolean keep_going = true;
          while (keep_going) {
              System.out.print("Enter a number: ");
              int userNumber = largeOrSmallNumber.nextInt();
              if (userNumber > 1);
              if (userNumber / startLoop != 0) System.out.println("This is a large number " + userNumber);
              else System.out.println("This is a small number " + userNumber);
              System.out.println("");
              if (userNumber < 0) System.out.println("Invalid number");
              ++startLoop;
          }
      }
}
