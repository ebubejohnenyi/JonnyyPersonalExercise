import java.util.Scanner;

public class PositivePrimeNumber {

    // TODO: I NEED TO WORK ON THIS CAUSE THIS IS RUBBISH.!! HAHAHA.
    public PositivePrimeNumber() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInteger = input.nextInt();
        if (userInteger < 0) {
            System.out.println("This  is not userInteger = input.nextInt(); a positive integer!");
        }

        int minLoop = 2;

        while(minLoop <= userInteger/2) {
            if (userInteger % minLoop == 0) {
                System.out.println("This is not a prime number");
                break;
            }

            System.out.println("This is a prime number");
        }

    }
}
