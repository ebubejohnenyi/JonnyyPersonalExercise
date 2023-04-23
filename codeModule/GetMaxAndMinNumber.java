public class GetMaxAndMinNumber {
    private int numberOne;
    private int numberTwo;
    private int numberThree;

    public static int checkMaximum(int numberOne, int numberTwo, int numberThree){
       return Math.max(numberOne,Math.max(numberTwo, numberThree));
    }

    public static int checkMinimum(int numberOne, int numberTwo, int numberThree){
      return Math.min(numberOne,Math.min(numberTwo,numberThree));
    }

    public static void  main(String[] args){
        int isMaximum = checkMaximum(20,30,40);
        System.out.println("The maximum number is: " + isMaximum);
        int isMinimum = checkMinimum(20,30,40);
        System.out.println("The minimum number is: " + isMinimum);
    }

}
