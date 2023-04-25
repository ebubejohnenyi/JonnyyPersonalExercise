import java.util.Scanner;

public class MyExerciseOnSpaceLettering {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String userInput = keyboard.next();
        for (int minLoop = 0; minLoop <= userInput.length()-1; minLoop++){
            System.out.print(userInput.charAt(minLoop) + " ");
        }
    }
}
