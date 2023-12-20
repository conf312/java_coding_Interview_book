package coding.challenge.coin;

/*
n센트의 금액이 있습니다.
쿼터(25), 다임(10), 니켈(5), 페니(1) 동전을 사용 하여
금액을 맞출 수 있는 모든 조합을 계산 하세요.
 */
public class Coins {
    public static int calculateChangeMemoization(int n) {
        int[] coins = {25, 10, 5, 1};
        int[][] cache = new int[n + 1][coins.length];
        return calculateChangeMemoization(n, coins, 0, cache);
    }

    private static int calculateChangeMemoization(int amount, int[] coins, int position, int[][] cache) {
        if (cache[amount][position] > 0) {
            return cache[amount][position];
        }
        if (position >= coins.length -1) {
            return 1;
        }

        int coin = coins[position];
        int count = 0;
        for (int i = 0; i * coin <= amount; i++) {
            int remaining = amount - i * coin;
            count += calculateChangeMemoization(remaining, coins, position + 1, cache);
        }

        cache[amount][position] = count;
        return count;
    }

}
