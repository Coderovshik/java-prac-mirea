import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class Solution<T, K extends Comparable, V> {
    public ArrayList<T> newArrayList(T ...A) {
        ArrayList<T> result = new ArrayList();
        for (T a : A) {
            result.add(a);
        }

        return result;
    }

    public HashSet<T> newHashSet(T ...A) {
        HashSet<T> result = new HashSet<>();
        for (T a : A) {
            result.add(a);
        }

        return result;
    }

    public HashMap<K, V> newHashMap(K[] keys, V[] values) {
        HashMap<K, V> result = new HashMap<>();
        for (int i = 0; i < Math.min(keys.length, values.length); i++) {
            result.put(keys[i], values[i]);
        }

        return result;
    } 
}
