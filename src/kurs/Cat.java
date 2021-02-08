package kurs;

public class Cat implements Participle {
    private final String name;
    private final Capabilities capabilities;

    public Cat(String name) {
        this.name = name;
        capabilities = new Capabilities();
    }

    @Override
    public String toString() {
        return String.format("Кот %s: %s", name, capabilities.toString());
    }

    @Override
    public void setCapability(Obstructive obstructive, double limit) {
        capabilities.set(obstructive, limit);
    }

    @Override
    public double getCapability(Obstructive obstructive) {
        return capabilities.get(obstructive);
    }
}
