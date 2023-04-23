import java.util.Scanner;

public class ReverseMultiplicationTable {
    public ReverseMultiplicationTable() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for rerversal multiplication table: ");
        int userInput = input.nextInt();
        int maxLoop = 1;

        for(int minLoop = 10; minLoop >= maxLoop; --minLoop) {
            int reversalResult = minLoop * userInput;
            System.out.println("" + minLoop + " X " + userInput + " = " + reversalResult);
        }

    }
}
