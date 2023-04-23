import java.util.Scanner;
public class FindTwoLargestNumber {
        public static void main(String [] args){
            FindTwoLargestNumber checker = new FindTwoLargestNumber();

            Scanner input = new Scanner(System.in);
            int minLoop = 1;
            int maxLoop = 10;
           while (minLoop <= maxLoop){
               System.out.print("Enter a number: ");
               int userNumber = input.nextInt();
               ++minLoop;
               FindTwoLargestNumber.highNumber(userNumber);
               FindTwoLargestNumber.lowNumber(userNumber);
           }
            System.out.println("The highest Number is: "+ FindTwoLargestNumber.highNumber);
            System.out.println("The lowest Number is: "+ FindTwoLargestNumber.lowNumber);

    }
         public static int highNumber = 0;
        public static int lowNumber = 0;
    public static int highNumber (int userNumber){
        if(highNumber == 0){
            highNumber = userNumber;
        }
        else if (userNumber > highNumber){
            highNumber = userNumber;
        }
        return highNumber;
    }
    public static int lowNumber (int userNumber){
        if(lowNumber == 0){
            lowNumber = userNumber;
        }
        else if (userNumber < lowNumber){
            lowNumber = userNumber;
        }
        return lowNumber;
    }
}
