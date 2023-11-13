### 메모이제이션(하향식 동적 프로그래밍)
메서드에서 중복 작업을 제거할 때 사용하는 기법이다. 이 기법은 동일한 입력에 관해 메서드를 한 번만 호출하도록 보장한다. 이를 위해
메모이제이션은 주어진 입력에 관한 결과를 저장한다. 즉, 이미 계산된 입력을 계산하고자 메서드를 호출해야 할 때 메모이제이션이 저장된
결과를 반환하여 호출을 하지 않는다는 의미이다.

### 일반적인 피보나치 함수 - O(2ⁿ)
```java
int fibonacci(int k) {
    if (k <=1) {
        return k;
    }    
    return fibonacci(k - 2) + fibonacci(k - 1); 
}
```

### 메모이제이션 적용 피보나치 함수 - O(n)
```java
int fibonacci(int k , int[] cache) {
    if (k <= 1) {
        return k;
    } else if (cache[k] > 0) {
        return cache[k];
    }

    cache[k] = fibonacci(k - 2, cache) + fibonacci(k - 1, cache);

    return cache[k];
}
```