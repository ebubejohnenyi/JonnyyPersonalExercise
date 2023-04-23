import java.util.Arrays;
import java.util.Scanner;

public class LearningArray {
    public static void main(String[] args) {
//        int[] ages = {23, 43, 65, 23, 12};
//        System.out.println(ages[3]);
//
//        int age = 12;
        System.out.println(Arrays.toString(check()));

    }
    public static int[] check() {
        Scanner input = new Scanner(System.in);
        int[] arrays = new int[10]; // Array length would be 10
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Please enter number %d: ", i+1);
            arrays[i] = input.nextInt(); // at every userinput store it in the array
        }
        return arrays;
        //System.out.println(Arrays.toString(arrays));
    }

}