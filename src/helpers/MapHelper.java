package helpers;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapHelper {
    public Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {
        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        return result;
    }

    public <K, V> void printByNumber(Map<K, V> map, int number) {
        int count = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (count >= number) break;
            System.out.println(entry.getKey()
                    + " = " + entry.getValue());
            count++;
        }
    }
}
