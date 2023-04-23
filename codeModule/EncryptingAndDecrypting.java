import java.util.Scanner;
public class EncryptingAndDecrypting {
    private String userInput;
 static Scanner input = new Scanner(System.in);
    public static void userInput(){
        System.out.println("Enter a number: ");
        int userInput = input.nextInt();
    }
    public static void main(String [] args){
        userInput();
    }
}
