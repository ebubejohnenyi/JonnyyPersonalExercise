import java.util.Scanner;

public class BarChartPrintingProgram {
    // TODO: I NEED TO COLLECT USER INTEGER AND PRINT ASTERISK BASE ON THE LENGTH
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.print("Enter a password: ");
          String userInput = input.nextLine();
          for (char convert : userInput.toCharArray()){
              System.out.print('*');
          }


      }
}
