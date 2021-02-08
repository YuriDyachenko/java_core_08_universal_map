package kurs;
/*
класс РОБОТ, реализует УЧАСТНИКА
*/
public class Robot implements Participle {
    //имя
    private final String name;
    //возможности/ограничения
    public final Capabilities capabilities;

    //конструктор
    public Robot(String name) {
        this.name = name;
        capabilities = new Capabilities();
    }

    //расширенное имя
    @Override
    public String toString() {
        return String.format("Робот %s:", name);
    }

    //получение возможности/ограничения по ИД препятствия
    @Override
    public double getCapability(String id) {
        return capabilities.get(id);
    }
}
