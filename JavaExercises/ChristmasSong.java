import java.util.Scanner;

public class ChristmasSong {
    public ChristmasSong() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minDays = 1;
        int maxDays = 12;

        while(minDays <= maxDays) {
            System.out.println("Enter days 1 -12 to print Christmas Song lyrics ");
            int userDays = input.nextInt();
            switch (userDays) {
                case 1:
                    System.out.println("On the First day, my true love sent to me ");
                    break;
                case 2:
                    System.out.println("On the Second day, my true love sent to me ");
                    break;
                case 3:
                    System.out.println("On the Third day, my true love sent to me  ");
                    break;
                case 4:
                    System.out.println("On the Forth day, my true love sent to me ");
                    break;
                case 5:
                    System.out.println("On the Fifth day, my true love sent to me ");
                    break;
                case 6:
                    System.out.println("On the Sixth day, my true love sent to me ");
                    break;
                case 7:
                    System.out.println("On the Seventh day, my true love sent to me ");
                    break;
                case 8:
                    System.out.println("On the Eight day, my true love sent to me  ");
                    break;
                case 9:
                    System.out.println("On the Ninth day, my true love sent to me ");
                    break;
                case 10:
                    System.out.println("On the Tenth day, my true love sent to me  ");
                    break;
                case 11:
                    System.out.println("On the Eleventh day, my true love sent to me ");
                    break;
                case 12:
                    System.out.println("On the Twelve day, my true love sent to me ");
            }

            switch (userDays) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("I sent eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a-leaping");
                case 9:
                    System.out.println("Nine ladies dancing");
                case 8:
                    System.out.println("Eight maids a-milking");
                case 7:
                    System.out.println("Seven swans a-swimming");
                case 6:
                    System.out.println("Six geese a-laying");
                case 5:
                    System.out.println("Five gold rings (five golden rings)");
                case 4:
                    System.out.println("Four calling birds");
                case 3:
                    System.out.println("Three French hens");
                case 2:
                    System.out.println("Two turtledoves");
                case 1:
                    System.out.println("A partridge in a pear tree");
                default:
                    ++minDays;
            }
        }

    }
}
