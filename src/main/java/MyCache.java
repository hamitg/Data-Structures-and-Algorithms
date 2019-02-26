import java.util.HashMap;


public class MyCache <K, V> {
    int capacity;

    HashMap<K, V> cache = new HashMap<K, V>();
    MyDoubleList<K> lastAccessTimes = new MyDoubleList<K>();
    HashMap<K, MyDoubleList.Node> keyNode = new HashMap<K, MyDoubleList.Node>();
    public MyCache(int capacity) {
        this.capacity = capacity;
    }

    public void put(K key, V value){
        if (shouldEvict(key)){
            evict();
        }
        updateLastAccessTime(key);
        cache.put(key, value);
    }

    public V get(K key){
        if (cache.containsKey(key)){
            updateLastAccessTime(key);
        }
        return cache.get(key);
    }

    private void evict() {
        K keyToRemove = lastAccessTimes.removeFirst();
        cache.remove(keyToRemove);
    }

    private boolean shouldEvict(K key) {
        return !cache.containsKey(key) && cache.size() >= capacity;
    }

    private void updateLastAccessTime(K key){
        if (keyNode.containsKey(key)) {
            MyDoubleList.Node node = keyNode.get(key);
            lastAccessTimes.delete(node);
        }
        lastAccessTimes.add(key);
    }
}
