import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args){
        ValidatingInput validNumber = new ValidatingInput();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1 or 2): ");
        int userInput = input.nextInt();
        if (userInput == 1 || userInput == 2) System.out.println("This is a corect value: " + userInput);
        else if(userInput != 1 || userInput != 2){
           boolean keepLooping = true;
            while (keepLooping){
                System.out.print("Enter a correct value: ");
                int userNumber = input.nextInt();
                if (userNumber == 1 || userNumber == 2) {
                    System.out.println("This is a correct value");
                    keepLooping = false;
                }
                else if (userNumber != 1 || userNumber!= 2){
                    keepLooping = true;
                }
            }
        }
    }

}
