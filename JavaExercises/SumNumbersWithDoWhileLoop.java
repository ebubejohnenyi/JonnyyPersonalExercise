import java.util.Scanner;

public class SumNumbersWithDoWhileLoop {
    public SumNumbersWithDoWhileLoop() {
    }

    public static void main(String[] args) {
        FirstNumber();
    }

    public static void FirstNumber() {
        Scanner input = new Scanner(System.in);
        int minNumber = 1;
        int maxCount = 2;
        int sum = 0;

        int userChoice;
        do {
            System.out.print("Enter a Number: ");
            userChoice = input.nextInt();
            sum += userChoice;
            ++minNumber;
        } while(minNumber <= maxCount);

        System.out.println(" The Sum is: " + sum);
        System.out.println("");
        System.out.println("Press -> 1 to repeat this operation?  ");
        System.out.println("Press -> 2 to Exist  ");
        userChoice = input.nextInt();
        switch (userChoice) {
            case 1:
                FirstNumber();
                break;
            case 2:
                System.out.println("Good Bye..");
        }

    }
}
