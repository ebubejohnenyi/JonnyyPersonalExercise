import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String [] args){

        int userInput;
        Scanner input = new Scanner (System.in);

        System.out.print("Kindly enter a number to check if it's prime or not: ");
        userInput = input.nextInt();

        if (theUserInputIsPrime (userInput)){
            System.out.println(userInput + " This is a prime number.");
        }
        else {
            System.out.println(userInput + " This is not a prime number");
        }

    }

    public static boolean theUserInputIsPrime (int userInput){
        if (userInput <=1){
            return false;
        }
        int smallPrime = 2;
        while (smallPrime <= userInput/2){
            if (userInput % smallPrime == 0){
                return false;
            }
            smallPrime++;
        }
        return true;
    }
}
