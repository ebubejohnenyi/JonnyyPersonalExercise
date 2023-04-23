import java.util.Scanner;

public class MyExerciseTwoOnLoop {
    // TODO: Write a program which displays the sum of the strict divisors of an integer given by user
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();

        int addDivisor =0;
        int sum = 0;
        int minLoop = 1 ;
        while (minLoop <= userNumber/2){
            if ((userNumber % minLoop )== 0){
                addDivisor = minLoop;
                sum += minLoop;
                System.out.print(addDivisor + " ");
            }
            ++minLoop;
        }
        System.out.println("");
        System.out.println("The sum of numbers are: " + sum);
    }
}
