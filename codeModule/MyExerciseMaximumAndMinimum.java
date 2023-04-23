import java.sql.SQLOutput;
import java.util.Scanner;
public class MyExerciseMaximumAndMinimum {
    // TODO: Write a program which reads a sequence of positive integer. The program stops when the user fills in a negative value
    //  and shows the maximum and the minimum of these number.
    public static void main(String[] args) {
        MyExerciseMaximumAndMinimum myExercise = new MyExerciseMaximumAndMinimum();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = input.nextInt();

        int max = userInput;
        int min = userInput;

        while (true){
            System.out.print("Enter a positive number: ");
            userInput = input.nextInt();
            if (userInput < 0)
                break;
            max = userInput > max? userInput:  max;
            min = userInput < min? userInput: min;
        }
        System.out.println("The max number is: " + max + ", And the min Number is: " + min);
    }
}
