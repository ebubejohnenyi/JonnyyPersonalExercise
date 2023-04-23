import java.util.Scanner;

public class ExerciseLuckyOrNotLuckyNumber {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int userInput = keyboard.nextInt();
        if (!(userInput > 999 && userInput < 10000)){
            System.out.print("This is not a four digit number");
        }
        else {
            int fourthNumber = userInput % 10; // This is to get the fourth number
            int thirdNumber = (userInput / 10) % 10; // This is to get the third number
            int secondNumber = (userInput / 100) % 10; // This is to get the second number
            int firstNumber = (userInput / 1000) % 10; //  This is to get the first number

            if (firstNumber + secondNumber == thirdNumber + fourthNumber) System.out.print("This is a lucky number");
            else System.out.print("This is not a lucky number");
        }

    }
}
