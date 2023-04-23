public class PrintingLeftTriangle {
    public PrintingLeftTriangle() {
    }

    public static void main(String[] args) {
        int minStarCount = 0;

        for(int maxStarCount = 10; minStarCount <= maxStarCount; ++minStarCount) {
            for(int secondMinStarCount = 0; secondMinStarCount <= minStarCount; ++secondMinStarCount) {
                System.out.print("*");

            }

            System.out.println("");
        }

    }
}
