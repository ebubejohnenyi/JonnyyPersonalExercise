import java.util.Scanner;

public class SecondNumber {
    public SecondNumber() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number to find the factorial: ");
        int userIndex = input.nextInt();

        for(int minLoop = 1; userIndex >= minLoop; --userIndex) {
            System.out.print( userIndex + " ");
        }

    }
}
