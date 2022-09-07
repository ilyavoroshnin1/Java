package lesson20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class MultiMapImpt <K, V> extends HashMap<K, V> implements MultiMap <K, V> { // 1

    private HashMap<K, List<V>> multiMap = new HashMap<>();

    @Override
    public int countValues(K key) {
        return 0;
    }

    @Override
    public Iterator<V> valuesIterator(K key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        if (multiMap.containsKey(key)){
            List<V> values = multiMap.get(key);
            values.add(value);
            multiMap.put(key, values);
        }else {
            ArrayList<V> values = new ArrayList<>();
            values.add(value);
            multiMap.put(key, values);
        }

        return value;
    }
}

// 1 - параметризация, когда идет наслед-е и имплиментирование одновременно. "MultiMap" очень похож на обычный
// "HashMap", только у "MultiMap" у одного ключа несколько значений! Значения можно хранить в отдельной кол-ции. Потому идет
// наследование от "HashMap"
