package kurs;

public class Treadmill implements Obstructive{
    private final double length;

    Treadmill(double length) {
        this.length = length;
    }

    Treadmill() {
        length = 0;
    }

    @Override
    public String toString() {
        return "беговая дорожка";
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   %s %.1f м", toString(), length);
        double limit = participle.getCapability(this);
        if (limit == -1) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        if (length > limit) {
            System.out.printf("%s: не добежал %.1f м\n", name,  length - limit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        System.out.printf("%s: пробежал\n", name);
        return true;
    }
}
