package kurs;

public class Wall implements Obstructive{
    private final double height;

    Wall(double height) {
        this.height = height;
    }

    Wall() {
        height = 0;
    }

    @Override
    public String toString() {
        return "стена";
    }

    @Override
    public boolean overcome(Participle participle) {
        String name = String.format("   %s %.1f м", toString(), height);
        double limit = participle.getCapability(this);
        if (limit == -1) {
            System.out.printf("%s: не умеет, переход к следующему препятствию\n", name);
            return true;
        }
        if (height > limit) {
            System.out.printf("%s: не допрыгнул %.1f м\n", name, height - limit);
            System.out.println("      выбыл из соревнований");
            return false;
        }
        System.out.printf("%s: перепрыгнул\n", name);
        return true;
    }
}
