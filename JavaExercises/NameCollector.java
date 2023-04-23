import java.util.Scanner;

public class NameCollector {
    public NameCollector() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is you name: ");
        String userInput = input.nextLine();
        System.out.println("Hello, " + userInput);
    }
}
