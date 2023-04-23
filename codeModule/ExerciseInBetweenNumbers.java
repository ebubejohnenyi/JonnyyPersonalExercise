import java.util.Scanner;

public class ExerciseInBetweenNumbers {
    public static void main(String [] args){
        // Write a program that tell if it's between numbers or not without an if statement.
        Scanner keyboard = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int userInput = keyboard.nextInt();

        while (userInput < 1 || userInput > 10){
            System.out.println("This is not in between 1 and 10 \n Try again: ");
            userInput = keyboard.nextInt();
        }
        System.out.println("This is between 1 and 10 = " );
    }
}
