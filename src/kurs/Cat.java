package kurs;
/*
класс КОТ, реализует УЧАСТНИКА
*/
public class Cat implements Participle {
    //имя
    private final String name;
    //возможности/ограничения
    public final Capabilities capabilities;

    //конструктор
    public Cat(String name) {
        this.name = name;
        capabilities = new Capabilities();
    }

    //расширенное имя
    @Override
    public String toString() {
        return String.format("Кот %s:", name);
    }

    //получение возможности/ограничения по ИД препятствия
    @Override
    public double getCapability(String id) {
        return capabilities.get(id);
    }
}
