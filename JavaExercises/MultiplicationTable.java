import java.util.Scanner;

public class MultiplicationTable {
    public MultiplicationTable() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number for multiplicaition table: ");
        int userNumber = input.nextInt();
        int minMultiplication = 1;
        int multiplicationTable;

        for( multiplicationTable = 0; minMultiplication <= userNumber; ++minMultiplication) {
            multiplicationTable = minMultiplication * userNumber;
            System.out.println(minMultiplication + "  X  " + userNumber + " = " + multiplicationTable);
        }

    }
}
