import java.util.Scanner;

public class MyExerciseFourIndividualCount {
    // TODO: Write a program which displays the sum of digits of an integer read from the user.
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = in.nextInt();

        int individualSum = 0;
        int minLoop = 0;
        while (userInput > minLoop){
            individualSum += userInput % 10;
            userInput /= 10;
        }
        System.out.println( " The sum is: " + individualSum);
    }
}
