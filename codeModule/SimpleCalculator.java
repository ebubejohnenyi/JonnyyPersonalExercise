import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter an Integer (1 + 2): ");
        double userInput = keyboard.nextInt();
        char sign = keyboard.next().charAt(0);
        double userInput2 =  keyboard.nextInt();

        if (sign == '+') System.out.print(userInput + userInput2);
        else if(sign == '-') System.out.print((int)(userInput - userInput2));
        else if (sign == '/') System.out.print((int)(userInput / userInput2));
        else if (sign == '*')System.out.print((int)(userInput * userInput2));
        else if (sign == '%')System.out.print((int)(userInput % userInput2));
        else System.out.print("This is not a sign!");

    }
}
