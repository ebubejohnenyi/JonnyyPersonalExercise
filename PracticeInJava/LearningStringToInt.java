public class LearningStringToInt {
    public static void main (String[] args){
        String month = "23";
        int year = 2023;

        int secondMonth = Integer.parseInt(month);
        int sum = secondMonth+year;
        System.out.print("The sum String that is converted to int is: " + sum);

    }
}
