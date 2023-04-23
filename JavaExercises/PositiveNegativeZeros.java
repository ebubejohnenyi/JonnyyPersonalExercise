import java.util.Scanner;
public class PositiveNegativeZeros{
    public static void main(String[] args){
        PositiveNegativeZeros checkPositiveNegativeZeros = new PositiveNegativeZeros();
        Scanner userInput = new Scanner(System.in);

        boolean keep_going = true;

        int bePositive = 0;

        while (keep_going){
            System.out.print("Enter a number: ");
            int userIndex = userInput.nextInt();

            if(userIndex > bePositive) System.out.println("This is a positive number: " + userIndex);
            else if (userIndex == 0) System.out.print("This number is zero: " + userIndex);
            else System.out.println("This is a negative number: " + userIndex);
            bePositive++;
            }

        }

}