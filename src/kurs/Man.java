package kurs;
/*
класс ЧЕЛОВЕК, реализует УЧАСТНИКА
*/
public class Man implements Participle {
    //имя
    private final String name;
    //возможности/ограничения
    public final Capabilities capabilities;

    //конструктор
    public Man(String name) {
        this.name = name;
        capabilities = new Capabilities();
    }

    //расширенное имя
    @Override
    public String toString() {
        return String.format("Человек %s:", name);
    }

    //получение возможности/ограничения по ИД препятствия
    @Override
    public double getCapability(String id) {
        return capabilities.get(id);
    }
}
