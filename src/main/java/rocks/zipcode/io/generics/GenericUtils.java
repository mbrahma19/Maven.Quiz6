package rocks.zipcode.io.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUtils {
    /**
     * @param collection - collection to be converted to an array
     * @param <T>        - type of collection
     * @return array with contents identical to `collection`
     */
    public static <T> T[] toArray(Collection<T> collection) {
        List<T> list = new ArrayList<>(collection);
        return (T[])list.toArray();
    }
}
