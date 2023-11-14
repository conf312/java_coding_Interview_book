package dp.tabulation;

public class Fibonacci {
    static int fibonacci(int k) {
        if (k <= 1) {
            return k;
        }

        int first = 1;
        int second = 0;
        int result = 0;

        for (int i = 1; i < k; i++) {
            result = first + second;
            second = first;
            first = result;
        }

        return result;
    }

    public static void main(String[] args) {
        int k = 10;
        System.out.println("value : " + fibonacci(k));
    }
}
