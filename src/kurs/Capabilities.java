package kurs;
/*
класс ВОЗМОЖНОСТИ/ОГРАНИЧЕНИЯ для участников
*/
import java.util.HashMap;
import java.util.Map;

public class Capabilities {
    //хэш-мап по ИД препятствия
    private final Map<String, Double> map;

    //конструктор
    Capabilities() {
        map = new HashMap<>();
    }

    //удаление
    public void del(String id) {
        map.remove(id);
    }

    //очистка
    public void clear() {
        map.clear();
    }

    //установка/назначение
    public void set(String id, double limit) {
        if (limit <= 0) {
            del(id);
            return;
        }
        map.put(id, limit);
    }

    //получение
    public double get(String id) {
        Double limit = map.get(id);
        return limit == null ? -1: limit;
    }
}
