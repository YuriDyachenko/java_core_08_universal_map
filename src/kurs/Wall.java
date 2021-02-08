package kurs;
/*
класс СТЕНА, реализует ПРЕПЯТСТВИЕ
*/
public class Wall implements Obstructive{
    //статический ИД для поиска в таблице возможностей/ограничений
    public static final String id = Wall.class.getName();
    //высота стены
    private final double height;

    //конструктор сразу задает высоту
    Wall(double height) {
        this.height = height;
    }

    //доступ к статическому ИД из объектов
    public String getId() {
        return id;
    }

    //преодолеть препятствие участником
    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   %s %.1f м", "стена", height);
        //получаем значение возможности/ограничения по ИД
        double limit = participle.getCapability(this.getId());
        //если -1 - значит, не заявлялся для этого препятствия
        if (limit == -1) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        //если не может так высоко
        if (height > limit) {
            System.out.printf("%s: не допрыгнул %.1f м\n", name, height - limit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        //все ОК
        System.out.printf("%s: перепрыгнул\n", name);
        return true;
    }
}
