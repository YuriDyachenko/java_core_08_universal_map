package kurs;

public class Main {

    public static void main(String[] args) {
        //участники
        Man man1 = new Man("Александр");
        man1.capabilities.set(Treadmill.id, 500);
        man1.capabilities.set(Wall.id, 2.2);

        Man man2 = new Man("Игорь");
        man2.capabilities.set(Treadmill.id, 200);
        man2.capabilities.set(Wall.id, 1.5);

        Cat cat1 = new Cat("Ананасик");
        cat1.capabilities.set(Treadmill.id, 30);
        cat1.capabilities.set(Wall.id, 1.2);

        Cat cat2 = new Cat("Непоседа");
        cat2.capabilities.set(Treadmill.id, 50);
        cat2.capabilities.set(Wall.id, 0.8);

        Robot robot1 = new Robot("R2D2");
        robot1.capabilities.set(Treadmill.id, 100);
        robot1.capabilities.set(Wall.id, 1.0);
        //для тестирования удаления
        robot1.capabilities.del(Wall.id);

        Robot robot2 = new Robot("C3PO");
        robot2.capabilities.set(Treadmill.id, 100);
        robot2.capabilities.set(Wall.id, 1.0);
        //для тестирования очистки
        robot2.capabilities.clear();
        //для тестирования удаления несуществующей возможности
        robot2.capabilities.del(Wall.id);

        //массив участников
        Participle[] participles = new Participle[6];
        participles[0] = man1;
        participles[1] = cat1;
        participles[2] = robot1;
        participles[3] = man2;
        participles[4] = cat2;
        participles[5] = robot2;

        //массив препятствий
        Obstructive[] obstructives = new Obstructive[4];
        obstructives[0] = new Treadmill(20);
        obstructives[1] = new Wall(0.5);
        obstructives[2] = new Treadmill(200);
        obstructives[3] = new Wall(1);

        //соревнование
        for (Participle p: participles) {
            System.out.println(p.toString());
            for (Obstructive o: obstructives) {
                if (!o.overcome(p)) {
                    break;
                }
            }
        }
    }
}
