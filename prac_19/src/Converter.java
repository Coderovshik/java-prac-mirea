import java.util.ArrayList;

/**
 * Converter
 */
public class Converter {
    public static <T> ArrayList<T> convertToList(T[] A) {
        ArrayList<T> result = new ArrayList<T>();
        for (T a : A) {
            result.add(a);
        }

        return result;
    }
}