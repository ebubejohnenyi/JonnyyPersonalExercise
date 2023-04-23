import java.util.Scanner;

public class PowerOfNumbers {
    public PowerOfNumbers() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int squareRootAnswer = 1;
        System.out.print("Enter a First number: ");
        int firstInput = input.nextInt();
        System.out.print("Enter a Second number: ");
        int secondInput = input.nextInt();
        System.out.println("");

        for(int minLoop = 0; minLoop < secondInput; ++minLoop) {
            squareRootAnswer = firstInput * squareRootAnswer;
        }

        System.out.println("The Square root is: " + squareRootAnswer);
    }
}
