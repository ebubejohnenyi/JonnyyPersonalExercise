public class PracticingMethod {
    private static int num1;
    private static int num2;

      public static void main(String [] args){
        PracticingMethod practicingMethod = new PracticingMethod();
        PracticingMethod.add(num1, num2);
      }
    public static int add(int num1, int num2){

          return addTwoNumber(num1, num2);
    }

    public static int addTwoNumber (int num1, int num2){

          return num1 + num2;
    }
}
