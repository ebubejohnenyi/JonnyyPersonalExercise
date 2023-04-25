import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class LargestAndSmallestNumber {
    // TODO:  STILL FEELING I NEED TO WORK ON THIS, OR THIS IS NOT RIGHT.
         public static void main(String[] args) {
          LargestAndSmallestNumber checkLargeOrSmall = new LargestAndSmallestNumber();
          Scanner largeOrSmallNumber = new Scanner(System.in);

          //TODO: I PROMISE TO KEEP THIS CODE CAUSE IT'S SOO OUTSIDE ( LIKE I MEAN UGLYY LOL ) OF WHAT I WAS ASKED TO DO,
             // TODO: LIKE I'M LITERALY LAUGHING AT MYSELF CAUSE THIS CODE IS RUBBISH :) SO I'LL JUST COMMENT IT HERE.
//          int startLoop = 2;
//          int endLoop = 10;
//          boolean keep_going = true;
//          while (keep_going) {
//              System.out.print("Enter a number: ");
//              int userNumber = largeOrSmallNumber.nextInt();
//              if (userNumber / startLoop != 0) System.out.println("This is a large number " + userNumber);
//              else System.out.println("This is a small number " + userNumber);
//              System.out.println("");
//              if (userNumber < 0) System.out.println("Invalid number");
//              ++startLoop;
//          }

             // TODO: THIS IS THE RIGHT ONE.

             Scanner keyboard = new Scanner(System.in);

             int smallestNumber = 0;
             int largestNumber = 0;
             while(true){
                 System.out.print("Enter a number: ");
                 int userInput = keyboard.nextInt();

                 if(userInput > largestNumber){
                     largestNumber+=userInput;
                     System.out.println("This is a large number");
                 }
                 else if(userInput < largestNumber){
                     smallestNumber+=userInput;
                     System.out.println("This is a small number");
                 }
                 System.out.println("");
                 if(userInput < 0){
                     System.out.println("Invalid");
                     System.out.println( " This is the sum of all the largest number "+largestNumber);
                     System.out.println( " This is the sum of all the smallest number "+smallestNumber);
                     break;
                 }
             }
      }
}
