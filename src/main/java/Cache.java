import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Cache<K, V> {

    LinkedHashMap<K, V> map;
    int capacity;
    public Cache(int capacity) {
        map = new LinkedHashMap<K, V>(capacity);
        this.capacity = capacity;
    }

    V get(K key) {
        return map.get(key);
    }

    void put(K key, V value) {
        map.put(key, value);
        if (map.size() >  capacity) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            it.next();
            it.remove();
        }
    }
}
