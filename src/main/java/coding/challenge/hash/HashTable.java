package coding.challenge.hash;

public class HashTable<K, V> {
    private static final int SIZE = 10;

    private static class HashEntry<K, V> {
        K key;
        V value;

        HashEntry<K, V> next;

        HashEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private final HashEntry[] entries = new HashEntry[SIZE];

    public void put(K key, V value) {
        int hash = getHash(key);
        final HashEntry hashEntry = new HashEntry(key ,value);

        if (entries[hash] == null) {
            entries[hash] = hashEntry;
        } else {
            HashEntry currentEntry = entries[hash];
            while (currentEntry.next != null) {
                currentEntry = currentEntry.next;
            }

            currentEntry.next = hashEntry;
        }
    }

    public V get(K key) {
        int hash = getHash(key);

        if (entries[hash] != null) {
            HashEntry currentEntry = entries[hash];

            // 항목 연결 리스트에서 주어진 키와 일치하는 항목을 검색합니다.
            while (currentEntry != null) {
                if (currentEntry.key.equals(key)) {
                    return (V) currentEntry.value;
                }

                currentEntry = currentEntry.next;
            }
        }

        return null;
    }

    private int getHash(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }
}
