package coding.challenge.magicindex;

/*
n개의 요소를 가진 정렬된 배열이 있습니다. 이 배열의 요소는 중복된 값을 가질 수 있습니다.
배열의 k번째 요솟값이 k일 때, k는 마법의 인덱스입니다. 첫 번째 마법의 인덱스를 검색하는
재귀 알고리즘을 작성하세요.
 */
public class MagicIndex {
    public static int find(int[] arr) {
        if (arr == null) {
            return -1;
        }

        return find(arr, 0 , arr.length -1);
    }

    private static int find(int[] arr, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return -1; // 유효 하지 않은 인덱스 반환
        }

        // 인덱스 개수를 반으로 줄입니다.
        int middleIndex = (startIndex + endIndex) / 2;

        // 중간 인덱스의 값을 확인합니다.
        int value = arr[middleIndex];

        // 값과 인덱스가 같다면 마법의 인덱스입니다.
        if (value == middleIndex) {
            return middleIndex;
        }

        // 배열의 왼쪽 영역을 검색합니다.
        int leftIndex = find(arr, startIndex, Math.min(middleIndex - 1, value));
        if (leftIndex >= 0) {
            return leftIndex;
        }

        // 배열의 오른쪽 영역을 검색합니다.
        return find(arr, Math.max(middleIndex + 1, value), endIndex);
    }
}
