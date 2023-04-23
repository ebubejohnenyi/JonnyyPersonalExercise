import java.util.Scanner;

public class FirstNaturalNumber {
    public FirstNaturalNumber() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minNaturalNumber = 1;
        int maxNaturalNumber = 10;

        int sum;
        for(sum = 0; minNaturalNumber <= maxNaturalNumber; ++minNaturalNumber) {
            System.out.println("Enter a Natural Number: ");
            int userNaturalNumber = input.nextInt();
            sum += userNaturalNumber;
        }

        System.out.println(sum);
    }
}
