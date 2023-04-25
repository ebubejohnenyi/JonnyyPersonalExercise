import java.util.Scanner;

public class IterationalLearning {
    public static void main(String[] args) {
        IterationalLearning reStudy = new IterationalLearning();
        Scanner keyboard = new Scanner(System.in);

        int smallestNumber = 0;
        int largestNumber = 0;
        while(true){
            System.out.print("Enter a number: ");
            int userInput = keyboard.nextInt();

            if(userInput > largestNumber){
                largestNumber+=userInput;
                System.out.println("This is a large number");
            }
            else if(userInput < largestNumber){
                smallestNumber+=userInput;
                System.out.println("This is a small number");
            }
            if(userInput < 0){
                System.out.println("Invalid");
                System.out.println( " This is the sum of all the largest number "+largestNumber);
                System.out.println( " This is the sum of all the smallest number "+smallestNumber);
                break;
            }
        }
    }

}
