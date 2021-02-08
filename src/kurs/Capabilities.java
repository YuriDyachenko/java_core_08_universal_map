package kurs;

import java.util.HashMap;
import java.util.Map;

public class Capabilities {
    private final Map<Obstructive, Double> map;

    Capabilities() {
        map = new HashMap<>();
    }

    public void set(Obstructive obstructive, double limit) {
        if (obstructive == null || limit <= 0) {
            return;
        }
        for (Map.Entry<Obstructive, Double> item: map.entrySet()) {
            if (item.getKey().getClass() == obstructive.getClass()) {
                item.setValue(limit);
                return;
            }
        }
        map.put(obstructive, limit);
    }

    public double get(Obstructive obstructive) {
        if (obstructive == null) {
            return -1;
        }
        Double limit;
        for (Map.Entry<Obstructive, Double> item: map.entrySet()) {
            if (item.getKey().getClass() == obstructive.getClass()) {
                limit = item.getValue();
                if (limit == null) {
                    return -1;
                }
                return limit;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        if (map.size() == 0) {
            return "ничего не могу";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<Obstructive, Double> item: map.entrySet()) {
            if (stringBuilder.length() != 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(String.format("%s %.1f м", item.getKey().toString(), item.getValue()));
        }
        return stringBuilder.toString();
    }
}
