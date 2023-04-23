import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        PrimeNumber primeNumber = new PrimeNumber();

        int userInput;
        System.out.print("Enter a number (Prime or Not Prime): ");
        userInput = input.nextInt();

        if(userInputIsPrime (userInput)) System.out.println("This is a prime number");
        else System.out.print("This is not a prime number");
    }

    public static boolean userInputIsPrime(int userInput){
        if(userInput <= 1)return false;
       int minimumRun = 2;
       while (minimumRun <= userInput/2){
           if (userInput % minimumRun == 0){
               return false;
           }
           minimumRun++;
       }
        return true;
    }
}
