import java.util.Scanner;

public class FactorialOfANumber {
    public FactorialOfANumber() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 1;
        System.out.print("Enter number to find the Factorial: ");
        int userInput = input.nextInt();
        System.out.println("");

        for(int minLoop = 1; minLoop <= userInput; ++minLoop) {
            sum *= minLoop;
        }

        System.out.println("The factorial is: " + sum);
    }
}
