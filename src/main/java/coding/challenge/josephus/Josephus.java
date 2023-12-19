package coding.challenge.josephus;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1번부터 n번까지 총 n명의 사람이 원형으로 모여있습니다.
 * 1명의 생존자만 남을 때까지 원의 임의의 위치로부터 매 k번째 자리에 위치한 사람은 죽어야 합니다.
 * 이때 생존자의 위치를 찾는 알고리즘을 작성하세요.
 * 이것을 요세푸스 문제라고 합니다.
 */
public class Josephus {
    static int josephus(int n, int k) {
        if (k <= 0 || n <= 0) {
            return -1;
        }

        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }

    // 큐 이용하기
    public static void printJosephus(int n, int k) {
        if (n <= 0 || k <= 0) {
            throw new IllegalArgumentException("The n and k numbers must be > 0");
        }

        Queue<Integer> circle = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        while (circle.size() != 1) {
            for (int i = 1; i <= k; i++) {
                int eliminated = circle.poll();
                if (i == k) {
                    System.out.println("Eliminated: " + eliminated);
                    break;
                }
                circle.add(eliminated);
            }
        }

        System.out.println("Using queue! Survivor: " + circle.peek());
    }

    public static void main(String[] args) {
        System.out.println(josephus(15, 3));
    }
}
