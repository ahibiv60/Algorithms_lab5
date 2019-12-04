class Electr {
    double searchLength(int distance, int[] heights) {
        int minHeight = 1;
        double resultLength1 = 0.0;
        double resultLength2 = 0.0;

        for (int i = 0; i < heights.length - 1; i = i + 1) {
            double variant1 = decide(distance, heights[i], minHeight);

            double variant2 = decide(distance, minHeight, heights[i + 1]);
            double variant3 = decide(distance, heights[i], heights[i + 1]);

            double temporaryLength1 = resultLength1;
            double temporaryLength2 = resultLength2;

            resultLength1 = Math.max((distance + temporaryLength1), (variant1 + temporaryLength2));
            resultLength2 = Math.max((variant3 + temporaryLength2), (variant2 + temporaryLength1));
        }
        return Math.max(resultLength1, resultLength2);
    }

    private double decide(int d, double v1, double v2) {
        return Math.sqrt((Math.pow(d, 2) + Math.pow((v1 - v2), 2)));
    }
}