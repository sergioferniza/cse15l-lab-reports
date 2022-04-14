public class Worksheet {

    public static void test(String[] arr) {
        if (arr.length > 10) {
            throw new IllegalArgumentException();
        }

        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        String[] input = {"a", null, "c"};
        test(input);
        int a = 10 / 0;
    }

}