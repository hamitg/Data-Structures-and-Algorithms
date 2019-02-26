import org.junit.Test;
import static org.junit.Assert.*;

public class MyCacheTest {
    @Test
    public void testMyCacheAddGet() {
        MyCache cache = new MyCache(10);
        cache.put(10, "hamit");
        cache.put(11, "Jack");
        assertEquals("hamit", cache.get(10));
        assertEquals("Jack", cache.get(11));
        assertEquals(null , cache.get(12));
    }

    @Test
    public void testMyCacheShouldEvictLeastAccessTime() {
        MyCache cache = new MyCache(1);
        cache.put(10, "hamit");
        cache.put(11, "Jack");
        assertEquals(null , cache.get(10));
        assertEquals("Jack", cache.get(11));
    }

    @Test
    public void testCacheShouldEvictLeastAccessTime() {
        Cache cache = new Cache(1);
        cache.put(10, "hamit");
        cache.put(11, "Jack");
        assertEquals(null , cache.get(10));
        assertEquals("Jack", cache.get(11));
    }

    @Test
    public void testMyCacheShouldEvictLeastAccessTimeSameKey() {
        MyCache cache = new MyCache(1);
        cache.put(10, "hamit");
        cache.put(10, "hamit");
        assertEquals("hamit" , cache.get(10));
    }

    @Test
    public void testCacheShouldEvictLeastAccessTimeSameKey() {
        Cache cache = new Cache(1);
        cache.put(10, "hamit");
        cache.put(10, "hamit");
        assertEquals("hamit" , cache.get(10));
    }

    @Test
    public void testMyCacheGetMany() {
        int size = 5000000;
        MyCache cache = new MyCache(size);
        fillCache(cache, size);
        for(int i = 0 ; i < size; i++){
            assertEquals(i, cache.get(i));
        }
    }


    private void fillCache(MyCache cache, int size) {
        for(int i = 0; i < size; i ++){
            cache.put(i, i);
        }
    }
}
