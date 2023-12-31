### 태뷸레이션(상향식 동적 프로그래밍)
하향식 접근법보다 직관적이다. 재귀 알고리즘은 기본적으로 종종 끝에서 시작해 역방향으로 작동하지만, 상향식 알고리즘은
앞에서 시작한다. 상향식 접근법은 재귀 알고리즘의 단점을 방지하고 공간 복잡도를 줄인다.

예를 들어 재귀 방식으로 fibonacci(k)를 계산할 때 k부터 시작해서 k-1, k-2와 같이 감소하며 0이 될 때까지 반복한다.
상향식 접근법에서는 0부터 시작해서 1, 2, ...와 같이 증가하며 k가 될 때 까지 반복한다.

```java
int fibonacci(int k) {
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
```
상향식 접근법은 호출 스택을 쌓을 때 재귀에 의해 부과되는 메모리 비용을 줄여주므로 재귀 알고리즘의 단점인 스택 오버플로 
에러가 발생할 수 있는 취약점을 제거한다.

### 평범한 재귀
실행시간이 O(2²), 공간 복잡도 O(n)

### 메모이제이션 재귀
실행시간이 O(n), 공간 복잡도 O(n)

### 평범한 재귀
실행시간이 O(n), 공간 복잡도 O(1)

