import java.util.Scanner;

public class MyExerciseOneOnLoop {
    // TODO: Write a program which reads a sequence of integers from the user and stops by displaying "Done" When the sum of this value
            // TODO: exceeds 100.

    public static void main(String [] args){
        Scanner enter = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.print("Enter a number: ");
            sum += enter.nextInt();
            if(sum > 100){
                System.out.print("Done: " + sum);
                break;
            }
        }
    }
}
