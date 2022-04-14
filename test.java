public class workSheet {
    public static double[] calcTwoNorms(int[][] input, int[] benchmark) {
        // This method calculate the 2-norm between each elem of input with benchmark
        if (benchmark == null || input == null) {
            throw new IllegalArgumentException("Invalid Input");
        }
        double[] errors = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            try {
                int[] arr = input[i];
                errors[i] = twoNorm(arr, benchmark);
            } catch (Exception e) {
                System.out.println("Some Exception happens");
            }
        }
        return (errors);
    }

    public static double twoNorm(int[] arr, int[] benchmark) {
        // calculate 2-norm of the difference between two vectors
        if (arr.length != benchmark.length) {
            throw new IllegalArgumentException("Length not Match");
        }
        try {
            int squared_sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int diff = (arr[i] - benchmark[i]);  // get the difference
                squared_sum += diff * diff; // calculate squared error
            }
            return (Math.sqrt((double) squared_sum));
        } catch (IllegalArgumentException e) {
            System.out.println("Length not match here");
        }
        return 0;
    }

}

public static void main(String[] args) {
    int[] benchmark = {2, -1, 1};
    int[] elem1 = {3, 2, 2};
    int[] elem2 = {2, 1, 7};
    int[] elem3 = {1, 5};
    int[][] input = {elem1, elem2, elem3};
    calcTwoNorms(input, benchmark);
}