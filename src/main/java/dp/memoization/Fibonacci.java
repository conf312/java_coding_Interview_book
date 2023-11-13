package dp.memoization;

public class Fibonacci {
    static int fibonacci(int k , int[] cache) {
        if (k <= 1) {
            return k;
        } else if (cache[k] > 0) {
            return cache[k];
        }

        cache[k] = fibonacci(k - 2, cache) + fibonacci(k - 1, cache);

        return cache[k];
    }
    public static void main(String[] args) {
        int k = 10;
        int[] cache = new int[k + 1];
        System.out.println("value : " + fibonacci(k, cache));
    }
}
