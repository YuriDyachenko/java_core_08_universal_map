package kurs;
/*
класс БЕГОВАЯ ДОРОЖКА, реализует ПРЕПЯТСТВИЕ
*/
public class Treadmill implements Obstructive{
    //статический ИД для поиска в таблице возможностей/ограничений
    public static final String id = Treadmill.class.getName();
    //длина дорожки
    private final double length;

    //конструктор сразу задает длину
    Treadmill(double length) {
        this.length = length;
    }

    //доступ к статическому ИД из объектов
    public String getId() {
        return id;
    }

    //преодолеть препятствие участником
    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   %s %.1f м", "беговая дорожка", length);
        //получаем значение возможности/ограничения по ИД
        double limit = participle.getCapability(this.getId());
        //если -1 - значит, не заявлялся для этого препятствия
        if (limit == -1) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        //если не может так далеко
        if (length > limit) {
            System.out.printf("%s: не добежал %.1f м\n", name,  length - limit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        //все ОК
        System.out.printf("%s: пробежал\n", name);
        return true;
    }
}
