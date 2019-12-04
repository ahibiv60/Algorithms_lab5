public class Main {
    public static void main(String[] args) {
        // Example 1
//        int distanceBetweenPillars = 2;
//        int[] maxHeights = {3, 3, 3};

        // Example 2
//        int distanceBetweenPillars = 100;
//        int[] maxHeights = {1, 1, 1, 1};

        // Example 3
//        int distanceBetweenPillars = 4;
//        int[] maxHeights = {100, 2, 100, 2, 100};

        // Example 4
        int distanceBetweenPillars = 4;
        int[] maxHeights = {56, 18, 17, 94, 23, 7, 21, 94, 29, 54, 44, 26, 86, 79, 4, 15, 5, 91, 25, 17, 88, 66, 28, 2, 95, 97, 60,
                93, 40, 70, 75, 48, 38, 51, 34, 52, 87, 8, 62, 77, 35, 52, 3, 93, 34, 57, 51, 11, 39, 72};

        Electr algorithm = new Electr();

        System.out.println("The required length of wire is possible:");
        System.out.printf("%.2f", algorithm.searchLength(distanceBetweenPillars, maxHeights));
    }
}
