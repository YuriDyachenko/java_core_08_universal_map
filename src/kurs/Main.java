package kurs;

public class Main {

    public static void main(String[] args) {
        //объекты препятствий по умолчанию, для установки возможностей участников
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();

        //массив участников
        Participle[] participles = new Participle[6];

        participles[0] = new Man("Иван");
        participles[0].setCapability(treadmill, 500);
        participles[0].setCapability(wall, 2.2);

        participles[1] = new Cat("Ананасик");
        participles[1].setCapability(treadmill, 30);
        participles[1].setCapability(wall, 1.2);

        participles[2] = new Robot("R2D2");
        participles[2].setCapability(treadmill, 100);

        participles[3] = new Man("Игорь");
        participles[3].setCapability(treadmill, 200);
        participles[3].setCapability(wall, 1.5);

        participles[4] = new Cat("Непоседа");
        participles[4].setCapability(treadmill, 50);
        participles[4].setCapability(wall, 0.8);

        participles[5] = new Robot("C3PO");
        participles[5].setCapability(treadmill, 200);

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
